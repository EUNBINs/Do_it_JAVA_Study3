package generics;

public class TreeDPrinterTest {	

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();		//<Powder> 선언
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();	//(powder)적은 이유는 object를 powder로 받았기 때문에 (다운캐스팅)	//<>선언했기 때문에 지움
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();		//<Powder> 선언
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();	//(powder)적은 이유는 object를 powder로 받았기 때문에 (다운캐스팅)	//<>선언했기 때문에 지움
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
			

	}
 
}
