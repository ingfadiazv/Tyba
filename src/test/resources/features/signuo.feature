Feature: Calculadora de credito

  Scenario: Calcular cuanto me presta

    Given El usuario ingresa a la plataforma
    When Coloca el ingreso mensual 10000000
    And Selecciona un plazo en año de 20 años
    Then El banco puede darme un credito 315237169

