# Java Crossref Connector

This project provides a simple interface to query [Crossref's public API](https://api.crossref.org/swagger-ui/index.html).

## Installation

Using Maven, include the following plugin:
```xml
<dependency>
    <groupId>edu.asu.diging</groupId>
    <artifactId>crossref-connect</artifactId>
    <version>0.1</version>
</dependency>
```

## Usage

Use the plugin as follows:

```java
CrossrefWorksService service = new CrossrefWorksServiceImpl(CrossrefConfiguration.getDefaultConfig());      
try {
    // search takes: query string, page size, and offset
    List<Item> results = service.search("einstein", 5, 0);
    // do something with the results
    results.forEach(r -> System.out.println(r.getTitle()));
} catch (IOException e) {
    // handle exception
    e.printStackTrace();
} catch (RequestFailedException e) {
    // handle exception
    e.printStackTrace();
}
```

If for some reason, the default parameter to connect to Crossref need to be changed, customized `CrossrefConfiguration` can be used by either implementing a new `CrossrefConfiguration` class or adjusting the values in the `DefaultCrossrefConfiguration`.
