import hudson.model.*
import hudson.EnvVars
import java.net.URL


def workspace = pwd()

pipeline{
    agent any
	stages{
		stage ('Build'){
		steps{
		echo "workspace=${workspace}"
		}
		}
		stage ('Test'){
		steps{
		println InetAddress.localHost.canonicalHostName
		}
		}
	}
}
