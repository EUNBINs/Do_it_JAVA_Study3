package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	 InClass inClass;
	
	public OutClass() {
		inClass = new InClass();

	}
	
	class InClass {
		int inNum = 200;
		//static int sInNum = 100;	=>���� static ������ inclass���� ����� �� ����
	
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			
		}		
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
			
		}
		
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum);		����
			System.out.println(sInNum);
		
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {

		/*OutClass outClass = new OutClass();
		outClass.usingInTest();
		*/
		
	}

}
