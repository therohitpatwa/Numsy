# Numsy - My Own Java Package

## Table of Contents
* What is Numsy?
* Step‑by‑Step: Building the Package
   * 1.Generate a Maven Project
   * 2.Implement the Utility Class
* Publishing to GitHub Packages
   * 3.Set Up pom.xml
   * 4.Authenticate with GitHub
   * 5.Deploy the Package
* Using the Numsy Package in Other Projects
* Final Thoughts

Recently, I built a small but useful java utility package called Numsy, and published it to Github Packages. Here's a quick walkthrough of how I did it, step-by-step. Hope it helps if you are planning to publish your package!

## What is Numsy?

Numsy is a lightweight Java utility library for basic number manipulation, formatting, and checks.

Currently it supports:
* Check if Number is Even or Odd
* Check if Number is Prime or Not
* Find Prime Number within a range.
* Number formatting- Add Commas
* Find GCD
* Find LCM

it's nothing fancy — Just something useful that java doesn't offer directly in a clean, reusable way.

## Step-by-Step: Building the Package

### 1. Generate a maven Project

I used the maven archetype to create the project quickly:

```plaintext
mvn archetype:generate \
  -DgroupId=com.therohitpatwa \
  -DartifactId=Numsy \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false
```

This will create a folder structure like this. (It will also create test folder, but we won't bother with that for now. also ignore the .gitignore, give it taste of its own medicine 😁)

(<img width="516" height="321" alt="image" src="https://github.com/user-attachments/assets/401a6457-ea00-46da-8903-b8e32dd7a14b" />
)

### 2. Implement the Utility class

In `src/main/java/com/therohitpatwa/Numsy` Numsy.java, I added some static method:

```java
public static Boolean isEven(int n) { ... }
public static Boolean isOdd(int n) { ... }
public static List<Integer> primeInRange(int start,int end) { ... }
So on...
```


(<img width="908" height="752" alt="image" src="https://github.com/user-attachments/assets/c37b9ecc-1a3d-4c13-8afe-4468cf44f7fb" />
)

## Publishing to GitHub Packages

### 3. Set Up `pom.xml`

I updated my `pom.xml` to include the Github packages repository under `distributionManagement.`

```xml
<distributionManagement>
  <repository>
    <id>github</id>
    <name>GitHub Packages</name>
    <url>https://maven.pkg.github.com/Github_Username/numsy</url>
  </repository>
</distributionManagement>
```

### 4. Authenticate with GitHub

In your Maven `setting.xml` (In ~/.m2/setting.xml file), added my GitHub credentials like this:

```xml
<servers>
  <server>
    <id>github</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_PERSONAL_ACCESS_TOKEN</password>
  </server>
</servers>
```

To create YOUR_PERSONAL_ACCESS_TOKEN:
1. go to github.com/settings/tokens
2. Create a Classic Token with these scope enables: `write:packages read:packages`
3. Create and Paste it in the setting.xml

### 5. Deploy the Package

Run this command to publish:

```plaintext
mvn clean deploy
```

You'll see the packages listed under Packages in your GItHub repo if all goes well!

(<img width="1397" height="215" alt="image" src="https://github.com/user-attachments/assets/be240e72-f8bc-4d82-bb51-8b97321359d2" />
)

(<img width="853" height="432" alt="image" src="https://github.com/user-attachments/assets/27d5dac8-3e40-4086-b627-91d1f7d111d6" />
)

## Using the Numsy Package in Other Projects

In other project's `pom.xml`, include the repository and dependency:

```xml
<dependencies>
  <dependency>
    <groupId>com.therohitpatwa</groupId>
    <artifactId>numsy</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
</dependencies>
```

Now Import
com.therohitpatwa.Numsy.numsy
and you can use methods provided in Numsy class of numsy
Syntax -`Numsy.methodName();`

(<img width="735" height="473" alt="image" src="https://github.com/user-attachments/assets/15b6929f-3b2b-4c16-8472-7a800a2b69c9" />
)

(<img width="795" height="283" alt="image" src="https://github.com/user-attachments/assets/47eeab52-cbc1-405a-a767-956680f3be18" />
)

## Final Thoughts

I will add more method in Numsy soon. if you would like to use it or contribute, check it out here — 👉 Numsy
