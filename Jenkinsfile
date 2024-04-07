node {
    stage ("Checkout VulabMicroservice"){
        git branch: 'main', url: ' https://github.com/foxwas/vulab-microservice-gradle.git'
    }
    
    stage ("Maven Build - VulabMicroservice") {
	
        'gradle clean build'

    }
    
    stage ("Package - VulabMicroservice") {
        'gradle bootjar'
    }
    
    stage ("API Tests- VulabMicroservice") {
        'gradle test'
    }
    
    stage('User Acceptance Test - VulabMicroservice') {
	
	  def response= input message: 'Is this build good to go?',
	   parameters: [choice(choices: 'Yes\nNo', 
	   description: '', name: 'Pass')]
	
	  if(response=="Yes") {

	    stage('Release- VulabMicroservice') {
	     'echo VulabMicroservice is ready to release!'

	    }
	  }
    }
}