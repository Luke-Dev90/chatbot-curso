package com.lchalela.curso.spring.ai.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lchalela.curso.spring.ai.service.OpenAiService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
public class OpenAiServiceImplTest {
	 private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OpenAiServiceImplTest.class);

	@Autowired
	OpenAiService openAiService;
	
	 @Test
	 void getAnswer() {
		 String dialog = this.openAiService.getAnswer("Saludame diciendome hola gran señor lucas");
		 log.info("OUTPUT ##############");
		 log.info(dialog);
	 }
}
