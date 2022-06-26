package Collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import Collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;//key�� ���̵�, value�� ���
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(),member);
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {		//KEY�� ���̺�ʾȿ� �ִ���
			
			hashMap.get(memberID);
			return true;
		}
		
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showALLMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
