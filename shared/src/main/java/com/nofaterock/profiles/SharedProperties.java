package com.nofaterock.profiles;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 한승룡
 * @since 2019-04-17
 */
@Getter
@Setter
@Component
public class SharedProperties {

	@Value("${name}")
	private String name;

}
