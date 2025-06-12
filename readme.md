# Home Task

### Preconditions: 
Install Gradle, Selenide, Java, TestNG, Allure-report. 
IDE was used IntelliJ IDEA free version.

### Task:
Automate a regression test case by steps, that described in Search.features
"src/test/resources/feature/Search.feature"

Test URL =  https://www.imdb.com/

### Structure:
For each page created own class with the same name. 
Each page has defined elements (title, field, name, button, etc.).

*src/main/java/pages/MainPage*  1st tested page 
*src/main/java/pages/MoviePage* 2nd tested page
*src/main/java/pages/ActorPage* 3rd tested page

### Test execution:
An argument "tags" presented in build.gradle defines  which tests to execute. We can mention in "build.gradle" single tag or multiple tags, for one scenario, or multiple.
In turn, tags pointed for scenario in "features/Search.feature".
And in build.gradle file it's possible to select Run tests in parallel by uncommenting "--threads" argument.

### Local test execution:
1.Select option Run the "TestRunner.java" from IDE, path: "src/test/java/runner/TestRunner.java"
2.Click Run button in "TestRunner.java" file, path: "src/test/java/runner/TestRunner.java"
3.Run file using Run button on the top menu (check that correct file selected, "TestRunner")
4.Run test cases from Terminal, using "gradle testSuite" command. It executes tests with local gradle, that installed on your machine.
5.Run test cases from Terminal, using "./gradlew testSuite" command. It executes tests with gradle wrapper from the project, which means that not necessary to have gradle installed on your machine.
Example of command to run test cases from Terminal: ./gradlew testSuite

### Allure Report:
After test case run, we can generate the Allure report.
Example of commands to run test cases from Terminal: ./gradlew allureReport or ./gradlew allureServe

### Cucumber Report:
After you run test cases using command "gradle testSuite", the "Cucumber Report" is generated under "target/cucumber-report.html".  Then you can open generated report in any browser suggested on the top of report.

### How use Gradle from IntelliJ IDEA:
Click on the right side on Gradle icon (elephant).
Under the project "imdbHomeTask" -> go to "Tasks":
1. -> build -> clean (double click and wait, it will clean build direction)
2. -> other -> testSuite (double click and wait, it will run your test cases)
3. -> verification -> allureReport / allureServe (double click and wait, it will generate Allure Report)
           
### GitHub:
URL: https://github.com/jaanajegorova1/imdbHomeTask.git
Ci/CD processes can be visible under Actions tab.