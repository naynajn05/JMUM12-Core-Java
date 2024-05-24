package com.tnsif.multileveldemo;

//child 2 class
public class Word extends WordPad{
	
	private boolean spellCheckEnabled;

	public Word() {
		
		this.spellCheckEnabled = true;
	}
	
	public void spellCheck()
	{
		if (spellCheckEnabled)
		{
			System.out.println("Spell check already Enabled");
		}else
		{
			System.out.println("Spell check disabled");
		}
	}
	
	public void checkSpellFeature(boolean enable)
	{
		spellCheckEnabled=enable;
	}
	
	

}
