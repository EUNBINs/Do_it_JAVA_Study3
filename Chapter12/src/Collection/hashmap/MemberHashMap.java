package Collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import Collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;//key는 아이디, value는 멤버
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(),member);
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {		//KEY가 테이블맵안에 있느냐
			
			hashMap.get(memberID);
			return true;
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
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
