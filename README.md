# klm-challenge

#### Java Project that access another API using athentication and return informations about flights.

In this page a customer of the site could do the following:
  * Be able to select an origin.
  * Be able to select a destination.
  * Retrieve a fare offer for the given origin-destination combination


### Used Technologies

* java 8
* spring-boot-starter-jett
* unirest-java
* Ajax

#### How to use

* Clone this project
* ```mvn clean install```

Execute Bootstrap Class

```@SpringBootApplication
public class Bootstrap {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Bootstrap.class, args);
    }
}
```


```http://localhost:9000/travel/index.html```
