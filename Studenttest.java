package week3_day4;

import java.util.Scanner;

public class Studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름, 국어, 영어
		
		String name;
		int kor, eng;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름:");name = sc.next();
		System.out.print("국어:");kor =  sc.nextInt();
		System.out.print("수학:");eng = sc.nextInt();
		
		Student2 s = new Student2(name, kor, eng);
		s.calcAll();
		System.out.println(s.toString());
		
		
	}

}
