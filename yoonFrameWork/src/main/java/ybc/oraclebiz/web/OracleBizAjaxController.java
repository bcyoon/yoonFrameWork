package ybc.oraclebiz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ybc.oraclebiz.service.OracleBizService;
import ybc.oraclebiz.service.model.OracleBiz;

@RestController
public class OracleBizAjaxController {
	
	@Autowired
	OracleBizService oracleBizService;
	
	@RequestMapping(value="/ajax/setOoracleBiz")
	public String setOralceBiz(Model model, OracleBiz oracleBiz) {
		
		oracleBiz.setId("105300907");
		
		int rtn = oracleBizService.setOracleBizInfo(oracleBiz);
		
		System.out.println(oracleBiz.toString());
		
		return rtn>0?"성공":"실패"; 
		 
	}	
	
	@RequestMapping(value="/ajax/setOoracleBizBad")
	@Transactional
	public String setOralceBizBad(Model model, OracleBiz oracleBiz) {
		
		int rtn = 0;
		
		oracleBiz.setId("105300907");
			rtn = oracleBizService.setOracleBizInfoBad(oracleBiz);
			
			System.out.println(oracleBiz.toString());
		return rtn>0?"성공":"실패"; 
		 
	}		
	
	
}
