# 📦 Numsy — A Lightweight Java Number Utility Library

Recently, I built a small but useful Java utility package called **Numsy**, and published it to **GitHub Packages**.  
Here’s a quick walkthrough of how I did it — step-by-step.  
Hope it helps if you’re planning to publish your own package!

---

## 🧠 Table of Contents

- [What is Numsy?](#what-is-numsy)
- [Step-by-Step: Building the Package](#step-by-step-building-the-package)
  1. [Generate a Maven Project](#1-generate-a-maven-project)
  2. [Implement the Utility Class](#2-implement-the-utility-class)
- [Publishing to GitHub Packages](#publishing-to-github-packages)
  3. [Set Up `pom.xml`](#3-set-up-pomxml)
  4. [Authenticate with GitHub](#4-authenticate-with-github)
  5. [Deploy the Package](#5-deploy-the-package)
- [Using the Numsy Package in Other Projects](#using-the-numsy-package-in-other-projects)
- [💭 Final Thoughts](#-final-thoughts)

---

## 🧩 What is Numsy?

**Numsy** is a lightweight Java utility library for basic number manipulation, formatting, and checks.

### ✨ Currently it supports:
- ✅ Check if a number is **even** or **odd**
- 🔢 Check if a number is **prime**
- 🔍 Find **prime numbers within a range**
- 💬 **Number formatting** — add commas to large numbers
- 🤝 Find **GCD (Greatest Common Divisor)**
- ⚙️ Find **LCM (Least Common Multiple)**

It’s nothing fancy — just something useful that Java doesn’t offer directly in a clean, reusable way.

---

## 🛠️ Step-by-Step: Building the Package

### 1️⃣ Generate a Maven Project

Use the Maven archetype to create a project quickly:

```bash
mvn archetype:generate \
  -DgroupId=com.therohitpatwa \
  -DartifactId=Numsy \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
