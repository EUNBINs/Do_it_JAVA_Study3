package generics;

public class TreeDPrinterTest {	

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();		//<Powder> ����
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();	//(powder)���� ������ object�� powder�� �޾ұ� ������ (�ٿ�ĳ����)	//<>�����߱� ������ ����
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();		//<Powder> ����
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();	//(powder)���� ������ object�� powder�� �޾ұ� ������ (�ٿ�ĳ����)	//<>�����߱� ������ ����
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
			

	}
 
}
