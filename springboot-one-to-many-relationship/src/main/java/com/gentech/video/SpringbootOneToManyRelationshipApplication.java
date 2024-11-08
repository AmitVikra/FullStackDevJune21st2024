package com.gentech.video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.video.entity.Comment;
import com.gentech.video.entity.VideoPost;
import com.gentech.video.repository.CommentRepository;
import com.gentech.video.repository.VideoPostRepository;

@SpringBootApplication
public class SpringbootOneToManyRelationshipApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToManyRelationshipApplication.class, args);
	}

	@Autowired
	private VideoPostRepository videoRepo;
	
	@Autowired
	private CommentRepository commentRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		VideoPost post=new VideoPost("USA Election 2024", 
				"International Politics", "USA Election Results 2024 Live Updates");
		
		Comment comment1 = new Comment("Positive", "X Partly will gain more number of Seats");
		Comment comment2 = new Comment("Negative", "Y Partly may loose this time");
		Comment comment3 = new Comment("Positive", "Z Partly will get more seats in California");
		
		post.getComment().add(comment1);
		post.getComment().add(comment2);
		post.getComment().add(comment3);
		
		//Save Video Post
		videoRepo.save(post);
	}

}
