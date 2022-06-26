package Collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import Collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempID = member.getMemberID();
			if(memberID == tempID) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return true;
		
	}
	
	public void showALL() {
		
		for(Member member : treeSet) {
			System.out.println(member);
		
		}
		System.out.println();
	}
}
