node {  
    stage('Pull') { 
        git 'https://github.com/rajatpzade/studentapp.ui.git'
    }
    stage('Build') { 
         echo 'successfully build'
    }
    stage('Test') { 
        // 
    }
    stage('Deploy') { 
        // 
    }
}