pipeline {
    agent any
    stages {
        stage("Email Notification Test") {
            steps {
                echo "email test"
            }
            post {
                always {
                    emailext (attachLog: true, body: '본문', compressLog: true
                    , recipientProviders: [buildUser()], subject: '제목', to: 'yu3papa.j@gmail.com')
                }
            }
        }
    }
}
