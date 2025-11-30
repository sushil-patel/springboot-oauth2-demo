# 💾 Simple Spring Boot OAuth2 Login

This is a minimal **Spring Boot** application configured for **OAuth2 login** using **Google** and **GitHub**.

```markdown
Make sure Java 17+ is installed, as required by Spring Boot 3.x.
```

---

## 🔑 Configuration

Before running, you must add your generated **Client ID** and **Client Secret** for both providers into:


---

## 🌐 OAuth2 Redirect URIs

Use these **Redirect URIs** when setting up your OAuth clients:

| Provider | Redirect URI |
|----------|-------------|
| Google   | `http://localhost:8080/login/oauth2/code/google` |
| GitHub   | `http://localhost:8080/login/oauth2/code/github` |

---

## 📝 `application.properties` Snippet

```properties
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_SECRET

spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_SECRET
```

Replace the placeholder values with your actual credentials.

---
## 🏃 How to Run

1. Add your OAuth credentials to application.properties.

2. Run the application:
```bash
./mvnw spring-boot:run
```

3. Access the login page at:
```arduino
http://localhost:8080/
```