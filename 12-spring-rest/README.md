# Class 12: Spring and RESTful Routing

## Resources
* [Our demo](https://github.com/mnfmnfm/seattle-java-401d2-deploy-demo)
* [The Spring Initializr \[sic\]](https://start.spring.io/)
* [Spring Guides: Serving Web Content](https://spring.io/guides/gs/serving-web-content/)
* [Spring Static Resources](https://spring.io/blog/2013/12/19/serving-static-web-content-with-spring-boot)

## Agenda
- Announcements
    - How's project week prep?
- Code review
    - Stacks using two queues
    - Spring apps
- Lecture
    - Adding Views to our MVC
    - Adding Models to our MVC
        - using the `application.properties` file
        - defining schema
        - defining repository interface & model class
        - using repository interface in code
        - Heroku considerations
    - Integration Testing vs. Unit Testing
        - theory
        - spring integration basics
- Lab intro

## Warmup Question
Fill in this table of RESTful routes for a `BlogPost` resource. The first row is done for you.
|Name of function | English description | HTTP method | Path | C/R/U/D?
|-----------------|---------------------|-------------|------|---------
|index            | get all blog posts  | GET         | `/blogposts` | R
|                 | get one blog post   | | |
|                 | add a new blog post | | |
|                 | update a blog post  | | |
|                 | delete a blog post  | | |
