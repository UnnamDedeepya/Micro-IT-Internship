
# 💼 Personal Portfolio - Full Stack Project

This is a **fully deployed full-stack personal portfolio** project built with:
- **Frontend**: HTML, CSS, JavaScript (deployed on Netlify)
- **Backend**: Spring Boot (deployed on Railway)
- **Feature**: Sends contact form submissions directly to email via Gmail SMTP (no database used)

---

## 🚀 Live Demo

- **Frontend (Netlify)**: [🔗 View Portfolio](https://ud-myportfolio.netlify.app)
- **Backend (Railway API)**: [🌐 API Endpoint](https://portfolio-backend-production-22c0.up.railway.app/contact)

> ✨ Submit the contact form on the site — it will send an email directly to me.

---

## 📂 Project Structure

```
Micro-IT-Internship/
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── app.js
├── backend/
│   ├── src/
│   │   └── main/
│   │       └── java/com/unnam/dedeepya/...
│   │           ├── controller/ContactController.java
│   │           ├── model/ContactForm.java
│   │           └── service/EmailService.java
│   └── resources/application.properties
└── README.md
```

---

## 🌟 Features

- ✅ Personal portfolio showcasing skills, resume, projects, and contact
- ✅ Responsive design with light/dark theme toggle
- ✅ Contact form integrated with Spring Boot REST API
- ✅ Sends form submissions via email using Gmail SMTP
- ❌ No database needed — lightweight and fast!

---

## ⚙️ Technologies Used

### 🌐 Frontend:
- HTML5
- CSS3
- JavaScript
- Deployed using **Netlify**

### ☕ Backend:
- Java 17
- Spring Boot
- Spring Web
- Spring Mail (SMTP)
- Deployed using **Railway**

---

## 📧 Email Integration (No Database)

- Gmail is configured via SMTP using `spring.mail.*` settings
- Emails are sent using `JavaMailSender` from the backend
- Credentials are injected via environment variables on Railway

---

## 🛠 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/UnnamDedeepya/Micro-IT-Internship.git
cd Micro-IT-Internship
```

### 2. Backend Configuration

Edit `backend/src/main/resources/application.properties`:

```properties
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
```

Or use environment variables in Railway:

```
EMAIL_USERNAME=your_email@gmail.com
EMAIL_PASSWORD=your_app_password
```

### 3. Build and Run Locally

```bash
cd backend
mvn spring-boot:run
```

---

## 📦 Deployment

| Layer     | Platform | URL                                                           |
|-----------|----------|----------------------------------------------------------------|
| Frontend  | Netlify  | [https://ud-myportfolio.netlify.app](https://ud-myportfolio.netlify.app) |
| Backend   | Railway  | [https://portfolio-backend-production-22c0.up.railway.app](https://portfolio-backend-production-22c0.up.railway.app) |

---

## 📌 Key Learning Highlights

- Learned Spring Boot fundamentals: REST API, SMTP, project structure
- Deployed backend and frontend separately using cloud services
- Built a real-time contact system without using a database
- Used Git/GitHub to version control a multi-module project

---

## 🙋‍♀️ Author

**Unnam Dedeepya**  
B.Tech Final Year Student | Aspiring Java Backend Developer  
📫 Email: dedeepyaunnam123@gmail.com  
🌐 [GitHub](https://github.com/UnnamDedeepya)

---

## 📄 License

This project is open-source and free to use. Customize and enhance it for your own portfolio!
