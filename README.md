# Spring Security JPA – Résultats

Ce projet montre une application Spring Boot avec **authentification et gestion des rôles via JPA/MySQL**.  
Les utilisateurs et rôles sont persistés en base de données et protégés par Spring Security.

## 1. Base de données

**Tables créées automatiquement par JPA :**

- `user`
- `role`
- `user_roles` (table de liaison Many-to-Many)

**Screenshot de la base :**

 <img width="1535" height="497" alt="BD" src="https://github.com/user-attachments/assets/b0fd8e6a-06fa-456e-bfa1-3ef682537ecb" />

*Vue d’ensemble de `security_db` avec les tables générées.*

---

**Screenshot des utilisateurs :**

<img width="1071" height="342" alt="userTabe" src="https://github.com/user-attachments/assets/276a3d88-48da-4f2c-93f3-b9155024a315" />

*Exemple d’utilisateurs présents : `admin` et `user` avec mots de passe encodés.*

---

**Screenshot des rôles :**

<img width="1053" height="343" alt="roleTable" src="https://github.com/user-attachments/assets/370c8385-ec2d-4222-9f03-9f010571c2c7" />

*Exemple de rôles : `ROLE_ADMIN` et `ROLE_USER`.*

---

**Screenshot des relations user_roles :**

 <img width="1231" height="340" alt="user-rolesTable" src="https://github.com/user-attachments/assets/24006d9e-14ed-4258-a95a-8d042f237fa7" />

*Table de liaison indiquant les rôles attribués à chaque utilisateur.*

---

## 2. Interface Web

**Page de login :**

<img width="492" height="287" alt="loginuserlast" src="https://github.com/user-attachments/assets/1fd38cef-bf64-4d39-8c3e-abac5b330f92" />

<img width="492" height="267" alt="loginadminlast" src="https://github.com/user-attachments/assets/aedf0b21-7f57-400f-aa32-6b1b690ff3b5" />

*Page de connexion accessible à tous.*

---

**Page Home :**

 <img width="425" height="266" alt="homelast" src="https://github.com/user-attachments/assets/737ed29d-72c9-40f3-a09d-463883b3366f" />

*Page d’accueil après connexion réussie.*

---

**Tableau de bord Admin :**

 <img width="482" height="267" alt="adminpagelast" src="https://github.com/user-attachments/assets/f6bfc373-e902-44cf-9679-68ed8feacdd1" />

*Accessible uniquement à l’utilisateur `admin`.*

---

**Tableau de bord User :**

 <img width="452" height="262" alt="userpage" src="https://github.com/user-attachments/assets/4007faee-6fc6-4cfd-b52b-7f48a45fe377" />

*Accessible à l’utilisateur `user` et aussi à `admin`.*

---

## 3. Vérification

- Les mots de passe sont stockés encodés (BCrypt).
- Les rôles sont pris en compte pour protéger les routes (`/admin/**` et `/user/**`).
- Les tables sont créées automatiquement grâce à `spring.jpa.hibernate.ddl-auto=update`.

---

## Auteur
- Nom : Malak El Mallouky
- Filliere : SIR
