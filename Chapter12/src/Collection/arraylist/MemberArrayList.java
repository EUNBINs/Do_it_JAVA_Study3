package Collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import Collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	
		
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		/*for (int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int temId = member.getMemberID();
			if( memberId == temId ) {
				arrayList.remove(i);
				return true;
			}
		}*/
		
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int temId = member.getMemberID();
			if( memberId == temId ) {
				arrayList.remove(member);
				return true;
		
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showALL() {
		
		for ( Member member : arrayList) {
			System.out.println(member);
		}

		System.out.println(arrayList);
		
	}
}
