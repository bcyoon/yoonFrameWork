package ybc.mariabiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ybc.mariabiz.service.model.MariaBiz;
import ybc.mariabiz.service.repository.MariaBizRepository;

@Service
public class MariaBizServiceImpl implements MariaBizService {
	
	@Autowired
	MariaBizRepository mariaBizRepository;

	@Override
	public MariaBiz getMariaBizInfo(int id){
		
		MariaBiz dto = mariaBizRepository.selectMariaBizInfo(id);
		
		return dto;
	}	
	
	@Override
	public int setMariaBizInfo(MariaBiz dto){
		
		int rtn = 0;
		
		rtn = mariaBizRepository.updateMariaBizInfo(dto);
		
		return rtn;
	}
	
	@Override
	public int setMariaBizInfoBad(MariaBiz dto){
		
		int rtn = 0;
		//try{
		rtn = mariaBizRepository.updateMariaBizInfo(dto);
		
		String badNum = "가";
		
		//인위적 오류발생
		int k = Integer.parseInt(badNum);
		//}catch(Exception e){
		//	System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		//	e.printStackTrace();
			//throw new RuntimeException();
			//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		//	throw e;

		//}
		return rtn;
		
	}
}
