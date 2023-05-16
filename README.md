(Le badge de Codecov fonctionne pas) 

[![codecov](https://codecov.io/gh/lahcene-belhadi/ceri-m1-techniques-de-test/branch/master/graph/badge.svg?token=3AQZXYLFQW)](https://codecov.io/gh/lahcene-belhadi/ceri-m1-techniques-de-test) [![CircleCI](https://dl.circleci.com/status-badge/img/gh/lahcene-belhadi/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/lahcene-belhadi/ceri-m1-techniques-de-test/tree/master) ![Checkstyle](target/site/badges/checkstyle-result.svg)

Belhad Lahcène - Groupe ILSEN Alt 2

# TP 6
## Rapport
La classe fournie par la Team Rocket présente, contrairement à ce qu'ils avancent. En effet, pour commencer, le code est assez mal optimisé et redondant en plus d'être peu lisible. Par exemple, dans la méthode qui génère les statistiques aléatoire d'un Pokémon, ils créent 1 000 000 d'instances de la classe Random alors qu'une seule aurait suffit (en plus de leur faire économiser de la RAM). En outre, certaines variables sont déclarées et jamais initialisée. Ensuite, la plupart des standards de rédaction de code en Java ne sont pas respéctée, on dirait qu'ils ont voulu écrire du C.
Les tests que j'ai rédigé passent pour leur classe, mais je suis certain qu'il est possible de trouver plus de comportement étranges. Cependant vu la lisibilité du code, je n'ai pas trouvé le moyen de tester tout cela (vu l'heure également).

# UCE Génie Logiciel Avancé : Techniques de tests

## Introduction

Vous allez à travers ces projet mettre en application une partie des aspects évoqués en cours vis à vis des techniques de tests.  
Pour cela nous allons réaliser un projet logiciel de petite taille, en suivant la roadmap suivante : 
- Setup du projet
- Mise en place des outils d’intégration continue
- Écriture des tests unitaires
- Écriture des mocks, et validation des tests
- Développement dirigé par les tests
- Documentation et conventions de style
- Test d'une implémentation donnée

Le projet consiste à mettre en place un outil d’analyse statistique pour le jeu Pokémon GO.  
Durant cette série de TPs, le gestionnaire de version Git sera utilisé à foison, à travers la plateforme GitHub. Si vous n’êtes pas à l’aise avec cet outil[^1], [voici](http://rogerdudler.github.io/git-guide/) un petit guide à garder sous la main.

## Sujets

L'ensemble des sujets de TPs peut être trouvé dans le dossier `TPs`.

Le dossier `src` contient la définition de l'ensemble des interfaces qui seront l'objet de vos travaux.

## Rendus

Le rendu des TPs se fait au rythme suivant :

- TP1 : 1ère séance
- TP2 : 2ème séance
- TP3 : 3ème séance
- TP4 : 5ème séance
- TP5 : dernière séance
- TP6 : dernière séance

Pour chaque rendu, le projet dans son intégralité doit être déposé sur la plateforme.

[^1]: Si vous n’êtes vraiment pas à l’aise avec cet outil nous vous conseillons quand même vivement de vous y mettre.
