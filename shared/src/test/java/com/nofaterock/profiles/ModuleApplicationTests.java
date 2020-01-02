package com.nofaterock.profiles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author 한승룡
 * @since 2019-04-17
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ModuleApplicationTests {

	@Autowired
	private SharedModule sharedModule;

	@Value("${name}")
	private String name;

	@Test
	public void contextLoads() {
		System.out.println(sharedModule.getName());
		System.out.println(name);
	}

}
