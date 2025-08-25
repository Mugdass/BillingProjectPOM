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
┣ 📂 BillingProjectPOM
┃ ┣ .classpath
┃ ┣ .project
┃ ┣ 📂 .settings
┃ ┃ ┣ org.eclipse.core.resources.prefs
┃ ┃ ┣ org.eclipse.jdt.core.prefs
┃ ┃ ┗ org.eclipse.m2e.core.prefs
┃ ┣ 📂 data
┃ ┃ ┣ .DS_Store
┃ ┃ ┗ b.xlsx
┃ ┣ 📂 features
┃ ┃ ┣ CreateInvoiceTestWithCucumber.feature
┃ ┃ ┗ VerifyInvoiceTestWithCucumber.feature
┃ ┣ pom.xml
┃ ┣ 📂 screenshot
┃ ┣ 📂 src
┃ ┃ ┣ 📂 main/java
┃ ┃ ┃ ┣ 📂 Model
┃ ┃ ┃ ┃ ┣ BaseModel.java
┃ ┃ ┃ ┃ ┣ ToBillingPageModel.java
┃ ┃ ┃ ┃ ┣ ToCustomerInvoicePageToValidateDataPageModel.java
┃ ┃ ┃ ┃ ┣ ToHomePageModel.java
┃ ┃ ┃ ┃ ┣ ToListPageModel.java
┃ ┃ ┃ ┃ ┗ ToNewInvoicePageModel.java
┃ ┃ ┃ ┣ 📂 Page
┃ ┃ ┃ ┃ ┣ ToBillingPagePage.java
┃ ┃ ┃ ┃ ┣ ToCustomerInvoicePageToValidateDataPagePage.java
┃ ┃ ┃ ┃ ┣ ToHomePagePage.java
┃ ┃ ┃ ┃ ┣ ToListPagePage.java
┃ ┃ ┃ ┃ ┗ ToNewInvoicePagePage.java
┃ ┃ ┃ ┗ 📂 lib
┃ ┃ ┃ ┗ ExcelReader.java
┃ ┃ ┗ 📂 test/java
┃ ┃ ┣ 📂 Test
┃ ┃ ┃ ┣ BaseTest.java
┃ ┃ ┃ ┣ CreateInvoiceTest.java
┃ ┃ ┃ ┣ VerifyInvoiceTest.java
┃ ┃ ┃ ┗ example_On_split_text_and_get_part_of_text.java
┃ ┃ ┗ 📂 steps
┃ ┃ ┣ CreateinvoiceTestSteps.java
┃ ┃ ┣ Runner.java
┃ ┃ ┣ StepBase.java
┃ ┃ ┗ VerifyinvoiceTestSteps.java
┃ ┣ 📂 target
┃ ┃ ┣ 📂 classes
┃ ┃ ┣ 📂 report
┃ ┃ ┃ ┣ 📂 html
┃ ┃ ┃ ┃ ┗ index.html
┃ ┃ ┃ ┗ 📂 json
┃ ┃ ┃ ┗ output.json
┃ ┃ ┗ 📂 test-classes
┃ ┃ ┣ BaseTest.class
┃ ┃ ┣ CreateInvoiceTest.class
┃ ┃ ┣ VerifyInvoiceTest.class
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
