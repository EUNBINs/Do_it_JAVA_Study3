package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		Class pClass1 = person.getClass();		// 1��° ���
	
		System.out.println(pClass1.getName());
	
		Class pClass2 = Person.class; 			//2��° ���
		System.out.println(pClass2.getName());
		
		Class pClass3  = Class.forName("classex.Person");		//3��° ���
		System.out.println(pClass1.getName());
		
	}

}
