package com.gentech.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.video.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
