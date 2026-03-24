# Spring Security JPA – Résultats

Ce projet montre une application Spring Boot avec **authentification et gestion des rôles via JPA/MySQL**.  
Les utilisateurs et rôles sont persistés en base de données et protégés par Spring Security.

## 1. Base de données

**Tables créées automatiquement par JPA :**

- `user`
- `role`
- `user_roles` (table de liaison Many-to-Many)

**Screenshot de la base :**

![Base de données](screens/db_overview.png)  
*Vue d’ensemble de `security_db` avec les tables générées.*

**Screenshot des utilisateurs :**

![Users](screens/users_table.png)  
*Exemple d’utilisateurs présents : `admin` et `user` avec mots de passe encodés.*

**Screenshot des rôles :**

![Roles](screens/roles_table.png)  
*Exemple de rôles : `ROLE_ADMIN` et `ROLE_USER`.*

**Screenshot des relations user_roles :**

![User Roles](screens/user_roles_table.png)  
*Table de liaison indiquant les rôles attribués à chaque utilisateur.*

---

## 2. Interface Web

**Page de login :**

![Login](screens/login_page.png)  
*Page de connexion accessible à tous.*

---

**Page Home :**

![Home](screens/home_page.png)  
*Page d’accueil après connexion réussie.*

---

**Tableau de bord Admin :**

![Admin Dashboard](screens/admin_dashboard.png)  
*Accessible uniquement à l’utilisateur `admin`.*

---

**Tableau de bord User :**

![User Dashboard](screens/user_dashboard.png)  
*Accessible à l’utilisateur `user` et aussi à `admin`.*

---

## 3. Vérification

- Les mots de passe sont stockés encodés (BCrypt).
- Les rôles sont pris en compte pour protéger les routes (`/admin/**` et `/user/**`).
- Les tables sont créées automatiquement grâce à `spring.jpa.hibernate.ddl-auto=update`.
