package com.mkxrs.ollama_api.dto;

public class Message {
	private String role;
	public String getRole() {
        return role;
    }
	public void setRole(String role) {
        this.role = role;
    }
	
	private String content;
	public String getContent() {
        return content;
    }
	public void setContent(String content) {
        this.content = content;
    }
}
