@VerifyInvoiceTestWithCucumber
Feature: VerifyInvoiceTestWithCucumber with Cucumber feature

  Scenario Outline: VerifyInvoiceTestWithCucumber feature scenario outline
    Given Again I am on the current page "https://demo.dolibarr.org/public/demo/index.php"
    When Again I click on the manufacturer
    When Again I click on the billing button
    And When I Click on List
    And When I Paste Invoice Number
    Then I verify that Invoice Number saved in the Excel spreadsheet is the same invoice number pasted here
    And When I Click On Invoice Number After Search
    And Then I Verify Customer Name <customerParameter>
    And Then I Verify Payment Terms <paymentTermsParameter>
    And Then I Verify Payment Method <paymentMethodParameter>
    And Then I Verify Project <projectParameter>
    And Then I Verify Incoterm <incotermParameter>
    And Then I Verify doc Template <docTemplateParameter>
    And Then I Verify Currency <currencyParameter>
    And When I Click On Notes
    And Then I Verify Public Note <publicNoteParameter>
    And Then I Verify Private Note <privateNoteParameter>

    Examples: 
      | customerParameter | paymentTermsParameter | paymentMethodParameter | projectParameter | incotermParameter | docTemplateParameter | currencyParameter | publicNoteParameter   | privateNoteParameter   |
      | "test jp"         | "Due Upon Receipt"    | "Credit card"          | "PJ2208-0012"    | "FCA"             | "crabe"              | "US Dollars"      | "NO NOTES FOR PUBLIC" | "NO NOTES FOR PRIVATE" |
