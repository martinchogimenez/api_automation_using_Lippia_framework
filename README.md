# LIPPIA API Project

# Purpose
The following project has the purpose of demonstrate and let test automation developers to test API requests by using Lippia Automation Framework based on Rest Client library. 
This project includes the required components as binaries and configuration files to simply download and run a set of tests in your local computer.

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
The test cases are executed using **TestNG** class. This class is the main entry point for running tests in the TestNG framework. By creating their own TestNG object and invoke it on a testng.xml.

|**Attribute** | **Description** | 
|--------------|-----------------| 
|name   | The name of this suite. It is a **mandatory** attribute. |  
|verbose   | Whether TestNG should run different threads to run this suite. |  
|parallel   | Whether TestNG should run different threads to run this suite. |
|thread-count   | The number of threads to use, if parallel mode is enabled (ignored other-wise). |  
|annotations   | The type of annotations you are using in your tests. |  
|time-out   | The default timeout that will be used on all the test methods found in this test. |  

### testngSecuencial.xml  

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="BDD Test Suite" verbose="10" parallel="tests" thread-count="1" configfailurepolicy="continue">
    <test name="TestNg Secuencial runner Tests" annotations="JDK" preserve-order="true">
        <classes>
            <class name="com.crowdar.bdd.cukes.TestNGSecuencialRunner"/>
        </classes>
    </test>
</suite>

```

### testngParallel.xml  

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="BDD Test Suite" verbose="1" parallel="methods" data-provider-thread-count="1" thread-count="1" configfailurepolicy="continue">
    <test name="TestNg parellel runner Tests" annotations="JDK" preserve-order="true">
        <classes>
            <class name="com.crowdar.bdd.cukes.TestNGParallelRunner"/>
        </classes>
    </test>
</suite>
```
### How to select Sequential or Parallel Runner:
 
**Sequential Runner:**  
    
- In the pom.xml file, it looks for the POM in the current directory and assign the value of "testngSecuencial.xml".  
    
- This would be as follows:
```  
        <runner>testngSecuencial.xml</runner>
```         

**Parallel Runner:**  
    
- In the pom.xml file, it looks for the POM in the current directory and assign the value of "testingParalel.xml"  
    
- This would be as follows:  
```
        <runner>testngParallel.xml</runner>
```        
