package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class TestEditor {
	
	@Autowired
	private  SpellChecker spellChecker;
	
	
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}



	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}



	public void spellCheck() {
		spellChecker.checkSpelling();
		
		
	}

}
