package org.InitializingBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes={InitializingBeanConfig.class})
//public class App
//{
//	@Autowired
//	private TestInitializingBean bean;
//	
//	@Test
//	public void test() {
//    	bean.testInit();
//    }
//}

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitializingBeanConfig.class); 
		TestInitializingBean testBean = context.getBean(TestInitializingBean.class);
		testBean.testInit();
		context.close();
	}
}
