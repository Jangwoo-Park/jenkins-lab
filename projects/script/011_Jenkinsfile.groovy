pipeline {
    agent any
    
    environment {
        TODAY = ''
    }
    stages {
        stage('Tag Name 확인') {
            steps{
                script {
                    TODAY = sh(returnStdout: true, script: 'date +%Y%m%d%H%M%S').trim()
                }
                echo "yu3papa/cicd_guestbook:${TODAY}_${BUILD_ID}"
            }
        }
    }
}
