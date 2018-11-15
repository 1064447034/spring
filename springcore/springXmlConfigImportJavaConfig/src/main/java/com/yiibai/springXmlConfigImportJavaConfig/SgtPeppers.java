package com.yiibai.springXmlConfigImportJavaConfig;

public class SgtPeppers implements CompactDisc {
	private String title = "Sgt.Peppers's Lonely Hearts Club Band.";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.println("Playing " + title + " by" + artist);
	}
}
