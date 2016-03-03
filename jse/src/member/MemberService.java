package member;

public interface MemberService {
	public String join(MemberBean member);
	public MemberBean searchById(String id);
	public MemberBean[] searchByName(String name);
	public String remove(String id); 
	public int countAll();
	public int searchCountByName(String name);
	public String login(String id, String pass);
	public String update(MemberBean member);
	
}
