package com.lchalela.curso.spring.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lchalela.curso.spring.ai.model.Answer;
import com.lchalela.curso.spring.ai.model.Question;

@Service
public class OpenAiServiceImpl implements OpenAiService {
	
	@Autowired
	private  ChatClient chatClient;
	
	@Override
	public String getAnswer(String question) {
		PromptTemplate promptTemple = new PromptTemplate(question);
		Prompt promt = promptTemple.create();
		return chatClient.call(promt).getResult().getOutput().getContent();
	}

	@Override
	public Answer getAnswer(Question question) {
		PromptTemplate promptTemple = new PromptTemplate(question.question());
		Prompt promt = promptTemple.create();
		return new Answer( chatClient.call(promt).getResult().getOutput().getContent());
	}

}
