docker run --rm -d -p 28080:8080 -p 50000:50000 \
        -v /appdata/jenkins/jenkins_home:/var/jenkins_home \
        -v /var/run/docker.sock:/var/run/docker.sock \
        -v /appdata/jenkins/web-auto-deploy:/appdata/jenkins/web-auto-deploy \
        -e TZ=Asia/Seoul \
        -e JENKINS_OPTS="--httpPort=8080" \
        -u root \
        --name jenkillns-container jenkins/jenkins