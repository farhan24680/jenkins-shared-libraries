def call(String imageName, String tag) {
    def registry = "420065944332.dkr.ecr.ap-south-1.amazonaws.com"
    sh "docker build -t ${registry}/${imageName}:${tag} ."
}
