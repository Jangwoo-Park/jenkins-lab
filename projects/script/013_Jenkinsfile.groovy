pipeline {
    agent any
    stages { 
        stage('SSH Staging Server') {
            steps {
                sshagent(credentials: ['Staging-PrivateKey']) {
                    sh "ssh -o StrictHostKeyChecking=no root@192.168.56.144 whoami"
                    sh "ssh -o StrictHostKeyChecking=no root@192.168.56.144 env"
                }
            }
        }
    }
}
