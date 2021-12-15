package com.tikitaka.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tikitaka.model.Chat;
import com.tikitaka.model.ChatMember;

@Repository
public class ChatRepository {

	
	@Autowired
	private SqlSession sqlSession;
	
	public boolean insert(Chat chatRoom) {
		return 1 == sqlSession.insert("chat.insert", chatRoom);
		

	}

	public Long findByChatNo(ChatMember chatMember) {
		return sqlSession.selectOne("chatmember.findByChatNo", chatMember);
	}
	
	

}
