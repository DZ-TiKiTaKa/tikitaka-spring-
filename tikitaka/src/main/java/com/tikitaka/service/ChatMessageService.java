package com.tikitaka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.tikitaka.model.ChatMember;
import com.tikitaka.model.ChatMessage;
import com.tikitaka.repository.ChatRepository;
import com.tikitaka.repository.ChatMessageRepository;

@Service
public class ChatMessageService {
	
	@Autowired
	private RedisTemplate<String,String> redisTemplate;

	@Autowired
	private ChatMessageRepository chatmessageRepository;

	public void insertMessage(ChatMessage data) {
		

	}
	
	public List<ChatMember> findByChatNo(ChatMember chatMember) {
		return chatmessageRepository.findByChatNo(chatMember);
	}
	
}
