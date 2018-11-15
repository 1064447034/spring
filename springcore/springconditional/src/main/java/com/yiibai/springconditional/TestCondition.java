package com.yiibai.springconditional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class TestCondition {
	@Autowired(required=false)
	private DataSource dataSource;
	
	@Test
	public void testCondition() {
		assertNotNull(dataSource);
//		System.out.println(dataSource.getDataSource());
	}
}
