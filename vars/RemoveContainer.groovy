def call() {
    sh 'docker stop youtube-app'
    sh 'docker rm youtube-app'
} 
