package com.nouvolution.testLogin2dao;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nouvolution.testLogin2dto.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{ 
	
	@Inject
	SqlSession sqlSession;
	
	private static final String namespace = "com.nouvolution.testLogin2.mappers.memberMapper";

	//Check for now time
	@Override
	public String getTime(){
		return sqlSession.selectOne(namespace + ".getTime"); 
	};
	
	//Insert member
	@Override
	public void insertMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace + ".insertMember" , memberVO);
	}

	@Override
	public MemberVO selectMember(String userid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectMember", userid);
	}

	@Override
	public MemberVO selectMemberwithpw(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectMemberwithpw", paramMap);
	}
	
}
