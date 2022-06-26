package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);		//false
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);		//true

		String str5 = new String("java");
		String str6 = new String("android");
		
		System.out.println(System.identityHashCode(str5));
		str5 = str5.concat(str6);		// 계속 연결하면 gabage가 생김
		
		System.out.println(str5);
		System.out.println(System.identityHashCode(str5));	//두개의 문자열을 연결하면 새로운 인스턴스가 생성된다는 증거
	}

}
