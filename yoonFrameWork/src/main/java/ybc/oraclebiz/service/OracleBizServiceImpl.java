package ybc.oraclebiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
