package ybc.oraclebiz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ybc.oraclebiz.service.OracleBizService;
import ybc.oraclebiz.service.model.OracleBiz;

@Controller
public class OracleBizController {
	
	@Autowired
	OracleBizService oracleBizService;
	
	@RequestMapping(value="/oracleBiz")
	public String getOralceBiz(Model model, String id) {
		
		id = "10403";
		
		OracleBiz oracleBiz = oracleBizService.getOracleBizInfo(id);
		
		model.addAttribute("oracleBiz", oracleBiz);
		
		System.out.println(oracleBiz.toString());
		
		return "oracleBiz/oracleBizView"; 
		 
	}	
	
	
}
