package ybc.mariabiz.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ybc.mariabiz.service.MariaBizService;
import ybc.mariabiz.service.model.MariaBiz;

@RestController
public class MariabizBizAjaxController {
	
	private static Logger logger = LoggerFactory.getLogger(MariabizBizAjaxController.class);
	
	
	@Autowired
	MariaBizService mariaBizService;
	
	@RequestMapping(value="/ajax/setMariaBiz")
	public String setMariaBiz(Model model, MariaBiz dto) {
		
		dto.setId(1);
		
		int rtn = mariaBizService.setMariaBizInfo(dto);
		
		logger.info(dto.toString());
		
		return rtn>0?"성공":"실패"; 
		 
	}	
	
	@RequestMapping(value="/ajax/setMariaBizBad")
	@Transactional
	public String setMariaBizBad(Model model, MariaBiz dto) {
		
		int rtn = 0;
		
		dto.setId(1);
		rtn = mariaBizService.setMariaBizInfoBad(dto);
			
		logger.info(dto.toString());
		return rtn>0?"성공":"실패"; 
		 
	}		
	
	
}
