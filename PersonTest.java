package week3_day4;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Person p = new Person("김사람", 21);
	System.out.println(p.toString());
	
	
	//여러명
	// 객체배열
	Person[] arr = new Person[3];
	/*arr[0].name = "test";	
	System.out.println( arr[0].toString());
	에러발생, Person 객체가 생성된 것이 아님*/
	//arr[0]~arr[2]가 없으면 Person[] arr = new Person[3]은 빈껍데기;
	
	arr[0] = new Person("다니엘", 25);
	arr[1] = new Person("사랑이", 21);
	arr[2] = new Person("태희",28);
	
	System.out.println(arr[0].toString());
	System.out.println(arr[1].toString());
	System.out.println(arr[2].toString());
	
	for(int i=0; i< arr.length; i++) {
		
	}
	}
	
	

}
