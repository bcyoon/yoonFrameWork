package ybc.mariabiz.web;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ybc.mariabiz.service.MariaBizService;
import ybc.mariabiz.service.model.MariaBiz;

@Controller
public class MariaBizController {
	
	private static Logger logger = LoggerFactory.getLogger(MariaBizController.class);
	
	
	@Autowired
	MariaBizService mariaBizService;
	
	@RequestMapping(value="/mariaBiz")
	public String getMariaBiz(Model model) {
		
		int id = 1;
		
		MariaBiz mariaBiz = mariaBizService.getMariaBizInfo(id);
		
		model.addAttribute("mariaBiz", mariaBiz);
		
		logger.info(mariaBiz.toString());
		
		String currTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());

		model.addAttribute("currTime", currTime);


		
		return "mariaBiz/mariaBizView"; 
		 
	}	
	
	
}
