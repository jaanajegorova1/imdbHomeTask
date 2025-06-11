# Home Task

### Preconditions: 
Use: Gradle, Selenide, java 17, TestNG, Allure-report

Test URL =  https://www.imdb.com/

Automate a regression test case by steps, that described in Search.features. 

Path: project > src > test > resouces > features > Search.feature


#### POM design pattern is used. 

Project located under "src" (source) directory.

Under "main" directory, in "java" directory we can see two packages: "environment" and "pages".
In *src/main/java/environment/URL* saved baseURL = test link
In *src/main/java/environment/EnvironmentConfig* all configurations for environment, and methods to  login and logout from URL.

Under "pages" directory, in "java" directory we can see two packages: "environment" and "pages".
In *src/main/java/pages/MainPage* saved our 1st main page for testing
In *src/main/java/pages/MoviePage* 2nd tested page
In *src/main/java/pages/ActorPage* 3rd tested page

In *src/main/java/resources/allure.properties* pointed allure results directory

All tests are located in directory "src/test/java/testSteps"

