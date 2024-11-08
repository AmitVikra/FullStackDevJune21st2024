package com.gentech.video.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_videoposts")
public class VideoPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "posted_id")
	private Long postedId;
	
	@Column(name = "video_title")
	private String videoTitle;
	@Column(name = "video_type")
	private String videoType;
	@Column(name = "video_description")
	private String VideoDesciption;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "post_comment_id", referencedColumnName = "posted_id")
	private List<Comment> comment=new ArrayList<>();


	public VideoPost() {
		
	}
	
	public VideoPost(String videoTitle, String videoType, String videoDesciption) {
		super();
		this.videoTitle = videoTitle;
		this.videoType = videoType;
		VideoDesciption = videoDesciption;
	}

	public VideoPost(String videoTitle, String videoType, String videoDesciption, List<Comment> comment) {
		super();
		this.videoTitle = videoTitle;
		this.videoType = videoType;
		VideoDesciption = videoDesciption;
		this.comment = comment;
	}
	public Long getPostedId() {
		return postedId;
	}
	public void setPostedId(Long postedId) {
		this.postedId = postedId;
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	public String getVideoDesciption() {
		return VideoDesciption;
	}
	public void setVideoDesciption(String videoDesciption) {
		VideoDesciption = videoDesciption;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
}
