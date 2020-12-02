import Classes.BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogPosts =new ArrayList<>();

    public void addPost(String authorName, String title, String text, String publicationDate){
        blogPosts.add(new BlogPost(authorName,title,text,publicationDate));
    }
    public void delete(int number){
        blogPosts.remove(number);
    }
    public void update(int number, BlogPost blogPost){
        blogPosts.get(number).authorName=blogPost.authorName;
        blogPosts.get(number).title=blogPost.title;
        blogPosts.get(number).text=blogPost.text;
        blogPosts.get(number).publicationDate=blogPost.publicationDate;

    }
}
