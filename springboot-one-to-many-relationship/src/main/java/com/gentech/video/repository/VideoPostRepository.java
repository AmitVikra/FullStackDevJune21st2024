package com.gentech.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.video.entity.VideoPost;

public interface VideoPostRepository extends JpaRepository<VideoPost, Long>{

}
