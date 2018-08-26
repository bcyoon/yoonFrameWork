package ybc.oraclebiz.service.repository;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ybc.oraclebiz.service.model.OracleBiz;

@Repository
public class OracleBizRepositoryImpl implements OracleBizRepository {

	@Autowired
	@Resource(name="sqlSessionOracle")
	private SqlSession sqlSessionOracle;
	
	@Override
	public OracleBiz selectOracleBizInfo(String id){
		 return sqlSessionOracle.selectOne(sqlPrefix + "selectOracleBizInfo", id);
	}
	
	@Override
	public int updateOracleBizInfo(OracleBiz oracleBiz){
		return sqlSessionOracle.update(sqlPrefix + "updateOracleBizInfo", oracleBiz);
	}
}
