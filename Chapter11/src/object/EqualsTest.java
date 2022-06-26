package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
	}

	@Override
	public boolean equals(Object obj) {		//equal() 메서드 재정의
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) 		//재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
				return true;
			else 
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
	
}
public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);		//두 인스턴스 주소값이 같은지 비교하여 출력
		System.out.println(str1.equals(str2)); 		//string 클래스의 equals()메서드 사용, 두 인스턴스 문자열값이 같은지 비교하여 출력
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);		// 두 인스턴스 주소값이 같은지 비교하여 출력
		System.out.println(std1.equals(std2));		// lnteger 클래스의 equals()메서드 사용. 두 인스턴스 정수값이 같은지 비교하여 출력
		
		
		System.out.println(std1.hashCode());	//Student(10001)의 해시코드 값 출력
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
