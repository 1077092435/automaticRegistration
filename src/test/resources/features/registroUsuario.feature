
  @Regresion

    Feature: User registration on the utest page

      @scenario1
      Scenario: Registro usuario Duvan en la pagina utest
        Given Duvan user registration on utest page
        When enter all the requested information
        | strName | strLastName | strEmail | strMonthBirth | strDayBirth | strYearBirth | strCity | strPostalCode | strCountry | strComputer | strVersionComputer | strLanguageComputer | strMobile | strModelMobile | strOperatingSystemMobile | strPassword |
        | Duvan   | Avila       | example123456789@utest.com | June   | 3           | 1999         | Tocancipa | 251010      | Colombia   | Windows     | 11                 | spanish             | Motorola  | Moto G6        | 6                        | Programacion18 |
        Then complete
        | strTextEnd |
        | Complete Setup |