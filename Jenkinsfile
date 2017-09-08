#!/usr/bin/env groovy

import hudson.model.*
import hudson.EnvVars
import java.net.URL

pipeline{
 agent {

	node(win-slave) {
	stages{
		stage 'Stage 1'{
		steps{
		def workspace = pwd()
		echo "workspace=${workspace}"
		}
		}
		stage 'Stage 2'{
		steps{
		println InetAddress.localHost.canonicalHostName
		host = slave.computer.hostName
		echo "Host name of the node : ${host}"
		}
		}
	      }
	}
       }
}

