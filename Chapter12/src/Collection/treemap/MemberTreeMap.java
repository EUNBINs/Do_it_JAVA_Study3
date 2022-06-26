package Collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

import Collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;//key�� ���̵�, value�� ���
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(),member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {		//KEY�� ���̺�ʾȿ� �ִ���
			
			treeMap.get(memberID);
			return true;
		}
		
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showALLMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
}
