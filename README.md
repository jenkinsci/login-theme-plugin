# Login Theme Plugin for Jenkins

[![Jenkins Plugin](https://img.shields.io/jenkins/plugin/v/role-strategy.svg)](https://plugins.jenkins.io/login-theme-plugin)
[![GitHub release](https://img.shields.io/github/release/jenkinsci/login-theme-plugin-plugin.svg?label=changelog)](https://github.com/jenkinsci/login-theme-plugin/releases/latest)
[![Jenkins Plugin Installs](https://img.shields.io/jenkins/plugin/i/login-theme.svg?color=blue)](https://plugins.jenkins.io/login-theme)

This plugin allows extending and overriding the default theme used on the login and signup pages since Jenkins 2.128.

## Usage

After installation, its settings are available in *Manage Jenkins » Configure System » Login Page Theme*

Two modes are supported and controlled by the option *Use default theme*:

* If checked, it will extend the default theme with additional
content
* Otherwise, it will replace it entirely.

See the related [announcement blog post for the new 2.128 login theme](https://jenkins.io/blog/2018/06/27/new-login-page/) for technical background.

## Security Notice

In *very rare* configurations, this functionality could amount to a potential security issue.

* Dangerous permissions are enabled for the instance 
 (not recommended, see the [security advisory](https://jenkins.io/security/advisory/2017-04-10/#matrix-authorization-strategy-plugin-allowed-configuring-dangerous-permissions)).
* Configuration sets `Overall/Administer` and `Overall/RunScripts` differently, and not allowing administrators to configure the Markup Formatter 

Only install this plugin, or make it available for installation, if you trust all your Jenkins administrators not to abuse these options.
