# CucumberDemo
A sample maven project to demonstrate the cucumber BDD features.

## Create a Cucumber project
We’ll start by creating a new project directory with the cucumber-archetype Maven plugin. 
Open a terminal, go to the directory where you want to create your project, and run the following command:
```
mvn archetype:generate "-DarchetypeGroupId=io.cucumber" "-DarchetypeArtifactId=cucumber-archetype" "-DarchetypeVersion=7.5.0" "-DgroupId=org.asr" "-DartifactId=CucumberDemo" "-Dpackage=CucumberDemo" "-Dversion=1.0.0-SNAPSHOT" "-DinteractiveMode=false"
```
You should get something like the following result:
```
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: cucumber-archetype:7.5.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: org.asr
[INFO] Parameter: artifactId, Value: CucumberDemo
[INFO] Parameter: version, Value: 1.0.0-SNAPSHOT
[INFO] Parameter: package, Value: CucumberDemo
[INFO] Parameter: packageInPathFormat, Value: CucumberDemo
[INFO] Parameter: package, Value: CucumberDemo
[INFO] Parameter: groupId, Value: org.asr
[INFO] Parameter: artifactId, Value: CucumberDemo
[INFO] Parameter: version, Value: 1.0.0-SNAPSHOT
[INFO] Project created from Archetype in dir: D:\framework\CucumberDemo
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
## Open the project in Eclipse:
- File -> Import -> Existing Maven Project
- Select the project from your directory
- Click Finish

You now have a small project with Cucumber installed.

## Verify Cucumber installation
To make sure everything works together correctly, let’s run Cucumber.
```
mvn test
```
You should see something like the following:
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.asr.sample.RunCucumberTest
Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec - in org.asr.sample.RunCucumberTest

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
Cucumber’s output is telling us that it didn’t find anything to run.
