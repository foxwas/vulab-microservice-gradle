node {
    stage ("Checkout VulabMicroservice"){
        git branch: 'main', url: ' https://github.com/foxwas/vulab-microservice-maven.git'
    }
    
    stage ("Maven Build - VulabMicroservice") {
	
        sh 'gradle clean build'

    }
    
    stage ("Package - VulabMicroservice") {
        sh  'gradle bootjar'
    }
    
    stage ("API Tests- VulabMicroservice") {
        sh  'gradle test'
    }
    
    stage('User Acceptance Test - VulabMicroservice') {
	
	  def response= input message: 'Is this build good to go?',
	   parameters: [choice(choices: 'Yes\nNo', 
	   description: '', name: 'Pass')]
	
	  if(response=="Yes") {

	    stage('Release- VulabMicroservice') {
	     sh 'echo VulabMicroservice is ready to release!'

	    }
	  }
    }
}