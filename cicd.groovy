node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/zigiport.git'), string(name: 'PORT_DESCRIPTION', value: 'z/OS ISPF Git interface' )]
  }
}
