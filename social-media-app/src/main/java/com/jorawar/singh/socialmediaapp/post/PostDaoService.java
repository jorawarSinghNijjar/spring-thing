package com.jorawar.singh.socialmediaapp.post;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.jorawar.singh.socialmediaapp.user.User;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostDaoService {
    private static List<Post> posts = new ArrayList<>();

    static {
        posts.add(new Post("First Post", "Aman"));
        posts.add(new Post("Second Post", "Aman"));
        posts.add(new Post("Third Post", "Aman"));

    }
    public List<Post> findAll(){
        System.out.println(posts.get(0).toString());
        return posts;
    }

    public MappingJacksonValue findFilteredData() {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(posts);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","content");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("OnlyContent", filter);
        mappingJacksonValue.setFilters(filterProvider);

        return mappingJacksonValue;
    }
}
