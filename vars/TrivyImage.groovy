def call() {
    sh 'trivy image manoj3366/youtube:latest > trivyimage.txt'
}
