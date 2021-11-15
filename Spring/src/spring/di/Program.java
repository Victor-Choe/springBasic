package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		/*아래의 라인은 setting.xml로 지시서로 넘기기
		 * Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam);
		console.setExam(exam);
		*/
		
		ApplicationContext context =
		new ClassPathXmlApplicationContext("spring/di/setting.xml");
				ExamConsole console=context.getBean(ExamConsole.class);
		
		console.print();
	}
}
