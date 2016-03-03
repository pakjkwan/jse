package member2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class MemberServiceImpl implements MemberService{
	// 필드
	private MemberBean member;
	private MemberBean[] memberList;
	private Map<String,MemberBean> map; // Map 은 인터페이스
	
	public MemberServiceImpl() {
		member = new MemberBean();
		
		map = new HashMap<String,MemberBean>();
	}
	
	// 에어리어
	@Override
	public String login(String id, String pass) {
		String result = "로그인 실패";
		
		if (map.containsKey(id)) { // 맵에 id 가 존재하는지를 먼저 체크한다
			// 메소드 체인 기법
			result = (map.get(id).getPassword().equals(pass)) ?
					"로그인 성공"
					: "비밀번호가 일치하지 않습니다.";
		} else {
			result = "아이디가 존재하지 않거나, 잘못된 아이디 입니다.";
		}
		return result;
	}

	@Override
	public String update(MemberBean member) {
		map.replace(member.getUserid(), member);
		return "업데이트 성공";
	}
	@Override
	public String join(MemberBean member) {
		// 회원가입
		map.put(member.getUserid(), member);
		return member.getName() + "회원 가입을 축하드립니다";
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		return  map.get(id);
	}

	@Override
	public List<MemberBean> searchByName(String name) {
		List<MemberBean> temp = new ArrayList<MemberBean>();
		for (String id : map.keySet()) {
			if (map.get(id).getName().equals(name)) {
				temp.add(map.get(id));
			}
		}
		return temp;
	}

	@Override
	public String  remove(String id) {
		// 회원 탈퇴
		return map.remove(id) != null ?  "탈퇴 성공" : "탈퇴 실패";
	}

	@Override
	public int countAll() {
		// 회원수 구하기
		return map.size();
	}

	@Override
	public int searchCountByName(String name) {
		// 이름으로 회원 수 세기
		int n=0;
		for (int i = 0; i < map.size(); i++) {
			if (memberList[i].getName().equals(name)) {
				n++;
			}
		}
		return n;
	}

}
