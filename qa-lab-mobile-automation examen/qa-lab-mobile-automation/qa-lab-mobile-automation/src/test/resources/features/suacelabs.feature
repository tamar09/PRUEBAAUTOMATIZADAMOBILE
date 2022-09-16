Feature: Login Saucelabs

  @sauce
  Scenario: Login SauceLabs

    Given que me encuentro en el login SauceLabs
    When ingresamos el login del usuario "standar_user"
    And  la constraseña es "secret_sauce"
    Then le doy click a login
