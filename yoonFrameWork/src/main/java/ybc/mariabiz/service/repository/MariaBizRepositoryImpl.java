package ybc.mariabiz.service.repository;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ybc.mariabiz.service.model.MariaBiz;

@Repository
public class MariaBizRepositoryImpl implements MariaBizRepository {

	@Autowired
	@Resource(name="sqlSessionMaria")
	private SqlSession sqlSessionMaria;
	
	@Override
	public MariaBiz selectMariaBizInfo(int id){
		
		 return sqlSessionMaria.selectOne(sqlPrefix + "selectMariaBizInfo", id);
	}
	
	@Override
	public int updateMariaBizInfo(MariaBiz dto){
		return sqlSessionMaria.update(sqlPrefix + "updateMariaBizInfo", dto);
	}
}
