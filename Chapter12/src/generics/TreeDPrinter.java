package generics;

public class TreeDPrinter<T extends Material> {	//제네릭클래스 생성. Object를 모두 T로 변환(type의 약자. 자료형 매개변수)

	private T material;		//어떤 타입이 들어오건 object로 변환되어 사용

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
