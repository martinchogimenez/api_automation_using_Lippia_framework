# LIPPIA API Project

# Purpose
The following project has the purpose of demonstrate and let test automation developers to test API requests by using Lippia Automation Framework based on Rest Client library. 
This project includes the required components and configuration files to simply download and run a set of tests in your local computer.

## System Requirements: 
+ JDK: https://docs.oracle.com/en/java/javase/index.html 
+ Maven: https://maven.apache.org/download.cgi 
+ Git client: https://www.atlassian.com/git/tutorials/install-git 


# Getting started

- Running only with Maven [`Getting started - Running only with Maven`](docs/README_Maven.md)

	
## Reports are generated in the folder called **target**, which will be generated once the execution of the test suite is finished.   
Note that the following structure is part of the report generated with ExtentReport library.
```
├── lippia_api_project
|   ├── docs
|   |   └── ...
|   ├── src
|   |   └── ...
│   ├── target
│   |   └── reports
|   |       └── index.html
|   └── ...
```

Folder's description:

|Path   |Description    |
|-------|----------------|
|main\java\\...\model\\\*.java|Folder with all the **Mapped Objects** matching steps with java code |
|main\java\\...\config\\\*Steps.java|Folder with all the **Settings** wich match with Gherkin Test Scenarios |
|test\resources\features\\\*.feature|Folder with all the **feature files** containing **Test Scenarios** and **Sample Data** |
|test\resources\request\\\*.json|Folder with all the **json files** containing **Request** data |
|test\resources\response\\\*.json|Folder with all the **json files** containing **Response** data if necessary |
|main\resources|Folder with all configuration needed to run Lippia |




## Runners
***
```
├── lippia-api-sample-project
│   ├── docs
│   │   └── ...
│   ├── src
│   │   ├── main
│   ├── java
│   │     └── ...
│   ├── resources 
│   │     └── ...
│   ├── test
│   │     ├── resources
│   │     │ └── ...
│   │ 
│   ├── pom.xml
│   ├── testngParalell.xml
│   ├── testng.xml
│          
│  
```
