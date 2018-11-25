package org.ApplicationContextAware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Hello world!
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationContextConfig.class})
public class App 
{
	@Test
	public void testGetBean() {
		TestBean testBean = ((TestBean) SpringContextHolder.getBean("testBean"));
		if (testBean != null) {
			System.out.println(testBean.getName());
		}
	}
}
