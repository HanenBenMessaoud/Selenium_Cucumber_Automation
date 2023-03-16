@custmors_Form
Feature: Ajouter un formulaire client
  je veux ajouter un client en remplissant le formulaire client
  
    Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @ajout_Client
  Scenario: Remplisage du formulaire 

    When je clique sur Custmors
    Then la sous liste Custmors s affiche
    When je clique sur Icon Custmors
    And je clique sur le boutton Add New
    Then un formulaire pour ajouter un client s affiche
    When je remplis les champs obligatoires du formulaire
    And je clique sur save
    Then un nouveau client s ajoute 
    And un message s affiche The new customer has been added successfully.