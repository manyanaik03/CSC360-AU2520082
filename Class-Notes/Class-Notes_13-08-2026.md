# CSC360 — Class Notes







**AU ID:** AU2520082  



**Date:** 13/08/2026  



---

## 1.Installing Java (JDK)



Before writing any Java program, you need the JDK (Java Development Kit) installed — not just the JRE (Java Runtime Environment), since the JRE only runs Java programs while the JDK also includes the compiler (javac) needed to build them. Installing the JDK sets up a JAVA\_HOME environment variable that other tools (like Maven) rely on to locate the Java installation, and adds java/javac to the system's command-line path so they can be run from any terminal. Verifying the install with java -version and javac -version is the standard first check — if these return version numbers instead of "command not found," the setup is working.



Download JDK installer

 &#x20;     ↓

Run installer / set JAVA\_HOME

 &#x20;     ↓

Add java \& javac to system PATH

 &#x20;     ↓

Verify: java -version

 &#x20;     ↓

Verify: javac -version

 &#x20;     ↓

JDK ready for compiling \& running Java



##2. Installing Maven

* Maven is a build automation and dependency management tool for Java.
* It helps in compiling code, managing dependencies, running tests, and packaging projects.
* Maven uses a pom.xml file to manage project information and dependencies.
* Maven requires Java/JDK to work.
* Maven installation can be checked using:

  mvn -version



##3. Java and Maven

* Java is used to write and run Java programs.
* Maven helps manage and build Java projects.
* A Maven project commonly contains:

  1.src/main/java

  2.src/main/resources

  3.src/test/java

  4.target

  5.pom.xml



* Important Maven commands are:

&#x20;  mvn validate → mvn compile → mvn test → mvn package →    Runnable .jar in target/



##4. Setting Up the Development Environment



Beyond installing Java and Maven themselves, "setup" also covers getting an editor or IDE (like IntelliJ IDEA, Eclipse, or VS Code with the Java extension pack) configured to recognize the JDK and Maven installation, so the IDE can auto-import dependencies, offer code completion, and run/debug programs directly rather than through the raw command line. This step is where the abstract installs from Topics 1–2 become a usable, day-to-day coding workflow — confirming the IDE can create a new Maven project, resolve the pom.xml, and successfully build without errors is the last checkpoint before writing actual program logic.



##5. Writing the First Java Program — Drawing a Square



With the environment working, the first program applied that setup practically by using Java Swing to open a GUI window and draw a square onto it. This involved creating a JFrame (the window), overriding its paint(Graphics g) method to run custom drawing code, and calling g.drawRect(x, y, width, height) to render the square's outline at a chosen position and size. Writing and running this program end-to-end — editing the .java file, compiling it (via Maven or directly), and executing it to see the window appear — was the concrete proof that the Java + Maven setup from earlier topics was actually working correctly.



Create JFrame window

&#x20;       ↓

Override paint(Graphics g)

&#x20;       ↓

g.setColor(...)

&#x20;       ↓

g.drawRect(x, y, w, h)

&#x20;       ↓

Compile \& run via Maven/java

&#x20;       ↓

Square appears in window

