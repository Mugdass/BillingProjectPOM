@CreateInvoiceTestWithCucumber
Feature: CreateInvoiceTestWithCucumber with Cucumber feature
  I want to use this template for my feature file

  Scenario Outline: CreateInvoiceTestWithCucumber feature scenario outline
    Given I am on the current page "https://demo.dolibarr.org/public/demo/index.php"
     When I click on the manufacturer
    When I click on the billing button
    And When I Click New Invoice button
    And When I Click On Select Third Party
    And When I select third party <customerParameter>
    And When I Click On Payment Terms
    And When I Select Payment Terms <paymentTermsParameter>
    And When I Select Type
    And When I Select Invoice Date
    And When I Click On Payment Method
    And When I Select Payment Method <paymentMethodParameter>
    And When I Click On BankAccount
    And When I Select Bank Account <bankAccountParameter>
    And When I Click On Project
    And When I Select Project <projectParameter>
    And When I Select Incoterm From Drop Down <incotermParameter>
    And When I put Incoterm Input <incotermInputParameter>
    And When I Click On Doc Template
    And When I Select Doc Template <docTemplateParameter>
    And When I Click On Currency
    And When I Select Currency <currencyParameter>
    And When I Write Public Note <publicNoteParameter>
    And When I Write Private Note <privateNoteParameter>
    And When I Click On Create Draft button
    And When I Save To Excell

    Examples: 
      | customerParameter | paymentTermsParameter | paymentMethodParameter | bankAccountParameter | projectParameter | incotermParameter | incotermInputParameter            | docTemplateParameter | currencyParameter | publicNoteParameter   | privateNoteParameter   |
      | "test jp"         | "Due Upon Receipt"    | "Credit card"          | "test"               | "PJ2208-0012"    | "FCA"             | "don't know what an incoterm is!" | "crabe"              | "US Dollars"      | "NO NOTES FOR PUBLIC" | "NO NOTES FOR PRIVATE" |
