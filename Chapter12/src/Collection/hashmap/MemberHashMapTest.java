package Collection.hashmap;

import Collection.Member;
import Collection.treeset.MemberTreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberTreeSet memberHashMap = new MemberTreeSet();
		
		Member memberLee = new Member(102, "�̼���");
		Member memberKim = new Member(101, "������");
		Member memberKang = new Member(103, "������");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showALL();
		
		memberHashMap.removeMember(102);
		memberHashMap.showALL();

	}

}
