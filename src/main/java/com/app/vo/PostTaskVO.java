package com.app.vo;

import java.util.Objects;

public class PostTaskVO {
	private Long id;
	private String postTitle;
	private String postContent;
	
	public PostTaskVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return postTitle;
	}

	public void setTitle(String title) {
		this.postTitle = title;
	}

	public String getContent() {
		return postContent;
	}

	public void setContent(String content) {
		this.postContent = content;
	}

	@Override
	public String toString() {
		return "PostTaskVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostTaskVO other = (PostTaskVO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
