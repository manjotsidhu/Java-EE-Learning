# Java-EE-Learning
Personal java packages made to learn Java EE (Servlets, JSP, Spring, Struts 2)

## Build and Run using Maven

Install local dependencies into maven: 
```
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14 -Dversion=10.2.0.1 -Dpackaging=jar -Dfile=libs/ojdbc14.jar -DgeneratePom=true
```

Build:
```
mvn install
```

Run (replace mainClass with the class u want to run and check):
```
mvn exec:java -Dexec.mainClass="jdbc.intro.DBConOracle"
```
