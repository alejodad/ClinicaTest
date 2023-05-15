Feature: cita

  Scenario: agendar cita medica
    Given Usuario esta en pagina principal
    When Busca cita mas cercana
    Then Agenda cita mas cerca