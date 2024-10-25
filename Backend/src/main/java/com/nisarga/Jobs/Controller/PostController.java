package com.nisarga.Jobs.Controller;

import com.nisarga.Jobs.Repository.PostRepository;
import com.nisarga.Jobs.Repository.SearchRepository;
import com.nisarga.Jobs.modal.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class PostController
{
    @Autowired
   private  PostRepository repo;
    @Autowired
    private SearchRepository srepo;

    @GetMapping("/")
    public String redirect()
    {
        return "Welcome to job portal";
    }

    @GetMapping("/allposts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findBySearch(text);
    }
    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post)
    {
        return repo.save(post);
    }

}
