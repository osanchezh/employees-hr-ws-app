# employees-hr-ws-app
Web service for human resources using EJB/JPA, proxy interface was build and tested for Glassfish 3.x/4.0.x

## Running web application inside parent
```
 $ mvn clean compile install -Dmaven.test.skip=true
```
## Instalation 
First you will need hrdb installed on mysql server
```
 $ /employees-hr-ws-app/employees-hr-ws-app/employees-hr-ws-soa/employees-hr-ws-soa-persistence/src/main/resources/script/employees_partitioned3.sql
```
Database used can be found here: https://launchpad.net/test-db/ 
Dump files containing inserts of records can be downloaded link above.

The aplication generated should be the following:

```
 1.employees-hr-ws-soa-app-0.0.0.1.ear
 2.employees-hr-ws-web.war
```

## Development notes

* JDK used: 1.7
* Time of development: 24 hours
* Reason of development: Testing EJB/JPA on Java 7
