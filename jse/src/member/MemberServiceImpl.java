package member;

public class MemberServiceImpl implements MemberService{
	// 필드
	private MemberBean member;
	private int count;
	private MemberBean[] memberList;
	
	public MemberServiceImpl(int count) {
		member = new MemberBean();
		memberList = new MemberBean[count];
	}
	
	// 에어리어
	@Override
	public String login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String join(MemberBean member) {
		// 회원가입
		memberList[count]= member;		
		count++;

		return "회원 가입 완료!!!!";
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		for (int i = 0; i < count; i++) {

			if (memberList[i].getUserid().equals(id)) {
				member=memberList[i];
			}
		}
		return member;
	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 이름으로 회원정보 검색
		MemberBean[] tempList=new MemberBean[searchCountByName(name)];
		int j=0;
		
		for (int i = 0; i < tempList.length; i++) {
			if (memberList[i].getName().equals(name)) {
				tempList[j]=memberList[i];
			    j++;
			}
		}
		
		return tempList;
	}

	@Override
	public String remove(String id) {
		// 회원탈퇴
		String result = "해당 아이디가 없습니다";
		for (int i = 0; i < count; i++) {
			if (memberList[i].getUserid().equals(id)) {
				memberList[i]=memberList[count-1];
				memberList[count-1]=null;
				count--;
				result = "탈퇴시키기 성공!!!";
			}
		}
		
		return result;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public int searchCountByName(String name) {
				// 이름으로 회원 수 세기
				int n=0;
				for (int i = 0; i < count; i++) {
					if (memberList[i].getName().equals(name)) {
						
						n++;
					}
				}
				
				return n;
	}

}
