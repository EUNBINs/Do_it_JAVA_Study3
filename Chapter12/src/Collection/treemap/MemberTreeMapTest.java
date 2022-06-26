package Collection.treemap;

import Collection.Member;
import Collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeMap = new MemberTreeSet();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberKang = new Member(103, "강감찬");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberKang);
		
		memberTreeMap.showALL();
		
		/*memberTreeMap.removeMember(102);
		memberTreeMap.showALL(); */

	}

}
