package com.autowired;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	   private SpellChecker spellChecker;

	   @Autowired //property di
	   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
	   public SpellChecker getSpellChecker( ) {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}

