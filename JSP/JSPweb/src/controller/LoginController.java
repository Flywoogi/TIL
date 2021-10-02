package controller;

import dto.Member;
import memberex.MemberDAO;

import java.util.Map;

public class LoginController implements Controller{
    MemberDAO memberDAO;
    public LoginController setMemberDao(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
        return this;
    }
    @Override
    public String execute(Map<String, Object> model) throws Exception{
        Member loginInfo = (Member) model.get("loginInfo")
    }
}
