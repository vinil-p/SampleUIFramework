1) **SampleUIFramework**
Software Required:
1) java 11
2) maven 3.9.4
3) eclipse
4) Install Cucumber Eclipse Plugin in eclipse
5) Install TestNG plugin in eclipse


2)**General Flow of Any Selenium Framework with POM model and Cucumber.** 


![image](https://github.com/vinil-p/SampleUIFramework/assets/20809464/f265766a-8c5c-4388-afa8-5956fc8b0eda)

3) **Project Structure The project structure is organized as follows:**


├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── pages
│   │               ├── pages           (All the Page Object classes)
│   │               
│   │           └── driver
│   │               └── ConfigurationDriver.java (Contains browser Launch related code)
│   │           └── repo
│   │               └── Repository.java (Common Utils/Common code)
│   │   └── resources
│   │       └── features (All the Feature Files)
│   └── test
│       └── java
│           ├── run                (Executor.java--Cucumber Executable code where you can pass the tags)
│           └── tests             (All the test methods related with respect to cucumber step definitions)
├── pom.xml                   (Maven configuration)
 

4) **Test Results**
•	Test report automatically generated on target folder after finished the test execution
•	See test report from target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html
•	You can also share your Cucumber Report with another person at https://reports.cucumber.io, just go to src/test/resources/cucumber.properties then change the value to be true
	cucumber.publish.enabled=true
•	For more information about reports cucumber you can go to https://reports.cucumber.io/docs/cucumber-jvm

