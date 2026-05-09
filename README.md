# Prova pratica MTSS

[![Coverage Status](https://coveralls.io/repos/github/dagatacla-cyber/Prova-pratica-MTSS/badge.svg?branch=develop)](https://coveralls.io/github/dagatacla-cyber/Prova-pratica-MTSS?branch=develop)

[![.github/workflows/ci.yml](https://github.com/dagatacla-cyber/Prova-pratica-MTSS/actions/workflows/ci.yml/badge.svg)](https://github.com/dagatacla-cyber/Prova-pratica-MTSS/actions/workflows/ci.yml)

## Descrizione

L’obiettivo del progetto è creare un codice in linguaggio Java per convertire i numeri arabi nei corrispondenti numeri romani per i primi 1000 interi positivi e stamparli in formato ASCII Art.
Il progetto è stato diviso in 13 issue divise tra i due programmatori e sono le seguenti:

- Inizializzazione progetto Maven con archetype quickstart
- Configurazione del processo di build
- Attivazione e configurazione dell’analisi statica
- Predisposizione della Build Automation con GitHub Actions
- Attivazione code coverage
- Implementazione conversione numeri romani
- Implementazione funzionalità ASCII art
- Scrittura test unitari per la conversione dei numeri romani
- Scrittura test unitari per ASCII art
- Test unitario per il metodo main
- Aggiornamento README con istruzioni del progetto   
- Creazione tag della release 1.0
- Merge finale sul branch principale e consegna

Il progetto è stato sviluppato seguendo le pratiche di Continuous Integration richieste dalla consegna.

---

## Struttura del progetto

Il codice di produzione è contenuto nel file:

- `AraboRomanoASCII.java`
    Nel file si definisce la classe AraboRomanoASCII che contiene i seguenti metodi:
    - `convert` per la conversione da numero arabo a numero romano
    - `stampaAscii` per la stampa ASCII Art
    - `main` per l’esecuzione del programma

I test unitari sono contenuti nei seguenti file:

- `AraboRomanoASCIITest.java`
- `StampaAsciiTest.java`
- `AppTest.java`

---

## Tecnologie utilizzate

- Java
- Maven
- JUnit 5
- GitHub Actions
- JaCoCo
- Coveralls
- Checkstyle

---

## Compatibilità Java

Nel file `pom.xml` viene utilizzato Java 17.

Nel file `ci.yml` viene utilizzato Java 8 per garantire compatibilità con JaCoCo e Coveralls durante l’esecuzione automatica della build.`


---

## Analisi statica

Per l’analisi statica del codice è stato utilizzato il plugin Maven Checkstyle con configurazione personalizzata tramite il file `checkstyle.xml`.

Sono stati configurati i seguenti moduli Checkstyle richiesti dalla consegna:

- BooleanExpressionComplexity
- CyclomaticComplexity
- FileLength
- LineLength
- MethodLength
- EmptyCatchBlock
- FileTabCharacter
- AvoidStarImport
- IllegalImport
- NeedBraces
- Header

---

## Continuous Integration

Il progetto utilizza una workflow GitHub Actions definita nel file `ci.yml`.

La build viene eseguita automaticamente ad ogni push e pull request ed è suddivisa nelle seguenti fasi:

- compilazione del progetto (`mvn compile`)
- esecuzione dei test (`mvn test`)
- analisi statica del codice (`mvn package`)
- caricamento della code coverage tramite Coveralls (`mvn coveralls:report`)

---

## Code Coverage

La copertura del codice viene calcolata tramite JaCoCo e Coveralls.

La copertura raggiunta è superiore all’85% richiesto dalla consegna.

---

## Esecuzione del progetto

Compilazione del progetto:

`mvn compile`

Esecuzione dei test:

`mvn test`

Build del progetto con analisi statica:

`mvn package`

Esecuzione del programma:

`mvn exec:java`

---

## Nota

È stata aggiunta una classe `main`, non esplicitamente richiesta dalla consegna, per rendere più semplice l’esecuzione del programma da terminale tramite Maven.