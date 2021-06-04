package com.example.springboot.email;

public interface EmailSender {
	
	void send(String to, String email);
}
