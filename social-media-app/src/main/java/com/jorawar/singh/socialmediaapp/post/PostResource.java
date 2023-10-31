package com.jorawar.singh.socialmediaapp.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostResource {
    @Autowired
    PostDaoService service;
    @GetMapping("/posts")
    public List<Post> getAll(){
        return service.findAll();
    }

    @GetMapping("/posts/filtered")
    public MappingJacksonValue getAllFilteredData(){
        return service.findFilteredData();
    }
}
