package com.dunglq.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("form")
	public String showForm() {
		return "login";
	}
	@RequestMapping("formregister")
	public String showForm2() {
		return "register";
	}
	

	
	@RequestMapping("login.htm")
	public String login2(HttpServletRequest request) {
		javax.servlet.http.HttpSession session = request.getSession();
		String id = request.getParameter("idlog");
		String pw = request.getParameter("passwordlog");	
		String idlog=(String) session.getAttribute("idre");
		String pwlog=(String) session.getAttribute("pwdre");
		if(id.equals(idlog) && pw.equals(pwlog)){
			session.setAttribute("id", id);
			session.setAttribute("pwd", pw);
			return "info";
		}
		session.setAttribute("message", "Sai thông tin đăng nhập !");
		return "login";
	}
	
	@RequestMapping("register.htm")
	public String register( HttpServletRequest request) {
		javax.servlet.http.HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		if(id!=""&&pw!="") {
			session.setAttribute("idre", id);
			session.setAttribute("pwdre", pw);
			
			return "login";
		}
		
		return "register";
	}
	
}