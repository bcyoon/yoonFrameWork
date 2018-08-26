package ybc.oraclebiz.web;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ybc.hello.web.HelloController;
import ybc.oraclebiz.service.OracleBizService;
import ybc.oraclebiz.service.model.OracleBiz;

@Controller
public class OracleBizController {
	
	private static Logger logger = LoggerFactory.getLogger(OracleBizController.class);
	
	
	@Autowired
	OracleBizService oracleBizService;
	
	@RequestMapping(value="/oracleBiz")
	public String getOracleBiz(Model model, String id) {
		
		id = "105300907";
		
		OracleBiz oracleBiz = oracleBizService.getOracleBizInfo(id);
		
		model.addAttribute("oracleBiz", oracleBiz);
		
		logger.info(oracleBiz.toString());
		
		String currTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());

		model.addAttribute("currTime", currTime);


		
		return "oracleBiz/oracleBizView"; 
		 
	}	
	
	
}
