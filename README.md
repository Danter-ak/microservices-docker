# Microservices avec Docker

Ce projet contient deux microservices, `user-service` et `order-service`, déployés dans des conteneurs Docker.
Structure du Projet : 

microservices-docker/
├── user-service/
│   ├── Dockerfile
│   ├── src/
│   └── pom.xml
├── order-service/
│   ├── Dockerfile
│   ├── src/
│   └── pom.xml
├── docker-compose.yml
└── README.md
 Lancer les Microservices

1. Assurez-vous que Docker est installé.
2. Depuis la racine du projet, exécutez les commandes suivantes :

```bash
docker-compose down
docker-compose up --build

Tester les Microservices : 
Pour le user-service :
curl http://localhost:8081/api/users/123

Pour le order-service :
curl http://localhost:8082/api/orders/123
