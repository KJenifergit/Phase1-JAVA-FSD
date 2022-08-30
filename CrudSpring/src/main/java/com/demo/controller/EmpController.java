package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Emp;
import com.demo.dao.EmpDao;

@Controller
public class EmpController {
	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empform")
	public String showForm(Model m) {
		m.addAttribute("command",new Emp());
		return "empform";
	}
	
	
	@RequestMapping(value = "/save", method =RequestMethod.POST)
	public String Save(@ModelAttribute("emp")Emp emp) {
		dao.save(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Emp> list=dao.getEmployees();
		m.addAttribute("list", list);
		return "viewemp";
	}
	
	
	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id , Model m) {
		Emp emp=dao.getEmpById(id);
		m.addAttribute("command", emp);
		return "empeditform";	
	}
	@RequestMapping(value = "/editsave",method =RequestMethod.POST)
		public String editsave(@ModelAttribute("emp")Emp emp) {
			dao.update(emp);
			return "redirect:/viewemp";
		}
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewemp";    
    } 
	
	
	
	@RequestMapping("/retform")
	public String retForm(Model m) {
		m.addAttribute("command",new Emp());
		return "retform";
	}
	@GetMapping("/retrieve")
	public String getProduct(HttpServletRequest request,HttpServletResponse response ,ModelMap map) throws IOException, ServletException {
		 PrintWriter out= response.getWriter();
		 response.setContentType("text/html");
		 String id = request.getParameter("id");
		 if(id.equals("")) {
			 	out.println("<h2 style='color:red;'>Invalid Input</h2>");
				RequestDispatcher rd=request.getRequestDispatcher("retform");
				rd.include(request, response);
		 }else {
			 int id1=Integer.parseInt(request.getParameter("id"));
			 Emp emp=dao.RetrieveEmpById(id1);
			 map.addAttribute("obj",emp);
			 return "retview";
		 }
		 return null;
	}
	
	
	
}

