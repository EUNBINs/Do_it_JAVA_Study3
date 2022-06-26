 package Collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{
	
	private int memberID;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberID = memberId;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return memberName + " 회원님 아이디는" + memberID + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
		
			if(this.memberID == member.memberID) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		
		return (this.memberName.compareTo(member.memberName));	//this는 나, 마이너스가 되는 대상은 넘어오는 매개변수 //양수는 오름차순, 음수는 내림차순
	}

	@Override
	public int compare(Member member1, Member member2) {
		
		return member1.memberID - member2.memberID;
	}
	
	
}
