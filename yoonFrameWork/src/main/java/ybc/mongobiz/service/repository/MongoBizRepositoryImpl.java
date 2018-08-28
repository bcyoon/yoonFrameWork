package ybc.mongobiz.service.repository;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import ybc.mongobiz.service.model.MongoBiz;

@Repository
public class MongoBizRepositoryImpl implements MongoBizRepository {

	@Autowired
	@Resource(name="mongoTemplate")
	private MongoTemplate mongoTemplate;

	@Override
	public MongoBiz selectMongoBizInfo(String name){

		Query query = new Query(new Criteria().andOperator(
				Criteria.where("name").is(name)
				));
		
		 return mongoTemplate.findOne(query, MongoBiz.class, "member");
	}
	
	@Override
	public List<MongoBiz> selectMongoBizInfoAll(){

		 return mongoTemplate.findAll(MongoBiz.class, "member");
	}	
	
	@Override
	public void updateMongoBizInfo(MongoBiz dto){

		mongoTemplate.insert(dto, "member");	//데이타모델, 컬랙션

	}
}
