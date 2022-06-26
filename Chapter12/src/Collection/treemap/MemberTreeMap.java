package Collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

import Collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;//key는 아이디, value는 멤버
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(),member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {		//KEY가 테이블맵안에 있느냐
			
			treeMap.get(memberID);
			return true;
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
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
