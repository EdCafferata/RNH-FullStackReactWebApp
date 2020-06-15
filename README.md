# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/maven-plugin/)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

kan gebruikt worden om naar de db te kijken, twee tabellen aangemaakt die ik als eerste nodig heb...aisdata & schip
http://localhost:8080/db

Rest Calls die gemaakt zijn:
http://localhost:8080/api/aisdatas
http://localhost:8080/api/aisdata/1 (om er een op te vragen of toe te voegen)
http://localhost:8080/api/schips
http://localhost:8080/api/schip/1 (om er een op te vragen of toe te voegen)

### Getting Started
### Reference Documentation  
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-webservices)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

# Eindopdracht FSD

Dit is een template project voor de eindopdracht van Bootcamp Full Stack Development van Hogeschool NOVI.

Voor de eindopdracht wordt studenten gevraagd een applicatie te maken met de geleerde technieken:

- Java
- Javascript
- React
- HTML
- CSS/CSS3

## IntelliJ

Dit project kun je via `File > Open` openen. 
IntelliJ zal dan een nieuw project maken en vragen (eventueel pas als `pom.xml` wijzigt) om `Maven auto-import` aan te zetten. (done, staat aan)

De git configuratie zorgt er voor dat je geen speciale IntelliJ bestanden kan toevoegen aan jouw repository. Dit is gebasseerd op
[informatie](https://intellij-support.jetbrains.com/hc/en-us/articles/206544839) van de Jetbrains support website. Zie ook het kopje Gitignore verderop.

## Github Classroom

Middels de Github Classroom worden de team assignments uitgedeeld. Een student zit in een team van tenminste 1 persoon, met een maximum van 4.
Al het werk aan de applicatie wordt gedaan door middel van Github Classroom, dat wil zeggen dat de code wordt ingecheckt in een private repository op Github (via de IDE of command line) en dat de progressie zichtbaar is voor de hoofddocent.

## Spring Initializr

Om het project te starten is een [Spring Initializr](https://start.spring.io/) project aangemaakt met de volgende eigenschappen:

- Maven Project
- Java
- Spring Boot 2.2.4 (huidig stabiel) (al diverse keren zelf een nieuwe gemaakt met hogere versies)
- Project Metadata:
  - Group: com.noviuniversity
  - Artifact: spring-web-app
- dependencies
  - Data JPA
  - Security (voor eerste oplevering niet nodig :-))
  - Web
  - Mysql Database connector
  - PostgreSQL Database connector
  - H2 in-memory database connector
  - Lombok

### Aanpassen door de student

De naam van het project moet door de student worden aangepast in `pom.xml`. Verander `artifactId` naar de naam van jouw project. (done: artifactId : RnhWebApp)

## Gitignore

Om te voorkomen dat bestanden vanuit IntelliJ worden toegevoegd aan de respository is een `.gitignore` bestand gemaakt. Deze is via [gitignore.io](https://gitignore.io) opgezet. De volgende command line (op linux/mac) is hiervoor gebruikt:

```
wget http://gitignore.io/api/java,maven,java-web,intellij -O .gitignore
```

## Project starten

Het project kan eenvoudig gestart worden buiten de IDE door de volgende command line aan te roepen:

## Frontend:
Linux en Mac:

```
./mvnw spring-boot:run
```

Windows:

```
 mvn spring-boot:run
```

## Backend:
Linux en Mac:

```
./npm start
```

Windows:

```
 npm start
```

Sample's inside that directory, you can run several commands:

  npm start ( Starts the development server )
  npm run build ( Bundles the app into static files for production )
  npm test ( Starts the test runner )

  npm run eject
    Removes this tool and copies build dependencies, configuration files and scripts into the app directory. If you do this, you can’t go back!

## Project inleveren

2020-06-03 ===>  https://edhub.novi.nl/study/learnpaths/293/test (menu optie gaat naar test...)

Wanneer het project klaar is, of de deadline is verstreken, wat ook eerder komt, dan zal het project opgehaald worden door de docent, viaGithub Classroom -> Download Repositories. 
(done: https://github.com/hogeschoolnovi/eindopdracht-team-rnhwebapp)

De docent zal `./mvnw spring-boot:run` op een Linux machine uitvoeren. Het project zal dan zonder andere benodigdheden moeten starten.

Als je een afhankelijkheid hebt van een database, zorg er dan voor dat hiervoor een script aanwezig is waarmee de database gemaakt (schema, inhoud) wordt en geef aan welke properties in `application.properties` moeten worden aangepast. Of gebruik simpelweg de H2 in-memory database.

Als je een .env bestand hebt met wachtwoorden zal deze los worden gestuurd over de mail als een .zip bestand met wachtwoord. ( wachtwoord === xxxx )

# Happy hacking!

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app). (2020-06-11)

## Available Scripts

In the project directory, you can run:

### `yarn start`

Runs the app in the development mode.<br />
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.<br />
You will also see any lint errors in the console.

### `yarn test`

Launches the test runner in the interactive watch mode.<br />
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `yarn build`

Builds the app for production to the `build` folder.<br />
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.<br />
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `yarn eject`

**Note: this is a one-way operation. Once you `eject`, you can’t go back!**

If you aren’t satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you’re on your own.

You don’t have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn’t feel obligated to use this feature. However we understand that this tool wouldn’t be useful if you couldn’t customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: https://facebook.github.io/create-react-app/docs/code-splitting

### Analyzing the Bundle Size

This section has moved here: https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size

### Making a Progressive Web App

This section has moved here: https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app

### Advanced Configuration

This section has moved here: https://facebook.github.io/create-react-app/docs/advanced-configuration

### Deployment

This section has moved here: https://facebook.github.io/create-react-app/docs/deployment

### `yarn build` fails to minify

This section has moved here: https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify
