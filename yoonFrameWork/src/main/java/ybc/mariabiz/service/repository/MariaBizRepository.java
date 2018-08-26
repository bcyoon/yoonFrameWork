package ybc.mariabiz.service.repository;

import ybc.mariabiz.service.model.MariaBiz;

/**
 * 
 * @author 윤병찬
 *
 */
public interface MariaBizRepository {
	
	String sqlPrefix = MariaBizRepository.class.getCanonicalName() + ".";

	/**
	 * 
	 * @param id
	 * @return
	 */
	public MariaBiz selectMariaBizInfo(int id);
	
	
	/**
	 * 샘플 업데이트 
	 * @param MariaBiz
	 * @return
	 */
	public int updateMariaBizInfo(MariaBiz dto);
	
}
