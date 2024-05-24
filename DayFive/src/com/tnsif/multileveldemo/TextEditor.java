package com.tnsif.multileveldemo;

public class TextEditor {

	public static void main(String[] args) {
		Word word=new Word();
		
		word.write("Good Morning all!!");
		word.formatText(true);
		word.displayData();
		word.spellCheck();
		word.checkSpellFeature(false);
		
		word.displayData();
	}

}
