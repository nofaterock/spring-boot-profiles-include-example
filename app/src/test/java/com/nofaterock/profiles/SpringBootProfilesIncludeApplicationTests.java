package com.nofaterock.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 한승룡
 * @since 2019-04-17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootProfilesIncludeApplicationTests {

	@Autowired
	private SharedModule sharedModule;

	@Test
	public void contextLoads() {
		System.out.println(sharedModule.getName());
	}

}
