package org.studentapp.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.studentapp.bean.Student;

@Configurable
public class BeanFactory {
	@Bean
	public Student getStudentBean() {
		return new Student();
		
	}

}
