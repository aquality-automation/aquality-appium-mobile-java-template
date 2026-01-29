#!/bin/bash
set -ex
npm install --ignore-scripts -g appium@3
appium -v
appium driver install xcuitest
sudo /usr/bin/xcode-select -switch /Applications/Xcode.app/Contents/Developer
xcrun --sdk iphonesimulator --show-sdk-version
appium driver list
appium --allow-insecure uiautomator2:chromedriver_autodownload --base-path /wd/hub &
