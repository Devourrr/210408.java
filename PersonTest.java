package week3_day4;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Person p = new Person("����", 21);
	System.out.println(p.toString());
	
	
	//������
	// ��ü�迭
	Person[] arr = new Person[3];
	/*arr[0].name = "test";	
	System.out.println( arr[0].toString());
	�����߻�, Person ��ü�� ������ ���� �ƴ�*/
	//arr[0]~arr[2]�� ������ Person[] arr = new Person[3]�� �󲮵���;
	
	arr[0] = new Person("�ٴϿ�", 25);
	arr[1] = new Person("�����", 21);
	arr[2] = new Person("����",28);
	
	System.out.println(arr[0].toString());
	System.out.println(arr[1].toString());
	System.out.println(arr[2].toString());
	
	for(int i=0; i< arr.length; i++) {
		
	}
	}
	
	

}
