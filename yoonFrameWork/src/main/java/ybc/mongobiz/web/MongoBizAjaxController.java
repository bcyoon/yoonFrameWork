package ybc.mongobiz.web;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ybc.mongobiz.service.MongoBizService;
import ybc.mongobiz.service.model.MongoBiz;

@RestController
public class MongoBizAjaxController {
	
	private static Logger logger = LoggerFactory.getLogger(MongoBizAjaxController.class);
	
	
	@Autowired
	MongoBizService mongoongoBizService;
	
	@RequestMapping(value="/ajax/setMongoBiz")
	public String setMongoBiz(Model model, MongoBiz dto) {
		
		String currTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis());
		
		dto.setName("최길동");
		dto.setMemo("최메모 "+currTime);
		
		int rtn = mongoongoBizService.setMongoBizInfo(dto);
		
		logger.info(dto.toString());
		
		return rtn>0?"성공":"실패"; 
		 
	}	
	

	
}
