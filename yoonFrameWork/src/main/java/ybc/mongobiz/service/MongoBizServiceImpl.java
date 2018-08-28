package ybc.mongobiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ybc.mongobiz.service.model.MongoBiz;
import ybc.mongobiz.service.repository.MongoBizRepository;

@Service
public class MongoBizServiceImpl implements MongoBizService {
	
	@Autowired
	MongoBizRepository mongoBizRepository;

	@Override
	public MongoBiz getMongoBizInfo(String name){
		
		MongoBiz dto = mongoBizRepository.selectMongoBizInfo(name);
		
		return dto;
	}	
	
	@Override
	public List<MongoBiz> getMongoBizInfoAll(){
		
		return mongoBizRepository.selectMongoBizInfoAll();
		
	}	
	
	@Override
	public int setMongoBizInfo(MongoBiz dto){
		
		int rtn = 0;
		
		try{
			mongoBizRepository.updateMongoBizInfo(dto);
			rtn = 1;
		}catch(Exception e){
			e.printStackTrace();
			rtn = 0;
		}
		return rtn;
	}
		
}
