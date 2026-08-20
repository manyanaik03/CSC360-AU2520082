# CSC360 — Class Reflection

**AU ID:** AU2520082  
**Date:** 18/08/2026

---

## Topics Covered

- Installing Java (JDK)
- Installing Maven
- How Java and Maven work together
- Setting up the development environment
- Writing a first Java program to draw a square

## Reflections

- **Installing Java:** Learnt that the JDK, not just the JRE, is needed to compile Java code. `JAVA_HOME` helps other tools locate the JDK.

- **Installing Maven:** Maven depends on Java being installed first. `mvn -version` can be used to verify that Maven is installed and connected to Java correctly.

- **Java + Maven together:** Maven automates the build process through lifecycle phases such as `compile`, `test`, and `package`, instead of requiring manual `javac` commands for each step.

- **Environment setup:** Configuring the IDE with the correct JDK and Maven settings turns the individual installations into a usable Java development environment.

- **First square program:** Writing, compiling, and running the Swing square program helped confirm that the Java development environment was working correctly.

## Key Terms

`JDK` · `JRE` · `JAVA_HOME` · `pom.xml` · `mvn compile` · `mvn package` · `JFrame` · `paint(Graphics g)` · `drawRect()`

## Q&A Discussed

### Q1. Why install the JDK instead of just the JRE?

**Answer:** The JRE is mainly used to run compiled Java programs, while the JDK includes development tools such as `javac`, which is required to compile Java source code.

### Q2. Why does Maven installation depend on Java being installed first?

**Answer:** Maven runs on Java, so it needs a working Java installation and uses `JAVA_HOME` to locate the JDK.

### Q3. What is the practical benefit of Maven over running `javac` manually?

**Answer:** Maven automates tasks such as compilation, dependency management, testing, and packaging, which becomes especially useful as a project grows.

### Q4. How did the square program confirm that the setup was correct?

**Answer:** Successfully compiling and running the program and seeing the Swing window with the square showed that the Java development environment was functioning correctly.
