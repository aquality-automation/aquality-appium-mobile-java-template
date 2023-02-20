#!/bin/bash
set -ex
npm install -g appium@next
appium -v
appium driver install xcuitest
sudo /usr/bin/xcode-select -switch /Applications/Xcode.app/Contents/Developer
xcrun --sdk iphonesimulator --show-sdk-version
appium driver list
appium --allow-insecure chromedriver_autodownload --base-path /wd/hub &
