package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
//	@Autowired
//	private ApplicationContext context;
//
//	@Rule
//	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
//	
//	@Test
//	public void play() {
//		CompactDisc compactDisc = (CompactDisc)context.getBean(BlankDisc.class);
//		compactDisc.play();
//		
//		MediaPlayer cdPlayer = (MediaPlayer)context.getBean(CDPlayer.class);
//		cdPlayer.play();
//		assertEquals("helloworld1111122222333334444455555", log.getLog());
}
