package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
@Component
public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole(){
	
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
	System.out.printf("total is %d avg is %f",exam.total(),exam.avg());
	}
	
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
