package ybc.hello.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	private Environment env;
	
    @Value("${datasource.oracleBiz.password}")  //프로퍼티 사용
    private String m_docPath ;
	
	@RequestMapping(value="/hello")
	public String getHello(Model model) {
		
		System.out.println(m_docPath);
		model.addAttribute("aaa", "aaa 값");
		model.addAttribute("bbb", "bbbb 값");
		model.addAttribute("oracleBiz", m_docPath);
		
		   // 프로퍼티 파일 읽기



		return "hello/helloView"; 
		 
	}	
	
	
}
