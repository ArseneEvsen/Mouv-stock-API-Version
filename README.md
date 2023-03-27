# Stock Management - Desktop Version
Auteur : Evsen Arsène

Technologies : Java / HTML / CSS / Typescript

Frameworks : Spring Boot / Angular JS / Spring Data JPA / Spring MVC

Outils : Postman / Visual Studio Code / IntelliJ Idea

## Sommaire :
- Présentation
- Fonctionnalitées
- Architecture applicative
- Prérequis
- Comment se procurer l’application + méthode d’installation
- Licence

## Présentation
Dans le cadre de mon stage dans un supermarché, j'ai développé une **API REST** dans le réseau local de l'entreprise, à l'aide du framework Spring Boot. 
Cette API REST est accessible depuis un **site web réactif**, développé avec Angular JS.
Pour plus d'information et une meilleure présentation du contexte, le rapport de stage est disponible en téléchargement dans ce repository.

## Fonctionnalitées
L'API REST tourne sous un **serveur tomcat**, il est accessible par le site web Angular développé pour recevoir et envoyer des fichiers JSON à destination des  **endpoints** des **controllers**.
L'API est capable d'effectuer les actions suivantes : Créer / Lire / Modifier / Supprimer.
Ces actions sont effectué sur les entités suivantes : les articles unitaires et les articles en lot, du supermarché. Ces entités sont présente en base de donnée, et sont géré par le framework Spring Data JPA.

### Site web angular - communiquer avec l'API REST et adapter la vue :
![alt text](https://github.com/ArseneEvsen/StockManagement-API-Version/blob/main/V2%20Screen/GIF%20GestionStock%20UI.gif?raw=true)

### API REST et les endpoints des controllers :
![alt text](https://github.com/ArseneEvsen/StockManagement-API-Version/blob/main/V2%20Screen/Webservice%20Screen.PNG?raw=true)

### Tests de l'API avec l'outil Postman :
![alt text](https://github.com/ArseneEvsen/StockManagement-API-Version/blob/main/V2%20Screen/TestPostman.PNG?raw=true)

## Architecture applicative :
![alt text](https://github.com/ArseneEvsen/StockManagement-API-Version/blob/main/V2%20Screen/Architecture%20applicative.png?raw=true)

## Prérequis
- IntelliJ Version: 2022.3.2
- Visual Studio Code et Angular JS
- java.runtime.version=17.0.4.1+1
- Les drivers (exemple : mysqlconnector) sont disponibles dans le repository.
- Base de donnée MySql Version 8
- Logiciel de gestion et d'administration de bases de données MySQL favoris (exemple : MySQL Workbench)

## Comment se procurer l'application + méthode d'installation
- Télécharger le fichier "GestionStock".
- Télécharger le fichier "Website code".
- Télécharger le fichier "GestionStockV2.sql".
- Décompresser les fichiers téléchargés.
- Ouvrir MySql Workbench, déployer la base de donnée.
- Avec l'IDE IntelliJ, ouvrir l'application avec le dossier décompressé, configurer la partie connexion à la base de donnée et lançer le serveur Tomcat.
- Avec l'IDE Visual Studio Code, ouvrir le fichier "website code" et lançer le serveur web.



## Licence 
MIT License

Copyright (c) [year] [fullname]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
