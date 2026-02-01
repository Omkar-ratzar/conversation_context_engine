package com.mkxrs.ollama_api.dto;

public class ChatRequest {

	private String message;
	public String getMessage() {
        return message;
    }
	public void setMessage(String message) {
        this.message = message;
    }
	private String conversationId;
	public String getConversationId() {
        return conversationId;
    }
	public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
	
}
