package week3_day4;

public class Student {
	String name;
	int kor;
	int eng;
	int sum;
	double avg; // 속성 = 필드 = 멤버변수 = 항목 in Student class
	char grade; //문자 하나 저장할 수 있는 변수 ''
	
	//기본생성자
	public Student() {	
		
	}
	// 초기화 담당
	public Student(String name, int kor, int eng) {	
		this.name = name; //멤버변수를 넣어줌?
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
	
	public String toString() {	//학생 정보 반환 메서드 '템플릿메서드'
		return name +"\t"+ kor +"\t"+ eng +"\t"+ +sum +"\t"+ avg +
				"\t"+ grade;
	}
}
