#!/usr/bin/env groovy

import hudson.model.*
import hudson.EnvVars
import java.net.URL

node {
stage 'Stage 1'{
def workspace = pwd()
echo "workspace=${workspace}"
}
stage 'Stage 2'{
println InetAddress.localHost.canonicalHostName
host = slave.computer.hostName
echo "Host name of the node : ${host}"
}
}

