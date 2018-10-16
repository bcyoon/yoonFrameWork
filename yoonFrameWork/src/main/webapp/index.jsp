<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<ul>
	<li><a href="/hello">helloView</a></li>
	<li><a href="/oracleBiz">oracleBiz</a></li>
	<li><a href="/mariaBiz">mariaBiz</a></li>
	<li><a href="/mongoBiz">mongoBiz</a></li>
</ul>




<pre>
★ 참고자료
Spring mvc 환경잡기
http://mangkyu.tistory.com/category/Spring%20%20MVC
깃허브 https://github.com/regenea8/GroupWare/blob/master/GroupWare/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml

★ config 파일  서버별 location 하기 (배포 환경 별 설정 분리하기) ----- 완료
1. 서버 run config - argument탭 - vm argument 란에 -Dspring.profiles.active=local 삽입
2. dispatcher-servlet.xml내에서 샵{systemProperties['spring.profiles.active']} 을 사용하면 local값이 들어옴 

★ 오라클 jdbc 연동 ----- 완료
1. 로컬 오라클 설치
2. DB 트랜잭션   http://roqkffhwk.tistory.com/112
3. ibatis
5. 로그출력

★ log4j 로그 출력하기  ---- Console에는 찍히는데 File 생성은 안됨 부터....@TODO

★ 마리아DB jdbc 연동  --- 완료
1. 로컬 마리아DB 설치  -- 완료

★ java config 방식으로 변환하기
  http://zgundam.tistory.com/86




★ 몽고 DB jdbc 연동 --
1. 로컬 몽고 DB 설치 -- 완료
  몽도 DB 띄우기 cmd창 1 : mongod --config c:\mongodb\mongod.cfg
 몽고 sheel cmd창 2 : mongo
 몽고 DB 셧다운 하기 : 몽고 sheel 창에서 db.shutdownServer()  

간단명령어
use yoon
db.createCollection('emp')
db.emp.insert({id:"ybc", name:"윤병찬"})
db.emp.insert({id:"abc", name:"에비씨"})
db.emp.find()

https://m.blog.naver.com/PostView.nhn?blogId=scw0531&logNo=221005412595&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F

테스트 데이타
db.createCollection("member");
db.member.insert({name:"윤병찬", memo:"윤메모 ABC"})
db.member.insert({name:"홍길동", memo:"홍메모 ABC"})


★ Redis 단일 캐쉬 적용
명령프롬프트트 : cd C:\Program Files\Redis
          redis-server.exe 실행
 만약 실행시   # Creating  Server TCP listening socket *:6379:No such file or directory 라는 오류가 뜬다면
  다른 명령프롬프트에서
  C:\Program Files\Redis>redis-cli.exe
  127.0.0.1:6379> shutdown
  not connected> exit
  후 다시 다른명령프롬프트창에서 redis-server.exe 실행

★ Redis Cluster캐쉬 적용
https://itwise.atlassian.net/wiki/spaces/ATEAM/pages/67207173/Redis+Clustering

★ EhCache 도 있음

★ 형상관리 - GITHUB -- 완료
https://blog.naver.com/indy9052/221181862947

★ 품질관리 - 코드인스팩션 - SonarQube

★ 품질관리 - PMD 이클립스 플러그인형태

★ RESTfull API




★ Build tool
 - CI - hudson

★ Test Case

★ 성능테스트

★ 스파크

★ 딥런닝

★ 빅데이터 분석

게들링?

★ Docker

★ 파브리게이터 협업툴

★ 파일 업로드 / 다운로드

★ 엑셀 다운로드

★ JAVA API - JAX-RS

★ 배핑 - Spring Batch 2.2.7

★ Excel Apache POI/iXLS

★ 암호화 - Encryption/Decryption - Jasypt

★ELK

</pre>

</body>
</html>