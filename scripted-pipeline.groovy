node {  
    stage('Pull') { 
        git 'https://github.com/rajatpzade/studentapp.ui.git'
    }
    stage('Build') { 
         echo 'successfully build'
    }
    stage('Test') { 
         echo 'successfully test'
    }
    stage('Deploy') { 
         echo 'successfully deploy'
    }
}









