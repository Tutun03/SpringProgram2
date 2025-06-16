package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.student;

//java based
@Configuration
public class SpringConfigFile {

//if we comapre springconfig with applicationContext.xml then in applicationContext bean is mentioned ,here we need to write @Bean 
//@Bean
	@Bean("stdentobj")
public student stdId1(){//bean object name stdId1
	student std=new student();
	std.setName("ratan");
	std.setRollno(10);
	std.setEmail("ratan@gmail.com");
	
	return std;
	
}
}
