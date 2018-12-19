package com.yiibai.springXmlConfigImportJavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
	@Autowired
	private CompactDisc cd;

	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
    public void play() {
		cd.play();
	}
}
