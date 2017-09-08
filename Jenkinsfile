import hudson.model.*
import hudson.EnvVars
import java.net.URL

pipeline{
    agent any
	stages{
		stage ('Test'){
		steps{
		def workspace = pwd()
		echo "workspace=${workspace}"
		}
		}
		stage ('Test'){
		steps{
		println InetAddress.localHost.canonicalHostName
		host = slave.computer.hostName
		echo "Host name of the node : ${host}"
		}
		}
	}
}
