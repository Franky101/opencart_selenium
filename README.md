# Selenium for OpenCart project

### https://opencart.abstracta.us/ 

---
Version: 0.1

Tests only done with TestNG for now.

Positive Test Cases:
- Test 1: Main Page is Visible
- Test 2: Registration page works




### Instructions

1. Run testng.xml file from the root folder. Intellij can Run these type of files directly. 


### Pending Questions

1. Se puede optimizar mas el codigo? me parece que lo alargue mucho al [RegisterPage.java](https://github.com/Franky101/opencart_selenium/blob/main/src/main/java/pagesandstuff/RegisterPage.java)
   
2. Invente algo para mandarle emails unicos, hay una manera mas simple?
---
    // Create email
    String baseEmail = "UserTest";
    String email = baseEmail + System.currentTimeMillis() + "@gmail.com";
