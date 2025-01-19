
# Deuxième itération : Mise en place d'une API REST

## **Objectifs**
Pour cette itération, vous devez mettre en place une API REST permettant de gérer les trois entités existantes dans le projet de gestion de cinéma : **films**, **salles**, et **séances**. Cette API respectera les principes REST vus en cours et inclura une gestion appropriée des erreurs.

## **Cahier des charges**
### **Ressources**
Pour chaque entité, vous devrez implémenter deux types de ressources :
1. **Ressource singleton** : Représente une instance unique d'une entité.
    - Endpoints :
        - `GET /{entité}/{id}` : Récupérer les détails d'une instance.
        - `PUT /{entité}/{id}` : Mettre à jour une instance (remplacement complet).
        - `PATCH /{entité}/{id}` : Mettre à jour partiellement une instance.
        - `DELETE /{entité}/{id}` : Supprimer une instance.

2. **Collection de ressources** : Représente un ensemble d'entités.
    - Endpoints :
        - `GET /{entité}` : Récupérer la liste des entités.
        - `POST /{entité}` : Créer une nouvelle entité.

---

### **Gestion des erreurs**
- **Codes HTTP appropriés** : L'API devra renvoyer des codes HTTP correspondant aux situations rencontrées :
    - `200 OK` : Pour les requêtes réussies.
    - `201 Created` : Lorsqu'une entité est créée avec succès.
    - `400 Bad Request` : Si la requête est invalide.
    - `404 Not Found` : Si l'entité demandée n'existe pas.
    - `500 Internal Server Error` : En cas d'erreur côté serveur (vous ne renverrez jamais cette erreur vous même).
- **Messages explicites** : Les réponses devront inclure des messages clairs pour indiquer l'origine des erreurs ou confirmer le succès des opérations.
---

### **Tests de l'API**
Chaque endpoint devra être testé pour couvrir tous les scénarios possibles, y compris les codes HTTP renvoyés.
- **Procédure de test** : Intégrez une procédure dans le fichier README permettant de reproduire vos tests.
- **Outil** : Utilisez l'outil de votre choix (Postman ou autre) et documentez son utilisation.
---

### **Livrables attendus**
*  **Reprenez votre première livraison** et ajoutez y les éléments demandés dans cette itération.
*  **Code source mis à jour** : Inclure les endpoints REST pour chaque entité.
* **README détaillé** :
    - Instructions pour exécuter l'application.
    - Étapes pour tester chaque endpoint de l'API.
* **Procédure de test automatisé** : Fournir une commande ou un script permettant d'exécuter tous les tests créés.
    - Si vous êtes partis sur des tests d'intégration, tout se fera naturellement.
    - Si vous avez choisi Postman, une fonctionnalité est accessible pour run l'intégralité de tests.
    - A voir dans les autres environnements.
* **Assignment** : https://classroom.github.com/a/AyXATM4y
---

### **Critères d'évaluation**
- Conformité aux spécifications REST.
- Gestion des erreurs et des codes HTTP.
- Tests complets et reproductibles.
- Clarté et exhaustivité de la documentation.
- Qualité et modularité du code.

Bon chance !
