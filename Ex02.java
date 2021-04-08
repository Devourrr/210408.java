package week3_day4;

//오버로딩
//생성자, 메서드 이름이 똑같은 메서드를 여러개 가질 수 있는 것
// 이름이 무거운 상태
//System.out.println();
//System.out.println(30); => println(int a)
//System.out.println(30.2); => println(double a)
//Syetem.out.println("hello"); => println(String a)

// 다형성 제공 메시지 = > 각각 다르게 수행하는 것
// 출력해(println) => 각각 해당하는 println() 호출
// 오버로딩 규칙, 반드시 메개변수 정보가 달라야 함, 반환값은 상관없음

class Calc{
	
	int addInt( int x, int y ) {
		return x+y;
	}
	double addDouble (double x ,double y) {
		return x+y;
	}
}


class Calc2{
	
	int add( int x, int y ) {
		return x+y;
	}
	double add (double x ,double y) {
		return x+y;
	}
}


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c = new Calc();
		System.out.println(c.addInt(10,2));
		System.out.println(c.addDouble(10.2,2.4));
		
		Calc2 c2 = new Calc2();
		System.out.println(c2.add(10,2));
		System.out.println(c2.add(10.2, 2.4));
	}

}
