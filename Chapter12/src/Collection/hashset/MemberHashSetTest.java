package Collection.hashset;

import Collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberKang = new Member(103, "������");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showALL();
		
		Member memberLee2 = new Member(101, "�̸���");
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showALL();

	}

}
