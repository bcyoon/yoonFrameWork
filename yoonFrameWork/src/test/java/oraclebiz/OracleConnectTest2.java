package oraclebiz;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("local")
@ContextConfiguration(locations={"classpath*:/config/context-*.xml", "classpath*:/config/dispatcher-servlet.xml"})
//@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/test-servlet-context.xml",
//"file:src/main/webapp/WEB-INF/mybatis/test-mybatis-context.xml"})
public class OracleConnectTest2 {
	
	//잘 안됨....ㅜ.ㅜ
	
	@Autowired
    private SqlSessionFactory sqlSessionFactory;
    
    @Test
    public void testFactory() {
        System.out.println(sqlSessionFactory);
    }
    
    @Test
    public void testSession() throws Exception {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            System.out.println(session);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


			
}
