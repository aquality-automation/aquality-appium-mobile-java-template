#!/bin/bash
set -ex
npm install --ignore-scripts -g appium@3
appium -v
appium driver install uiautomator2
appium driver list
appium --allow-insecure uiautomator2:chromedriver_autodownload --base-path /wd/hub &
