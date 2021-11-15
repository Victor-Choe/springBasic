package spring.di.entity;

public class NewlecExam implements Exam {

	private int kor;
	private int math;
	private int eng;
	private int com;
	
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

}
