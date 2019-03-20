<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<ul>
	<li><a href="/hello">helloView</a></li>
	<li><a href="/helloVue">helloVueView</a></li>
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
   root 비번: admin
       데이터 베이스 생성 : YBC
   
2. 기본 테이블 생성
USE YBC;
      
create TABLE MEMBER
(
  ID INT(10) NOT NULL,
  NAME VARCHAR(20) NOT NULL,
  DESCRIPTION VARCHAR(200),
  REGDTM DATETIME,
  PRIMARY KEY(ID)
);


SELECT * FROM MEMBER

INSERT INTO member VALUES(1, 'YBC', '와이비씨', NOW());
INSERT INTO member VALUES(2, 'KBC', '케이비씨', NOW());

COMMIT;   
   

★ java config 방식으로 변환하기
  http://zgundam.tistory.com/86




★ 몽고 DB jdbc 연동 --
1. 로컬 몽고 DB 설치 -- 완료   https://shino1025.blog.me/221292989786
1-1. C:\mongodb 폴더생성
1-2. 설치시  Complete가 아니라 Custom을 선택해준다. 아까 미리 만들어둔 폴더로 설치 경로를 바꾸기 위해서이다., 
1-3. 몽고디비 컴퍼스는 체크해제 후 설치완료

2. 몽고서버 띄우기 
 몽도 DB 띄우기 cmd창 1 : mongod --config c:\Mongodb\bin\mongod.cfg
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
  
java 에서 사용하기 : jedis  , http://jeong-pro.tistory.com/140, https://docs.microsoft.com/ko-kr/java/api/overview/azure/rediscache?view=azure-java-stable

★ Redis Cluster캐쉬 적용
https://itwise.atlassian.net/wiki/spaces/ATEAM/pages/67207173/Redis+Clustering

★ EhCache 도 있음

★ 형상관리 - GITHUB -- 완료
https://blog.naver.com/indy9052/221181862947

commit 방법 : GIT창 이동 -> 리플래쉬 -> 파일 선택후 Add index -> 커밋메시지 입력  -> commit and Push
본 프로젝트 GIT 주소 - https://github.com/bcyoon/yoonFrameWork.git

새로운 이클립스에 받기 
- 이클립스 설치 -> import -> git -> URL -> git정보 입력 -> 완료  -> git Repository에서 Working Tree에서 프로젝트 체크아웃 -> Maven Project 로 Convert -> 서버 추가 톰텟 7.0
 -> 프로젝트  java Buile Path에  Apache Tomcat 7.0 jar 추가 -> -Dspring.profiles.active=local 도 서버 Argument에 추가


★ 품질관리 - 코드인스팩션 - SonarQube lint

★ 품질관리 - PMD 이클립스 플러그인형태

★ RESTfull API




★ Build tool
 - CI - hudson, jenkins

★ Test Case

★ 성능테스트

★ 스파크

★ 딥런닝 머신런닝

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

★node.js


★★★★리눅스 서버 설정하기★★★
스프링 프로파일 설정하기
1. web.xml (난 안했음) 
<context-param>
	<param-name>spring.profiles.active</param-name>
	<param-value>production</param-value>
</context-param>
2. catalina.sh 에 직접 설정 
   JAVA_OPTS="$JAVA_OPTS -Dspring.profiles.active=local"
3.catalina.properties 에 추가 (D를 빼는 것 주의)
  spring.profiles.active=dev



Tomcat 로그 위치 : /var/log/tomcat7#

JAVA_OPTS="$JAVA_OPTS -Dspring.profiles.active=local"



프로젝트 배포하기
1. 프로젝트 에서 export -> WAR 배포 파일 만들기
2. FTP 접속하여 /home/ubuntu/ 에 업로드 하기
3. 이동하기 sudo mv /home/ubuntu/yoonFrameWork_git.war /var/lib/tomcat7/webapps/
4. rm -r yoonFrameWork_git
5. rm yoonFrameWork_git.war



</pre>

</body>
</html>