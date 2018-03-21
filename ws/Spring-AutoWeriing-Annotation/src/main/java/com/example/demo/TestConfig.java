package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean
	public SpellChecker spellCheckBean() {
		return new SpellChecker();
		
	}
	
	@Bean
	public TestEditor testEditorBean() {
		return new TestEditor();
		
	}
}
