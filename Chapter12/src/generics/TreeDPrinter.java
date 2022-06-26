package generics;

public class TreeDPrinter<T extends Material> {	//���׸�Ŭ���� ����. Object�� ��� T�� ��ȯ(type�� ����. �ڷ��� �Ű�����)

	private T material;		//� Ÿ���� ������ object�� ��ȯ�Ǿ� ���

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
