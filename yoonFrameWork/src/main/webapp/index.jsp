<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<ul>
	<li><a href="/hello">helloView</a></li>
	<li><a href="/oracleBiz">oracleBiz</a></li>
</ul>

Exception을 자동 발생시키기<br>


<pre>
★ 참고자료
Spring mvc 환경잡기
http://mangkyu.tistory.com/category/Spring%20%20MVC
깃허브 https://github.com/regenea8/GroupWare/blob/master/GroupWare/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml

★ config 파일  서버별 location 하기 (배포 환경 별 설정 분리하기) ----- 완료
1. 서버 run config - argument탭 - vm argument 란에 -Dspring.profiles.active=local 삽입
2. spring-servlet.xml내에서 샵{systemProperties['spring.profiles.active']} 을 사용하면 local값이 들어옴 

★ 오라클 jdbc 연동 ----- 완료
1. 로컬 오라클 설치
2. DB 트랜잭션   http://roqkffhwk.tistory.com/112
3. ibatis
5. 로그출력

★ java config 방식으로 변환하기
  http://zgundam.tistory.com/86

★ 마리아DB jdbc 연동
1. 로컬 마리아DB 설치


★ junit

★ 몽고 DB jdbc 연동
1. 로컬 몽고 DB 설치

★ Redis 캐쉬 적용

★ 형상관리 - GITHUB -- 완료
https://blog.naver.com/indy9052/221181862947

★ 품질관리 - 코드인스팩션 - SonarQube

★ RESTfull API

★ Redis 캐쉬 적용

★ 로깅

★ Build tool
 - 

★ Test Case

★ 성능테스트



게들링?

★ Docker
</pre>

</body>
</html>