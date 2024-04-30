1) **SampleUIFramework**
Software Required:
	1) java 11
	2) maven 3.9.4
	3) eclipse
	4) Install Cucumber Eclipse Plugin in eclipse
	5) Install TestNG plugin in eclipse

2. **Instructions to run the Project.**
    1) Download the file https://github.com/vinil-p/SampleUIFramework/blob/main/cucumweb.zip.
    2) Extract the folder and import as maven project to eclipse.
    3) run command "mvn clean install" so that all dependent jar files will be downlaoded.
    4) Clean the project in Eclipse.
    5) Run Executor.java file and configure the required cucumber tags in that file.

3. **General Flow of Any Selenium Framework with POM model and Cucumber.** 


![image](https://github.com/vinil-p/SampleUIFramework/assets/20809464/f265766a-8c5c-4388-afa8-5956fc8b0eda)

4) **Project Structure The project structure is organized as follows:**


![image](https://github.com/vinil-p/SampleUIFramework/assets/20809464/e9356573-16cb-43b5-b649-c662a94c8e08)

 

5) **Test Results**
•	Test report automatically generated on target folder after finished the test execution
•	See test report from target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html
•	You can also share your Cucumber Report with another person at https://reports.cucumber.io, just go to src/test/resources/cucumber.properties then change the value to be true
	cucumber.publish.enabled=true
•	For more information about reports cucumber you can go to https://reports.cucumber.io/docs/cucumber-jvm

