package week3_day4;

public class Student2 {
	String name;
	int kor;
	int eng;
	int sum;
	double avg;
	char grade;  //문자 하나 저장할 수 있는 변수    '  ' 
	
	//기본생성자
	public  Student2() {	
		
	}	
	// 초기화 담당 
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
	// 템플릿 메서드
	public void calcAll() {
		calcSum();
		calcAvg();
		calcGrade();		
	}
	
	public String toString() {
		return name +"  " + kor+ "  " +  eng+ "   "+  sum + "   " +avg +"  " + grade;
	}		 
}
