[![Build Status](https://dev.azure.com/aquality-automation/aquality-automation/_apis/build/status/aquality-automation.aquality-appium-mobile-java-template?branchName=master)](https://dev.azure.com/aquality-automation/aquality-automation/_build/latest?definitionId=11&branchName=master)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=aquality-automation_aquality-appium-mobile-java-template&metric=alert_status)](https://sonarcloud.io/dashboard?id=aquality-automation_aquality-appium-mobile-java-template)

# Aquality Appium Mobile Template Project
Template for [aquality-appium-mobile-java](https://github.com/aquality-automation/aquality-appium-mobile-java) library.

### Project structure
- **aquality-appium-mobile-template** - project related part with PageObjects, models and utilities
  - **configuration/**: classes that used to fetch project config from [src/main/resources/environment](https://github.com/aquality-automation/aquality-appium-mobile-java-template/blob/master/aquality-appium-mobile-template/src/main/resources/environment) folder
  - **screens/**: Page Objects
  - **models/**: classes that represent data models of the application under the test (POJO classes)
  - **utilities/**: util classes
  - **src/main/resources/**: resource files such as configurations and test data
- **aquality-appium-mobile-template-cucumber** - Cucumber implementation of the tests
  - **features/**: Gherkin feature files with test scenarios
  - **hooks/**: Cucumber [hooks](https://specflow.org/documentation/Hooks/)
  - **stepdefinitions/**: step definition classes
  - **transformations/**: Cucumber [data transformations](https://cucumber.io/docs/cucumber/configuration/)
  - **objectfactory/**: [DI container](https://cucumber.io/docs/cucumber/state/#how-to-use-di) configuration

### Configuration
[settings.json](https://github.com/aquality-automation/aquality-appium-mobile-java-template/blob/master/aquality-appium-mobile-template/src/main/resources/settings.json) file contains settings of Aquality Appium Mobile library. Additional information you can find [here](https://github.com/aquality-automation/aquality-selenium-java/wiki/Overview-(English)).

[allure.properties](https://github.com/aquality-automation/aquality-appium-mobile-java-template/blob/master/aquality-appium-mobile-template/src/main/resources/allure.properties) is a part of Allure Report configuration. See details [here](https://docs.qameta.io/allure/). 

> **NOTE:**
> Do not store application executable under source control as [here](https://github.com/aquality-automation/aquality-appium-mobile-java-template/blob/master/aquality-appium-mobile-template-cucmber/src/test/resources/applications).
> This is done only for demo purpose. For example, you can implement task in your CI system that will download and install necessary version of your application under the test. The delivery of application builds/updates may vary.

### Tests execution
Scenarios from feature files can be executed with TestNG plugin for IDE (Intellij Idea, Eclipse)
or with Maven command ```mvn clean test``` where you can specify all necessary arguments.

### Reporting 
Allure Framework is used as a reporting tool. Report data will be placed in ```target/allure-results/``` folder (you can change it in ```allure.properties``` file).

Run maven command ```mvn allure:serve``` to build and open report in web browser. To generate report in CI use corresponding plugin for your system.

### License
Library's source code is made available under the [Apache 2.0 license](https://github.com/aquality-automation/aquality-appium-mobile-java-template/blob/master/LICENSE).