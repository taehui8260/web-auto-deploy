# web-auto-deploy
Docker, Jenkins, Git, Nexus를 활용한 WEB CI/CD 

---

## 시작하기

이 프로젝트는 웹 소스를 배포를 편리하게 하기 위한 방법중 하나입니다.

Spring Boot(백엔드), Nuxt.js(프론트엔드)로 개발한 웹 소스를 사용합니다. 

## 사전 요구 사항

이 프로젝트를 성공적으로 설치하고 실행하기 위해서는 다음 소프트웨어가 설치되어 있어야 합니다. 아래 명시된 버전들은 이 프로젝트가 테스트되고 검증된 환경을 반영합니다. 가능한 지정된 버전을 사용하여 환경을 구성해 주세요.

### 필요한 소프트웨어 및 도구

- **Java:** JDK 11 (예: `java-11-openjdk-11.0.13`)
- **Node.js:** 버전 16
- **Nuxt.js:** 버전 2
- **jenkins** 버전 2.46.2
- **Spring Boot:** 버전 2.7
- **Nginx:** `1.22.1-alpine` - 프로젝트의 리버스 프록시 및 정적 파일 서버로 사용됩니다.
- **Docker:** 버전 `20.10.7` - 컨테이너화된 환경에서 애플리케이션 및 서비스를 실행하기 위해 필요합니다.
- **docker-compose:** 버전 `1.29.2` - 다중 컨테이너 Docker 애플리케이션을 정의하고 실행하기 위해 필요합니다.

### Docker 컨테이너 버전

프로젝트는 다음 Docker 이미지를 사용합니다:

- **Nginx:** `nginx:1.22.1-alpine` - 프로젝트의 리버스 프록시 및 정적 파일 서버로 사용됩니다.
- **Jenkins:** `jenkins:2.46.2` - 지속적 통합(CI) 및 지속적 배포(CD) 파이프라인을 구성하고 관리하기 위해 사용됩니다. GUI 환경을 통해 배포 과정을 쉽게 모니터링하고 조작할 수 있습니다.

### 설치 지침

각 소프트웨어 및 도구의 공식 웹사이트나 관련 문서를 참조하여 설치해 주세요. 아래는 일부 도구의 설치 예시입니다:

```

# Nuxt 설치(설치 후 .git 파일 삭제 필요)
npx create-nuxt-app@2 front-end
git rm -r --cached front-end/

# Docker 설치 예시 (Ubuntu 기준)
sudo apt-get update
sudo apt-get install docker-ce docker-ce-cli containerd.io

# Docker Compose 설치 예시
sudo curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
```

### 추가 설정

특정 소프트웨어나 도구를 설치한 후 추가적인 환경 설정이 필요할 수 있습니다. 예를 들어, Docker를 설치한 후 사용자를 Docker 그룹에 추가하여, `sudo` 없이 Docker 명령어를 실행할 수 있도록 설정해야 할 수 있습니다.

```
# Docker 그룹에 사용자 추가 예시
sudo usermod -aG docker ${USER}
su - ${USER}
```



## 사용 방법

프로젝트를 사용하는 방법에 대한 예시와 함께 자세한 지침을 제공합니다.

```
# Jenkins 웹 인터페이스 접속 후 'Build Now' 클릭
```

## 파일 구조

프로젝트의 주요 디렉토리와 파일에 대한 간략한 설명을 포함합니다.

- `docker/`: Docker 관련 파일이 있는 디렉토리
    - `Dockerfile`: Docker 이미지 구성 파일
    - `docker-compose.yml`: Docker 컨테이너 오케스트레이션 파일
- `jenkins/`: Jenkins 설정 파일이 있는 디렉토리
    - `Jenkinsfile`: Jenkins 파이프라인 정의 파일
- `nexus/`: Nexus 관련 설정 파일이 있는 디렉토리 (필요한 경우)
- `src/`: 애플리케이션 백엔드 소스 코드가 있는 
- `front-end/`: 애플리케이션 프론트엔드 소스 코드가 있는 디렉토리

## 기여 방법

다른 개발자들이 프로젝트에 기여할 수 있는 방법을 설명합니다. 기여 가이드라인과 코드 리뷰 프로세스를 포함할 수 있습니다.

## 라이선스

이 프로젝트는 [라이선스명] 라이선스를 따릅니다. 라이선스에 대한 자세한 정보는 `LICENSE` 파일을 참고하세요.

## 저자 및 감사의 글

프로젝트에 기여한 모든 개발자들을 인정하고, 필요한 경우 감사의 글을 추가합니다.

