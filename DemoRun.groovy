

jaas_sensor_step {
name = "UI"
pipelinephase = "Build"
script {
    env.RELEASE_SCOPE = input message: 'User input required', ok: 'Release!',
            parameters: [choice(name: 'RELEASE_SCOPE', choices: '1\n2\n3', description: 'What is the release scope?')]
    string(defaultValue: "TEST", description: 'Product ID?', name: 'userFlag1')
    string(defaultValue: "TEST", description: 'Branch ?', name: 'userFlag2')
    string(defaultValue: "TEST", description: 'Year ?', name: 'userFlag3')
}
echo "${env.RELEASE_SCOPE}"
}
