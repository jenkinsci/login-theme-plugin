# Login Theme Plugin for Jenkins

[![Jenkins Plugin](https://img.shields.io/jenkins/plugin/v/login-theme.svg)](https://plugins.jenkins.io/login-theme)
[![GitHub release](https://img.shields.io/github/release/jenkinsci/login-theme-plugin.svg?label=changelog)](https://github.com/jenkinsci/login-theme-plugin/releases/latest)
[![Jenkins Plugin Installs](https://img.shields.io/jenkins/plugin/i/login-theme.svg?color=blue)](https://plugins.jenkins.io/login-theme)

This plugin allows extending and overriding the default theme used on the login and signup pages on Jenkins

## Usage

After installation, its settings are available in *Manage Jenkins » Appearance » Login Page Theme*

Two modes are supported and controlled by the option *Use default theme*:

* If checked, it will extend the default theme with additional
content
* Otherwise, it will replace it entirely.

For example

![System config](docs/system_config_page.jpeg)

## Result

Previous config will render login page customization

![Login page](docs/login_result_page.jpeg)

## Configuration as code

```
appearance:
  loginTheme:
    footer: 'The footer'
    head: ''
    header: '<h3>Welcome to login theme Jenkins</h3>'
    branding: 'Image Url'
    customCSS: ''
    useDefaultTheme: true
```

