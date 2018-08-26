package ybc.mariabiz.service;

import ybc.mariabiz.service.model.MariaBiz;

/**
 * 
 * @author 윤병찬
 *
 */
public interface MariaBizService {

	/**
	 * 샘플데이타 조회
	 * @param id
	 * @return
	 */
	public MariaBiz getMariaBizInfo(int id);
	
	/**
	 * 정상적인 update 처리 - commit 처리
	 * @param MariaBiz
	 * @return
	 */
	public int setMariaBizInfo(MariaBiz dto);
	
	/**
	 * 비정상적이니 update 처리 - rollback 처리
	 * @param MariaBiz
	 * @return
	 */
	public int setMariaBizInfoBad(MariaBiz dto);
	
	
}
 