package controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import dto.Member;

public class LogInController implements Controller{
	MemberDAO memberDao;
	public LogInController setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	@Override
	public String execute(Map<String, Object> model) throws Exception {
//		Member loginInfo = (Member)model.get("loginInfo");
//		if(loginInfo == null) {
//			return "/auth/LoginForm.jsp";
//		}else {						
//			Member member = memberDao.exist(loginInfo.getEmail(), loginInfo.getPassword());
			Member member = new MemberDAOImpl().exist(((HttpServletRequest)model.get("req")).getParameter("email"),
					((HttpServletRequest)model.get("req")).getParameter("password"));
			if(member != null) {
				HttpSession session = (HttpSession)model.get("session");
				session.setAttribute("member", member);
				return "redirect:../members/list.do";	   		
			}else {
				return "/auth/LogInFail.jsp";
			}
//		}
	}

}
