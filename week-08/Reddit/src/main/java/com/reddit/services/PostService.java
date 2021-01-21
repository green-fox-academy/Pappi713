package com.reddit.services;

import com.reddit.model.Post;
import com.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public void upvote_post(Long ID) {
        Optional<Post> optionalPost = postRepository.findById(ID);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setScore(post.getScore() + 1);
            Post updatedpost = post;
            postRepository.save(updatedpost);
        }
    }

    public void downvote_post(Long ID) {
        Optional<Post> optionalPost = postRepository.findById(ID);
        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            post.setScore(post.getScore() - 1);
            Post updatedpost = post;
            postRepository.save(updatedpost);
        }
    }

    public List<Post> orderedPostListByScore(List<Post> postList) {
        List<Post> orderedList = new ArrayList<>();
        orderedList = postList.stream().sorted((o1, o2) -> o2.getScore().compareTo(o1.getScore()) == 0 ?
                o1.getID().compareTo(o2.getID()) : o2.getScore().compareTo(o1.getScore())).collect(Collectors.toList());
        return orderedList;
    }

    public Post show(Long ID) {
        Optional<Post> optionalPost = postRepository.findById(ID);
        Post post = new Post();
        if (optionalPost.isPresent()) {
            post = optionalPost.get();

        }
        return post;
    }

    public Timestamp getPostedTime(){

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }

    public Post addPost(Post post){
        post.setPostedTime(getPostedTime());
        return post;
    }

    public List<Integer> numberOfpages(){
        List<Integer> numbers=new ArrayList<>();
        List<Post> postlist= (List<Post>) postRepository.findAll();
        Integer numberOfPost=postlist.size();
        int counter=1;
        for(int i=0; i<numberOfPost;i++){
            if(i%4==0){
                numbers.add(counter);
                counter++;
            }
        }
        return numbers;
    }


    public List<Post> limit(Integer number){
        List<Post> postlist= orderedPostListByScore((List<Post>) postRepository.findAll());
        postlist=postlist.stream().skip(number*4).limit(4).collect(Collectors.toList());
        return postlist;
    }

}
