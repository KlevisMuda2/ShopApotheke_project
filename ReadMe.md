## Selenium Cucumber-Junit framework

# Login functionality


1. Add dependencies selenium-java, web driver manager(bonigarcia), cucumber-java, cucumber-junit.
   
   
2. I used  `Page Object Model`  to simplify my framework because the design 
   pattern allows me to store all web elements in a page to a .java class file. 
   This makes my framework reusable and more readable. 
   
3. I created `singleton design pattern` to allow my framework to pass the same instance of the driver until the session is closed. 
   For that I have Driver class to manage instance.

4. For reporting, I use `maven-cucumber-reporting html` which gives a very detailed report and percentage of tests that are passing.

5. I also have a `HOOKS` class where I implement cucumber annotations such as Before, After, BeforeStep, AfterStep. Inside the HOOKS class I have a logic where if a scenario failed, it will take a screenshot and attach it to my reporting.


6. I wrote my test cases in Gherkin language and implemented them in code logic in step_definitions package.
   And `runner` class as a trigger with tag @wip to run scenario. 
   

   


