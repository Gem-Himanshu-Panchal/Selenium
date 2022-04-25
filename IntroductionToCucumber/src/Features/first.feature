Feature: Introduction to Cucumber

  Scenario Outline: Automate Gemini Website
    Given open google
    Then type gemini solutions and search
    When search open gemini official website
    Then extract text under "<text>" using "<xpath>"
    Examples:
      | text         | xpath                                                                      |
      | Services     | //p[contains(text(),'We solve complex business problems through cutting')] |
      | Technologies | //p[contains(text(),'We solve complex business problems through cutting')] |
      | Products     | //p[contains(text(),'Leveraging our deep expertise in digital, analytic')] |