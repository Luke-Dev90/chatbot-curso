package com.lchalela.curso.spring.ai.service;

import org.springframework.stereotype.Service;

import com.lchalela.curso.spring.ai.model.Answer;
import com.lchalela.curso.spring.ai.model.Question;

@Service
public interface OpenAiService {
	String getAnswer(String question);
	Answer getAnswer(Question question);
}
