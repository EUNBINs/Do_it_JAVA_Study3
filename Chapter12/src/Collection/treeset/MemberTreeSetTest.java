package Collection.treeset;

import Collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberKang = new Member(103, "강감찬");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showALL();
		

	}

}
