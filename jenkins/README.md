
# Jenkins 설치 및 실행 가이드

Jenkins 설치 후, 빌드 및 배포 작업을 자동화하기위한 작업입니다.

## 1. Jenkins 도커 이미지 다운

```sh
docker pull jenkins/jenkins
```

## 2. Jenkins 실행

jenkins Docker 실행 파일 생성

```sh
sudo vi run_jenkins.sh
```

```sh
docker run --rm -d -p 28080:8080 -p 50000:50000 \
        -v /appdata/jenkins/jenkins_home:/var/jenkins_home \
        -v /var/run/docker.sock:/var/run/docker.sock \
        -v /appdata/deploy:/home/portal/deploy \
        -e TZ=Asia/Seoul \
        -e JENKINS_OPTS="--httpPort=8080" \
        -u root \
        --name jenkins-container jenkins/jenkins
```
- --rm : 컨테이너 stop 시 자동으로 삭제
- -d : 백그라운드 실행
- -p : 호스트 포트:컨테이너 내부 포트
- -v : volum mount(var/jenkins_home 젠킨스 홈, /var/run/docker.sock 호스트 docker를 사용하기 위해, /home/portal/deploy deploy할 파일들을 넣기위해)
- -e : 환경 변수 설정 (TZ 시간, JENKINS_OPTS 포트설정)
- -u : 권한 root 설정
- --name : 생성할컨테이너이름 이미지이름
## 3. 플러그인 설정

> 참고: https://github.com/taehui8260/jenkins-plugins

---
