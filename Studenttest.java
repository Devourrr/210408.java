package week3_day4;

import java.util.Scanner;

public class Studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�̸�, ����, ����
		
		String name;
		int kor, eng;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("�̸�:");name = sc.next();
		System.out.print("����:");kor =  sc.nextInt();
		System.out.print("����:");eng = sc.nextInt();
		
		Student2 s = new Student2(name, kor, eng);
		s.calcAll();
		System.out.println(s.toString());
		
		
	}

}
