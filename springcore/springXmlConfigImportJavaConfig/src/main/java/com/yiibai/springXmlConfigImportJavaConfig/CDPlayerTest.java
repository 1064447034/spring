package com.yiibai.springXmlConfigImportJavaConfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/applicationContext.xml"})

public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
		cd.play();
	}
	
	@Test
	public void play() {
		assertNotNull(player);
		player.play();
	}
}
