@Test
Feature: To test subscription page with validations

Background: 
    Given I am opening the "chrome" browser
 	Then I am navigating to the "https://subscribe.stctv.com/sa-ar"
 	
Scenario:  Validations for Bahrain
  And I am waiting for "10000" milliseconds
  Given I am clicking the element "EnglishLanguageTranslation"
  And I am waiting for "5000" milliseconds
  Given I am clicking the element "CountryChangeButton"
  Given I am clicking the element "BahrainCountryOption"
  Then I am validating the text "2" in element "LiteSusbscriptionPrice"
  Then I am validating the text "BHD" in element "CurrencyLite"
  Then I am validating the text "3" in element "ClassicSusbscriptionPrice"
  Then I am validating the text "BHD" in element "CurrencyClassic"
  Then I am validating the text "6" in element "PremiumSusbscriptionPrice"
  Then I am validating the text "BHD" in element "CurrencyPremium"

  Scenario:  Validations for KSA
    And I am waiting for "10000" milliseconds
    Given I am clicking the element "EnglishLanguageTranslation"
    And I am waiting for "5000" milliseconds
    Given I am clicking the element "CountryChangeButton"
    Given I am clicking the element "KSACountryOption"
    Then I am validating the text "15" in element "LiteSusbscriptionPrice"
    Then I am validating the text "SAR" in element "CurrencyLite"
    Then I am validating the text "25" in element "ClassicSusbscriptionPrice"
    Then I am validating the text "SAR" in element "CurrencyClassic"
    Then I am validating the text "60" in element "PremiumSusbscriptionPrice"
    Then I am validating the text "SAR" in element "CurrencyPremium"

  Scenario:  Validations for Kuwait
    And I am waiting for "10000" milliseconds
    Given I am clicking the element "EnglishLanguageTranslation"
    And I am waiting for "5000" milliseconds
    Given I am clicking the element "CountryChangeButton"
    Given I am clicking the element "KuwaitCountryOption"
    Then I am validating the text "1.2" in element "LiteSusbscriptionPrice"
    Then I am validating the text "KWD" in element "CurrencyLite"
    Then I am validating the text "2.5" in element "ClassicSusbscriptionPrice"
    Then I am validating the text "KWD" in element "CurrencyClassic"
    Then I am validating the text "4.8" in element "PremiumSusbscriptionPrice"
    Then I am validating the text "KWD" in element "CurrencyPremium"

