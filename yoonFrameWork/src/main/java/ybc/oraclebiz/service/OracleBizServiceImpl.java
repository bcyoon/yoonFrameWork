package ybc.oraclebiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import ybc.oraclebiz.service.model.OracleBiz;
import ybc.oraclebiz.service.repository.OracleBizRepository;

@Service
public class OracleBizServiceImpl implements OracleBizService {
	
	@Autowired
	OracleBizRepository oracleBizRepository;

	@Override
	public OracleBiz getOracleBizInfo(String id){
		
		OracleBiz oracleBiz = oracleBizRepository.selectOracleBizInfo(id);
		
		return oracleBiz;
	}	
	
	@Override
	public int setOracleBizInfo(OracleBiz oracleBiz){
		
		int rtn = 0;
		
		rtn = oracleBizRepository.updateOracleBizInfo(oracleBiz);
		
		return rtn;
	}
	
	@Override
	public int setOracleBizInfoBad(OracleBiz oracleBiz){
		
		int rtn = 0;
		//try{
		rtn = oracleBizRepository.updateOracleBizInfo(oracleBiz);
		
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
