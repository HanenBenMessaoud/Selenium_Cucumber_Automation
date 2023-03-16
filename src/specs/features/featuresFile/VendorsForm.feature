
@vendor
Feature: Vendors Formulaire
  je veux ajouter un vendeur en remplissant le formulaire vendors
  
    Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le Password "admin"
    And Je clique sur le bouton LOGIN

  @vendor
  Scenario: Remplisage du formulaire

    When je clique sur Vendors
    Then l interface recherche vendors s affiche
    When je clique sur add new
    Then l interface add new vendor vendors s affiche
    When je remplis le champs name "VendorTest"
    And  je remplis le champs description "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"
    And  je remplis le champs description "lorem@gmail.com"
    And  je clique sur le boutton save 
    Then un nouveau vendeur s ajoute