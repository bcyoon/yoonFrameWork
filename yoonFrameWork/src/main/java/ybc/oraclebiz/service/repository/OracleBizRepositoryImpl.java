package ybc.oraclebiz.service.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ybc.oraclebiz.service.model.OracleBiz;

@Repository
public class OracleBizRepositoryImpl implements OracleBizRepository {

	@Autowired
	private SqlSession sqlSessionOracleBiz;
	
	@Override
	public OracleBiz selectOracleBizInfo(String id){
		 return sqlSessionOracleBiz.selectOne(sqlPrefix + "selectOracleBizInfo", id);
	}
	
	@Override
	public int updateOracleBizInfo(OracleBiz oracleBiz){
		return sqlSessionOracleBiz.update(sqlPrefix + "updateOracleBizInfo", oracleBiz);
	}
}
