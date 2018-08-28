package ybc.mongobiz.web;

import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ybc.mongobiz.service.MongoBizService;
import ybc.mongobiz.service.model.MongoBiz;

@Controller
public class MongoBizController {
	
	private static Logger logger = LoggerFactory.getLogger(MongoBizController.class);
	
	
	@Autowired
	MongoBizService mongoBizService;
	
	@RequestMapping(value="/mongoBiz")
	public String getMongoBiz(Model model) {
		
		
		
		List<MongoBiz> list = mongoBizService.getMongoBizInfoAll();
		
		for(MongoBiz dto : list){
			logger.info(dto.toString());
		}
		
		model.addAttribute("list", list);
		
		logger.info("=========d=d=d=d=d=d=d==========");
		
		String name = "홍길동";
		
		MongoBiz mongoBiz = mongoBizService.getMongoBizInfo(name);
		
		model.addAttribute("mongoBiz", mongoBiz);
		
		logger.info(mongoBiz.toString());
		
		String currTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());

		model.addAttribute("currTime", currTime);


		
		return "mongoBiz/mongoBizView"; 
		 
	}	
	
	
}
