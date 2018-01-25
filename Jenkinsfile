pipeline{
	agent any
	stages{
	
		stage('complie stage'){
				steps{
					
					sh 'mvn clean compile'
					
				}
		
		}
		
		stage('Testing stage'){
				steps{
					
					sh 'mvn test'
					
				}
		
		}
	
	}
	
	
	

}
