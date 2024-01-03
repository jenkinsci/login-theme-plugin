# Login Theme Plugin for Jenkins

[![Build Status](https://ci.jenkins.io/job/Plugins/job/login-theme-plugin/job/main/badge/icon)](https://ci.jenkins.io/job/Plugins/job/login-theme-plugin/job/main/)
[![Coverage](https://ci.jenkins.io/job/Plugins/job/login-theme-plugin/job/main/badge/icon?status=${instructionCoverage}&subject=coverage&color=${colorInstructionCoverage})](https://ci.jenkins.io/job/Plugins/job/login-theme-plugin/job/main)
[![LOC](https://ci.jenkins.io/job/Plugins/job/login-theme-plugin/job/main/badge/icon?job=test&status=${lineOfCode}&subject=line%20of%20code&color=blue)](https://ci.jenkins.io/job/Plugins/job/login-theme-plugin/job/main)
[![Jenkins Plugin](https://img.shields.io/jenkins/plugin/v/login-theme.svg)](https://plugins.jenkins.io/login-theme)
[![GitHub release](https://img.shields.io/github/release/jenkinsci/login-theme-plugin.svg?label=changelog)](https://github.com/jenkinsci/login-theme-plugin/releases/latest)
[![Jenkins Plugin Installs](https://img.shields.io/jenkins/plugin/i/login-theme.svg?color=blue)](https://plugins.jenkins.io/login-theme)

This plugin allows extending and overriding the default theme used on the login and signup pages on Jenkins

## Usage

After installation, its settings are available in *Manage Jenkins » Configure System » Login Page Theme*

Two modes are supported and controlled by the option *Use default theme*:

* If checked, it will extend the default theme with additional
content
* Otherwise, it will replace it entirely.

For example

![System config](docs/system_config.png)

## Configuration as code

```
appearance:
  loginTheme:
    footer: 'The footer'
    head: ''
    header: '<h3>Welcome to login theme Jenkins</h3>'
    useDefaultTheme: true
```

## Result

Previous config will render login page customization

![Login page](docs/login_result.png)