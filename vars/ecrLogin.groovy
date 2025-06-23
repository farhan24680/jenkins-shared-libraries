def call(String region, String registry) {
    sh """
        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${registry}
    """
}
