#!/bin/bash
set -ex
npm install -g appium@next
appium -v
appium driver install uiautomator2
appium driver list
appium --allow-insecure chromedriver_autodownload --base-path /wd/hub &
