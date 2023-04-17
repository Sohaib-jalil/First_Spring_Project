# Activit-pratique-2-JEE

Dans cette activité ont va ajouter la possibilité de s'authentifier pour sécurisé notre application en utilisant spring security avec les deux stratégies : InMemoryAuthentication et JdbcAuthentication

### Objectif de l'atelier ###

1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock
3. Créer l'entité JPA Patient ayant les attributs :
       - id de type Long
       - nom de type String
       - dateNaissanec de type Date
       - malade de type boolean
       - score de type int
4. Configurer l'unité de persistance dans le ficher application.properties 
5. Créer l'interface JPA Repository basée sur Spring data
6. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
7. Migrer de H2 Database vers MySQL

### Configuration du projet ###

Langue : Java

Type : Maven

JDK : Oracle OpenJDK version 20

Java : 17

Packaging : Jar

### Dépendances utilisées ###

• lombok : Une bibliothèque Java qui permet de réduire la quantité de code boilerplate nécessaire pour écrire des classes.

• H2database : Une base de données relationnelle qui offre des fonctionnalités avancées pour les développeurs tout en étant légère, rapide et facile à utiliser.

• Spring Web : un module de la plateforme Spring qui fournit des fonctionnalités pour le développement d'applications web, telles que la création de contrôleurs et la gestion des requêtes et des réponses HTTP.

• Spring Data JPA : Une excellente option pour simplifier l'accès à la base de données dans une application JEE
