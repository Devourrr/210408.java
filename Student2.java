package week3_day4;

public class Student2 {
	String name;
	int kor;
	int eng;
	int sum;
	double avg;
	char grade;  //���� �ϳ� ������ �� �ִ� ����    '  ' 
	
	//�⺻������
	public  Student2() {	
		
	}	
	// �ʱ�ȭ ��� 
	public  Student2(String name, int kor, int eng ) {	
		this.name = name;
		this.kor = kor;
		this.eng = eng;		
	}
	private void calcSum() {
		sum = kor+ eng;
	}
	
	private void calcAvg() {
		avg = sum/2.0;
	}	
	
	private void calcGrade() {
		
		if( avg >=90) {
			grade='A';
		}else if( avg>=80) {
			grade='B';
		}else if( avg>=70) {
			grade='C';
		}else {
			grade='F';
		}		
	}
	// ���ø� �޼���
	public void calcAll() {
		calcSum();
		calcAvg();
		calcGrade();		
	}
	
	public String toString() {
		return name +"  " + kor+ "  " +  eng+ "   "+  sum + "   " +avg +"  " + grade;
	}		 
}
