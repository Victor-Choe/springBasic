package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;


//���� ���Ϸ� ��ü
@ComponentScan("spring.di.ui")
@Configuration
public class DiConfig {
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
