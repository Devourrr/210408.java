package week3_day4;

//�����ε�
//������, �޼��� �̸��� �Ȱ��� �޼��带 ������ ���� �� �ִ� ��
// �̸��� ���ſ� ����
//System.out.println();
//System.out.println(30); => println(int a)
//System.out.println(30.2); => println(double a)
//Syetem.out.println("hello"); => println(String a)

// ������ ���� �޽��� = > ���� �ٸ��� �����ϴ� ��
// �����(println) => ���� �ش��ϴ� println() ȣ��
// �����ε� ��Ģ, �ݵ�� �ް����� ������ �޶�� ��, ��ȯ���� �������

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
