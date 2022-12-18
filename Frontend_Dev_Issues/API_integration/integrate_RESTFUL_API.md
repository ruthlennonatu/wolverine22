
# RESTful API

It is best to integrate these API calls into a CI/CD pipeline for fully automated building and deployment.

To fully automate the building, testing and deployment of modern applications, RESTful API calls are essential for information transfer between services. 

RESTful API applications rely heavily on HTTP requests to external services to GET, POST, PUT and DELETE data. 

This information transfer is done with RESTful or REST APIs to reduce the bandwidth associated with traditional APIs. 

REST APIs are essential for distributed computing and cloud-based technologies. 

One example is publishing packages to a deployment bucket using the  REST API. 

Another is using cURL to download a package from the web to be installed.

 
# Useing cURL in your pipeline to communicate with the Bintray REST API. 
 
 It is common for a build to fail because of an external service that is down. One great way to use REST APIs in your pipeline is to check that these services are operational before continuing the build. This provides you with an opportunity to craft a custom message for this particular method of failure and eliminates any need for a developer to spend time debugging the fail.

 Set up the Get Bintray API status step of the check job to run first and the build job is now dependent on it. 
 
 Bintray API checks the status and then uses logic to fail and exit our application if the status is anything other than “All Systems Operational.” 
 
 This process can limit the costs as well as save time for your engineers because if Bintray is unavailable, the job doesn’t sit waiting for cURL to timeout and there is no need to spend much time investigating the fail.

