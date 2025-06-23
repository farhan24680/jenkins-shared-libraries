def call(String repoName, String region = 'ap-south-1') {
    def check = sh(
        script: "aws ecr describe-repositories --region ${region} --repository-names ${repoName}",
        returnStatus: true
    )
    if (check != 0) {
        echo "Creating ECR repository: ${repoName}"
        sh "aws ecr create-repository --repository-name ${repoName} --region ${region}"
    } else {
        echo "ECR repository '${repoName}' already exists."
    }
}
