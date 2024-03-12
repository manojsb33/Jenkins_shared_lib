def call() {
    sh 'docker run -d --name youtube-app -p 3000:3000 manoj3366/youtube:latest'
}
