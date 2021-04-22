package com.nouvolution.testLogin2dao;

import com.nouvolution.testLogin2dto.MemberVO;

public interface MemberDAO {
	
	//Check for now time
	public String getTime();
	
	//Insert member
	public void insertMember(MemberVO memberVO);
	
	//Search memberID
	public MemberVO selectMember(String userid) throws Exception;
	
	//Search memberID and memberpw
	public MemberVO selectMemberwithpw(String userid, String userpw) throws Exception;
	
}
