# 🧾 Billing Project POM - Test Automation Framework

![Build](https://github.com/your-username/BillingProjectPOM/actions/workflows/ci.yml/badge.svg)
![Jenkins](https://img.shields.io/badge/Jenkins-Pipeline-green)

## 📌 Overview
This is a **Page Object Model (POM) based Hybrid Test Automation Framework** built with:
- Java + Selenium WebDriver
- TestNG + JUnit + Cucumber (BDD)
- Apache POI (Excel Data-Driven)
- Allure Reporting (with screenshots on failure)
- Config-driven cross-browser support (Chrome, Firefox, Edge)
- CI/CD: GitHub Actions + Jenkins pipeline

## 🚀 Features
- Page Object Model (POM) design pattern
- Hybrid test support: UI + API + Data-driven
- Configurable browsers (via `config.properties` or `-Dbrowser`)
- Automatic screenshots on failure (attached to Allure reports)
- CI pipelines for **GitHub Actions** and **Jenkins**

## 📂 Project Structure
```
BillingProjectPOM
 ┣ 📂 src/main/java
 ┃ ┗ 📂 utils
 ┃   ┣ DriverFactory.java
 ┃   ┣ ReportingUtils.java
 ┃   ┗ ConfigReader.java
 ┣ 📂 src/test/java/tests
 ┃ ┗ SampleFailTest.java
 ┣ 📂 src/test/resources
 ┃ ┗ config.properties
 ┣ pom.xml
 ┣ Jenkinsfile
 ┣ .github/workflows/ci.yml
 ┗ README.md
```

## ⚙️ Configuration
Edit `src/test/resources/config.properties`:
```properties
browser=chrome
headless=false
baseUrl=https://example-billing-app.com
```

## ▶️ Running Tests

**Default (Chrome):**
```bash
mvn clean test
```

**Cross-Browser:**
```bash
mvn clean test -Dbrowser=firefox
mvn clean test -Dbrowser=edge -Dheadless=true
```

**Allure Report:**
```bash
mvn clean test
allure serve target/allure-results
```

## 🔗 CI/CD

### GitHub Actions
- Runs on **JDK 11 & 17**
- Cross-browser (Chrome, Firefox)
- Uploads **Allure results + screenshots**

### Jenkins
- Declarative pipeline in `Jenkinsfile`
- Runs tests on Chrome + Firefox
- Archives **Allure results + reports**

---
✅ This repo can serve as a **QA Portfolio Project** for interviews and LinkedIn showcase.
