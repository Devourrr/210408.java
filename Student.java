package week3_day4;

public class Student {
	String name;
	int kor;
	int eng;
	int sum;
	double avg; // �Ӽ� = �ʵ� = ������� = �׸� in Student class
	char grade; //���� �ϳ� ������ �� �ִ� ���� ''
	
	//�⺻������
	public Student() {	
		
	}
	// �ʱ�ȭ ���
	public Student(String name, int kor, int eng) {	
		this.name = name; //��������� �־���?
		this.kor = kor;
		this.eng = eng;
		
	}
	
	private void calcSum() {
		sum = kor + eng;
	}
	private void calcAvg( ) {
		avg = sum/2.0;
	}
	private void calcGrade( ) {
		if( avg >= 90) {
			grade='A';
			
		}else if( avg>=80) {
			grade='B';
			
		}else if( avg>=70) {
			grade= 'C';
		}else {
			grade= 'F';
		}
	}
	
	public String toString() {	//�л� ���� ��ȯ �޼��� '���ø��޼���'
		return name +"\t"+ kor +"\t"+ eng +"\t"+ +sum +"\t"+ avg +
				"\t"+ grade;
	}
}
