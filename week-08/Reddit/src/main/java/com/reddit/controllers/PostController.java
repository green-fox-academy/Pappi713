package com.reddit.controllers;

import com.reddit.model.Post;
import com.reddit.repositories.PostRepository;
import com.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class PostController {

    private PostRepository postRepository;
    private PostService postService;

    @Autowired
    public PostController(PostRepository postRepository, PostService postService) {
        this.postRepository = postRepository;
        this.postService = postService;

    }


    @GetMapping("/")
    public String list(Model model, @RequestParam(required = false, defaultValue = "1") String number) {

        List<Post> postList = (List<Post>) postRepository.findAll();
        if (number == null) {
            postList = postService.orderedPostListByScore(postList).stream().skip(0).limit(4).collect(Collectors.toList());
        } else {
            Integer selector = Integer.parseInt(number);
            postList = postService.limit(selector - 1);
        }
        model.addAttribute("postlist", postList);
        model.addAttribute("numberOfPagesList", postService.numberOfpages());
        model.addAttribute("pagenumber", number);
        model.addAttribute("number", number);
        return "index";
    }

    @GetMapping("/add")
    public String addPostGet() {
        return "add-post";
    }

    @PostMapping("/add")
    public String addPostPost(@ModelAttribute Post post) {
        postRepository.save(postService.addPost(post));
        return "redirect:/";
    }

    @GetMapping("/upvote/{ID}")
    public String upvote(@PathVariable Long ID, @RequestParam String pageNumber) {
        postService.upvote_post(ID);
        return "redirect:/?number=" + pageNumber;
    }

    @GetMapping("/downvote/{ID}")
    public String downvote(@PathVariable Long ID, @RequestParam String pageNumber) {
        postService.downvote_post(ID);
        return "redirect:/?number=" + pageNumber;
    }

    @GetMapping("/show/{ID}")
    public String showPost(@PathVariable Long ID, Model model) {
        model.addAttribute("post", postService.show(ID));
        return "show-post";
    }

}
