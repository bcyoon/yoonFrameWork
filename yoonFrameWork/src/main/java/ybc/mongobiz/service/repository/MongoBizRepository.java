package ybc.mongobiz.service.repository;

import java.util.List;

import ybc.mongobiz.service.model.MongoBiz;

/**
 * 
 * @author 윤병찬
 *
 */
public interface MongoBizRepository {
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public MongoBiz selectMongoBizInfo(String name);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<MongoBiz> selectMongoBizInfoAll();	
	
	
	/**
	 * 샘플 업데이트 
	 * @param MongoBiz
	 * @return
	 */
	public void updateMongoBizInfo(MongoBiz dto);
	
}
