package com.mkxrs.ollama_api.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkxrs.ollama_api.dto.ChatRequest;
import com.mkxrs.ollama_api.service.ChatService;




@RestController
public class ChatController {
	 private final ChatService chatService;

	    public ChatController(ChatService chatService) {
	        this.chatService = chatService;
	    }
	
	
	//using @GetMapping to mention the URL route of /chat, hardcoding the result as of now. 
//		@GetMapping("/chat")
		@PostMapping("/chat")
		public String reply(@RequestBody ChatRequest request) {
		    long start = System.nanoTime();

		    String response = chatService.reply(
		            request.getMessage(),
		            request.getConversationId()
		    );

		    long end = System.nanoTime();
		    long durationMs = (end - start) / 1_000_000;

		    System.out.println("reply() execution time: " + durationMs + " ms"); //avg 600 to 670ms on ollama meta llama3.2 

		    return response;
		}

}
