package controller;

import dto.Member;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class DispatcherServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String servletPath = req.getServletPath();
        try {
            ServletContext sc = this.getServletContext();
            HashMap<String, Object> model = new HashMap<String, Object>();
            model.put("session", req.getSession());
            Controller pageController = (Controller)sc.getAttribute(servletPath);
            if (pageController == null) {
                throw new Exception("요청한 서비스를 찾을 수 없습니다.");
            }
            if ("/members/add.do".equals(servletPath)){
                model.put("member", new Member().setEmail(req.getParameter("email"))
                        .setName(req.getParameter("name")).setPassword(req.getParameter("pwd")));
            }

            String viewUrl = pageController.execute(model);
            for (String key : model.keySet()) {
                req.setAttribute(key);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
