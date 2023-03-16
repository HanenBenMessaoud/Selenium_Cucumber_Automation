@smoke_test
Feature: Logout de l application nopcommerce
  En tant que utilisateur, je souhaite me déconneter de l application

  @logout
  Scenario: deconnexion de sur l applicaion nopcommerce
   Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN
    When Je clique sur le bouton Logout 
    Then Je me redirige vers la page de connexion "Admin area demo"