package com.workshopspringbootmongodb.services;

import com.workshopspringbootmongodb.domain.Post;
import com.workshopspringbootmongodb.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> newPost = postRepository.findById(id);
        return postRepository.findById(id).get();
    }
}
