

A simple Spring Boot webapp using:
* Thymeleaf templating
* Pulling in Bootstrap from CDN.
* Github OAuth

I started with the [code in the git repo](https://github.com/spring-guides/gs-serving-web-content.git) in the [Spring Guide: Serving Web Content](https://spring.io/guides/gs/serving-web-content/).

I then added in Bootstrap, loosely following instructions from two different tutorials:
* [Ömer Yazir's tutorial on integrating Spring Boot with Bootstrap and Thymeleaf](https://medium.com/@omeryazir/how-to-integrate-spring-boot-with-bootstrap-and-thymeleaf-5744fc8475d)
* [Bootstrap's own getting started guide](https://getbootstrap.com/docs/4.3/getting-started/introduction/) which has the example code for getting the CSS and JavaScript files from a CDN

Finally, I added Github OAuth; you can see the pull request for the
very small code change that did this.

| Type this | to get this result |
|-----------|------------|
| `mvn package` | to make a jar file|
| `mvn spring-boot:run` | to run the web app|
| in browser: `http://localhost:8080/greeting/` | to see "Hello, World!" |
| in browser: `http://localhost:8080/greeting?name=Gauchos` | to see "Hello, Gauchos!"

# To Configure Github OAuth

You first need to generate a Client ID and Client Secret.

Note that the Client ID and Client Secret will need to be different for running on localhost, vs. running on, for example, Heroku.   If you want to run in both places, you'll need two sets of client-id/client-secret.

Finally, the client secret SHOULD NEVER BE COMMITTED TO GITHUB.  If you accidentally do this, REVOKE IT IMMEDIATELY, and generate a new one.  It is not sufficient to just do a new commit that deletes it from the code, because its already there in the history.

First, visit the Settings page of either your user account or an organization account,
and click "Developer Settings", then "OAuth Apps", then "Create New OAuth App".

Fill in:
* Application Name: Anything you want, but I suggest the name of the repo followed by "on localhost",<br>
   e.g. "spring-boot-thymeleaf-bootstrap-oauth on localhost"
* Homepage URL: Must be `http://localhost:8080`
* Application Description is optional, but if entered will be shown to users the first time they authorize Github OAuth
* Authorization Callback URL: Must be exactly: `http://locahost:8080/login/oauth2/code/github`

Then click "Register Application"
