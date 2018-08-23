package ybc.oraclebiz.service.repository;

import java.util.List;

import ybc.oraclebiz.service.model.OracleBiz;

/**
 * 
 * @author 윤병찬
 *
 */
public interface OracleBizRepository {
	
	String sqlPrefix = OracleBizRepository.class.getCanonicalName() + ".";

	/**
	 * 
	 * @param id
	 * @return
	 */
	public OracleBiz selectOracleBizInfo(String id);
	
	
	/**
	 * 샘플 업데이트 
	 * @param oracleBiz
	 * @return
	 */
	public int updateOracleBizInfo(OracleBiz oracleBiz);
	
}
