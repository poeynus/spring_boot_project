# 간단한 백엔드 예습 - 21.10.14

### 21.10.22 20:46

    시작
    TODO List 만들기를 따라하면서 기초 감 좀 잡기
    - https://www.youtube.com/watch?v=hHRLN9j1kqI&ab_channel=%EC%96%BC%EC%91%A4ALLSSU
    front - react
    back - spring boot
    db - maria

### 21.11.11

    진짜 시작
    - spring boot - kotlin으로 설치
    => 스프링 이니셜라이저 사용 해서 만들고 open 했음
    - db는 영상은 mysql쓰는데 나는 maria로 하려고 maria로 설치
    => 내일 연동하고 할 듯, 이거만 했는데 좀 재밌네
    - 알게 된 것
    => 스프링 에서 새로 생성된 파일들은 빨간줄로 표시된다 - 에러인줄 알고 삽질함
    => gitignore은 노란색으로 표시된다.

### 21.11.13

    공식 문서 보면서 진행 중, 언어 습득은 3일안에 끝내기
    백엔드 개발은 7일 안에 어느정도 숙달 되게끔 하기
    - https://kotlinlang.org/docs/basic-syntax.html

### 21.11.19

    - application.yml 새롭게 생성
    => docker, mariadb, spring boot 까지 연동 완료
    docker 명령어
    1. docker exec -it todo /bin/bash
    2. mysql -u root -p
    docker 간단한 명령어 참고
    - https://7942yongdae.tistory.com/130

### 21.11.20

    - 백엔드 완성
    => Entity 생성, Column 설정
    => CrudRepository를 사용하여 인터페이스 생성
    => Sevice 생성, 삽입, 수정 삭제 등 여러가지 로직 작성
    => Controller 생성, 각각에 해당하는 Mapping

### 21.11.27

    - Heroku && kotlin rest api 성공
    => 한 5일 삽질 했던 거 같은데 드디어 성공
    => 문제는 뭔가 우리가 개발하려던 것과 버전이 안 맞는 거 같음
    => build.gradle과 build.gradle.kts의 차이인데 이거 그냥 바꿔서 써도 되는건가?

### 21.11.29

    - 이제 진짜 완벽하게 했음
    => 진짜 찢어버릴듯

    - 한 가지 문제
    => 코틀린의 버전이 조금 다른데...
    
### 21.12.04

    - 11월 29일의 문제점 해결
    => 다른 사람 데모를 찾았음 아직 안해봤음
    => https://github.com/britter/spring-boot-heroku-demo
    

### 21.12.06

    - 아 이거 안되는 거 같은데;;;
