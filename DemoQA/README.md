# Automated Testing of Demo Website using Nightwatch.js and Page Object Model


## Objective
Testing a Website using Nightwatch.js with Page Object model design pattern.


## Overview

>This repository contains automated test scripts for a demo website using Nightwatch.js,
>a popular end-to-end testing framework, and follows the Page Object Model (POM) design
>pattern for better maintainability and readability of test code automation scripts.
>The website chosen for this is a form filling demo website which contains various input fields
>here i'm only checking filling form with mandatroy fields inputs.



## Website Under Test

For implementing the above objective a demo website is chosen.
...

Website URL:"https://demoqa.com/automation-practice-form"


## Features

- Automated testing of form inputs on demoQA website.
- Utilizes Nightwatch.js for end-to-end testing.
- Follows the Page Object Model for better test structure and maintenance.

## Requirements

- Node.js (v12.x or later)
- Nightwatch.js
- WebDriver (ChromeDriver, GeckoDriver, etc.)

## Project Structure

```sh
DEMOQA/
│
├── page-objects/               # Page Object Model (POM) directory
│   ├── Homepage.js       # Page object for form page
│
├── test/                # Test scripts directory
│   ├── Tests.js      # Test scripts for form inputs
│   └── ...
│
│
├── nightwatch.conf.js    # Nightwatch configuration file
└── package-lock.json          
└── package.json          # Node.js dependencies and scripts




