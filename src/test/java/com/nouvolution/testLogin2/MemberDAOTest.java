package com.nouvolution.testLogin2;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nouvolution.testLogin2dao.MemberDAO;
import com.nouvolution.testLogin2dto.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/application.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO memberDAO;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(memberDAO.getTime());
	}
	
	@Test
	public void testinsertMember() throws Exception{
		MemberVO memberVO = new MemberVO();
		memberVO.setUserid("test2");
		memberVO.setUserpw("xptmxm1123");
		memberVO.setEmail("test2@test.com");
		memberVO.setUsername("testname2");
		
		memberDAO.insertMember(memberVO);
	}
	
	@Test
	public void testSelectMember() throws Exception{
		memberDAO.selectMember("test");
	}
	
	@Test
	public void testSelectMemberWithpw() throws Exception{
		memberDAO.selectMemberwithpw("test1", "xptmxm1123");
	}
}
