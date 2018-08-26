package ybc.oraclebiz.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ybc.oraclebiz.service.OracleBizService;
import ybc.oraclebiz.service.model.OracleBiz;

@RestController
public class OracleBizAjaxController {
	
	private static Logger logger = LoggerFactory.getLogger(OracleBizAjaxController.class);
	
	
	@Autowired
	OracleBizService oracleBizService;
	
	@RequestMapping(value="/ajax/setOracleBiz")
	public String setOralceBiz(Model model, OracleBiz oracleBiz) {
		
		oracleBiz.setId("105300907");
		
		int rtn = oracleBizService.setOracleBizInfo(oracleBiz);
		
		logger.info(oracleBiz.toString());
		
		return rtn>0?"성공":"실패"; 
		 
	}	
	
	@RequestMapping(value="/ajax/setOracleBizBad")
	@Transactional
	public String setOralceBizBad(Model model, OracleBiz oracleBiz) {
		
		int rtn = 0;
		
		oracleBiz.setId("105300907");
		rtn = oracleBizService.setOracleBizInfoBad(oracleBiz);
		
		logger.info(oracleBiz.toString());
		return rtn>0?"성공":"실패"; 
		 
	}		
	
	
}
