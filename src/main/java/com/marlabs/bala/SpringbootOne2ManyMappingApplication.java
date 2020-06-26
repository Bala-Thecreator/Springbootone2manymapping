package com.marlabs.bala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marlabs.bala.Repository.PostRepository;
import com.marlabs.bala.entity.Comment;
import com.marlabs.bala.entity.Post;

@SpringBootApplication
public class SpringbootOne2ManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOne2ManyMappingApplication.class, args);
	}
	
	@Autowired
    private PostRepository postRepository;


    @Override
    public void run(String...args) throws Exception {

        Post post = new Post("one to many mapping using JPA and hibernate", "one to many mapping using JPA and hibernate");

        Comment comment1 = new Comment("Very useful");
        Comment comment2 = new Comment("informative");
        Comment comment3 = new Comment("Great post");

        post.getComment().add(comment1);
        post.getComment().add(comment2);
        post.getComment().add(comment3);

        this.postRepository.save(post);
    }

}
