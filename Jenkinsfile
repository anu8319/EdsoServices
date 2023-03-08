
Pipeline { 
  agent any
  stages { 
    stage('Build') { 
      steps { 
        echo 'Build World'
      }
    }
    stage('Deploy') { 
      steps {
        echo 'Deploy World'
      } 
    } 
    stage('Test') {
      steps {
        echo 'Test World' 
      }
    }
  } 
  post
  { 
    always {
      emailText body: 'Summary', subject: 'Pipeline Status', to: 'anuu.ashturkar@gmail.com' 
    }
  }
}
