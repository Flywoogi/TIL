package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Member;
import listener.ApplicationContext;
import listener.ContextLoaderListener;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 	- MVC 프레임워크 만들기
		스프링 MVC를 모방한 간단한 MVC 프레임워크 만들어 보기
		스프링 프레임워크의 구동 원리와 내부 구조를 이해하기
		디자인 패턴 적용하는 방법과 오픈 소스 라이브러리를 사용하는 방법을 경험하기
		리플렉션 API 사용법 익히기
		애노테이션을 정의하고 사용하는 방법 익히기 
		
		<<학습순서>>
			- 프런트 컨트롤러의 도입 
			프런트 컨트롤러 디자인 패턴
			프런트 컨트롤러는 서블릿들의 공통코드를 처리
			기존 서블릿은 페이지에 대한 요청 처리만 담당
			클라이언트의 요청에 따라 적절한 페이지 컨트롤러 선택
			뷰 관리 및 페이지 이동 관리
			
			- 페이지 컨트롤러 진화 (서블릿 대체) <그림 페이지컨트롤 이해1> <그림 서블릿 대체 이해2>
			Controller 인터페이스
			프런트 컨트롤러와 페이지 컨트롤러 사이의 호출 규칙
			페이지 컨트롤러를 일반 클래스화 -> 재 사용성 높임
			
			- DI를 이용한 빈 의존성 관리
			1. 의존성 주입(DI : Dependency Injection)
			특정 작업을 수행할 때 사용하는 객체를 "의존 객체" 라 부름
			이런 의존 객체를 외부에서 주입함 -> 결합도가 낮아짐 -> 교체가 쉽고, 변경이 용이해짐 
			문법 -> 의존 객체를 위한 인스턴스 변수와 셋터 메서드를 준비  
			2. 의존 객체의 관리
			의존 객체의 관리와 주입은 빈 컨테이너가 관리
			ContextLoaderListener가 빈 컨테이너 역할 수행
			인터페이스를 통해 의존 객체에 대한 결합도 낮춤
			MemberDao에 인터페이스 적용
     * 
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override    
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
    		throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	String servletPath = req.getServletPath();
    	try {    		
    		ServletContext sc = this.getServletContext();    		
    		HashMap<String, Object> model = new HashMap<String, Object>();
    		model.put("session", req.getSession());
    		model.put("req", req);
//    		Controller pageController  = (Controller)sc.getAttribute(servletPath);
    		ApplicationContext ctx = ContextLoaderListener.getApplicationContext();
    		System.out.println(servletPath);
    		Controller pageController  = (Controller)ctx.getBean(servletPath);
    		if(pageController == null) {
    			throw new Exception("요청한 서비스를 찾을 수 없습니다.");
    		}
    		if("/members/add.do".equals(servletPath)) {
    			model.put("member", new Member().setEmail(req.getParameter("email"))
    					.setName(req.getParameter("name")).setPassword(req.getParameter("pwd")));    			
    		}
    		
    		String viewUrl = pageController.execute(model);
    		for(String key : model.keySet()) {
    			req.setAttribute(key, model.get(key));    		
    		}
    		if(viewUrl.startsWith("redirect:")) {
    			resp.sendRedirect(viewUrl.substring(9));
    			return;
    		}else {
    			RequestDispatcher rd = req.getRequestDispatcher(viewUrl);
    			rd.include(req, resp);
    		}    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
