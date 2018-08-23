package ybc.oraclebiz.service;

import ybc.oraclebiz.service.model.OracleBiz;

/**
 * 
 * @author 윤병찬
 *
 */
public interface OracleBizService {

	/**
	 * 샘플데이타 조회
	 * @param id
	 * @return
	 */
	public OracleBiz getOracleBizInfo(String id);
	
	/**
	 * 정상적인 update 처리 - commit 처리
	 * @param oracleBiz
	 * @return
	 */
	public int setOracleBizInfo(OracleBiz oracleBiz);
	
	/**
	 * 비정상적이니 update 처리 - rollback 처리
	 * @param oracleBiz
	 * @return
	 */
	public int setOracleBizInfoBad(OracleBiz oracleBiz);
	
	
}
 