package ybc.mongobiz.service;

import java.util.List;

import ybc.mongobiz.service.model.MongoBiz;

/**
 * 
 * @author 윤병찬
 *
 */
public interface MongoBizService {

	/**
	 * 샘플데이타 조회
	 * @param name
	 * @return
	 */
	public MongoBiz getMongoBizInfo(String name);
	
	/**
	 * 
	 * @return
	 */
	public List<MongoBiz> getMongoBizInfoAll();	
	
	/**
	 * 정상적인 update 처리 - commit 처리
	 * @param MongoBiz
	 * @return
	 */
	public int setMongoBizInfo(MongoBiz dto);
	

	
}
 