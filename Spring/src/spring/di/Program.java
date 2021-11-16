package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		/*�Ʒ��� ������ setting.xml�� ���ü��� �ѱ��
		 * Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam);
		console.setExam(exam);
		*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(spring.di.DiConfig.class);
		ExamConsole console=context.getBean(ExamConsole.class);
		
		console.print();
	}
}
