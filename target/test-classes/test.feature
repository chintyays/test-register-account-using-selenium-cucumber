Feature: Cermati register account scenario

  Scenario: Register account with valid credentials with parameter
    Given Open Chrome browser
    Then User input "hot-chocholate@gmail.com" on field email
    And User input "cookie123" on field kata sandi
    And User input "cookie123" on field konfirmasi kata sandi
    And User input "Coklat" on field nama depan
    And User input "Test" on field nama belakang
    And User input "081303121432" on field nomor telepon
    And User input "KOTA JAKARTA SELATAN" on field kabupaten/kota
    And User click button submit