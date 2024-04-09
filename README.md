# Automated Testing Pipeline Integration with GitHub Actions

## Overview

This GitHub repository hosts an automated testing pipeline that integrates multiple testing frameworks, including Postman, Nightwatch.js, JMeter, Rest Assured, and Selenium. The objective of this project is to set up a CI/CD pipeline for automated testing, enabling developers to trigger tests on demand and schedule them to run at specific intervals.

## Project Details

### Repository Structure

The repository contains the following directories and files:

- **.github/workflows**: This directory contains the GitHub Actions workflow file (test.yml) that defines the CI/CD pipeline for running automated tests.
  
- **Postman_Assignment**: Contains Postman collection files (Go_REST.postman_collection.json) and environment configuration files (Test_env.postman_environment.json) for API testing.

- **DemoQA**: Includes Nightwatch.js configuration file (nightwatch.conf.js) and test scripts (loginTest.js, registrationTest.js) for UI testing.

- **Jmeter_Assignment**: Contains JMeter test scripts (CredentialsView Results Tree.jmx, testingHTTP(S) Test Script Recorder.jmx) and associated CSV data files (credential.csv, list.csv, pokemonName.csv) for load testing.

- **RestAssured**: Holds the Maven project (pom.xml) and source code for Rest Assured API testing.

- **Calculator_test**: Includes the Maven project (pom.xml) and source code for Selenium UI testing.

### Workflow

The GitHub Actions workflow file (test.yml) manages the automated testing pipeline. It defines jobs for each testing framework, including installation of dependencies, execution of tests, and generation of reports.

### Getting Started

To get started with the automated testing pipeline:

1. Clone this repository to your local machine.
2. Set up the necessary development environment for running automated tests with each testing framework.
3. Customize the configurations and test scenarios according to your project requirements.
4. Trigger the pipeline manually or schedule it to run at specific intervals to execute the tests.
5. Monitor the pipeline execution and review test reports to ensure the reliability of your application.

## Conclusion

By utilizing this automated testing pipeline, developers can streamline the testing process, identify bugs early in the development cycle, and ensure the quality and reliability of their software applications. Continuous integration of automated testing enhances the overall efficiency and effectiveness of the software development lifecycle.
