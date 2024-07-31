package com.lchalela.curso.spring.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lchalela.curso.spring.ai.model.Answer;
import com.lchalela.curso.spring.ai.model.Question;
import com.lchalela.curso.spring.ai.service.OpenAiService;

@RestController
public class QuestionController {
 
	@Autowired
	private OpenAiService openService;
	
	@PostMapping("/ask")
	public Answer askQuestion(Question question) {
		return this.openService.getAnswer(question);
	}
}
