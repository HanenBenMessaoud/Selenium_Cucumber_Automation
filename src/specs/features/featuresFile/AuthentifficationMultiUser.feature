@authentification
Feature: Authentification avec multi utiliseurs
  je souhaite me connecter sur l application avec multi utilisateurs

  @multi_utilisateurs
  Scenario Outline: je souhaite me connecter sur l application avec multi utilisateurs
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "<email>"
    And Je saisis le Password "<password>"
    And Je clique sur le bouton LOGIN

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | xxx@yourstore.com   | xxx      |
      | addd@yourstore.com  | admin    |
