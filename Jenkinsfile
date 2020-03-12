pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'JDK 1.8.0_92'
    }
    stages {
        stage('Testing') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn verify'
                    } else {
                        bat 'mvn verify'
                    }
                    archiveArtifacts artifacts: '**', onlyIfSuccessful: false
                }
            }
        }
        stage('Cucumber Report') {
            steps {
                script {
                    cucumber fileIncludePattern: '**/*.json', jsonReportDirectory: 'target/json-cucumber-reports', sortingMethod: 'ALPHABETICAL'
                }
            }
        }
        stage('Live Documentation') {
            steps {
                script {
                    livingDocs featuresDir: 'target/json-cucumber-reports', format: 'ALL', hideScenarioKeyword: true, toc: 'LEFT'
                }
            }
        }
        stage('HTML Publish') {
            steps {
                script {
                    publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: false, reportDir: 'target/generated-report', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
                }
            }
        }
    }
    post {
        always {
            step([$class: 'Publisher', reportFilenamePattern: 'target/testng-cucumber-reports/*.xml'])
        }
    }
}