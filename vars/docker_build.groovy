def call (String Projectname, String ImageTag, String dockerhubuser){
  sh "docker build -t ${dockerhubuser}/${Projectname}:{ImageTag} ."
}
