pipeline {
    agent any
    environment {
        PATH = "/opt/maven/bin:$PATH"
    }
    stages {
        stage('Build') {
            steps {
                git branch: 'main', url:'https://github.com/mikamtst/Traveller.git'
                sh "mvn clean install"
            }
        }
        stage('Approve') {
            steps {
                script {
                    timeout(time: 2, unit: "HOURS") {
                        env.userInput = input message: 'Aprovar o Deploy', ok: 'Continuar',
                            parameters: [choice(name: 'APPROVE_DEPLOY', choices: 'Sim\nNão', description: 'O deploy será aprovado?')]
                        echo ("${userInput}")
                        if ("${userInput}" == 'Sim') {
                            echo 'O Deploy será realizado'
                        } else {
                            echo 'O Deploy NÃO será realizado'
                        }
                    }
                }
            }
        }
        stage("Deploy"){
            steps{
                script{
                    if ("${userInput}" == "Sim"){
                    deploy adapters: [jboss6(credentialsId: 'a39200c4-7e70-407b-ad31-ee93b4b4fde7', url: 'http://20.201.39.171:8180')], contextPath: 'traveller', war: '**/*.war'
                    } else {
                        echo 'O Deploy foi negado.'
                    }
                }
            }
        }
    }
}
