# Grant Advance Automation

Test Automation Project created with the Selenium WebDriver API and JUnit framework to structure test cases, verify outputs and tests. Use of the PageObject pattern, in Java language (using the Eclipse IDE).
The steps reproduce on this project it refers to the below

- 1- Access www.grantadvance.com
- 2- Click on `Contact` on the Menu Bar
- 3- Waiting the Form Page has been opened
- 4- Fill the form entering the mandatory fields Name, Email, Additional Information
- 5- Click on `Submit Form`

To manage dependencies, Maven was used.

### Pre-conditions

..* Chrome Driver Browser Installed;
..* Download the 'chromedriver' (based on the version of the browser installed);
..* Java version 8+.

### How to setup the environment:

1) Clone the project using the following Git command:
``` 
git clone https://github.com/daniclericuzi/grant_advance.git
```
2) Import the project into Eclipse (or your preferred IDE)
3) Configure WebDriver 
..* In the project, open the BaseTest.java class and change the value of the "webdriver.chrome.driver" property to the directory path where the chrome driver executable is located:
```
System.setProperty("webdriver.chrome.driver", "C:\\caminho\\para\\chromedriver.exe");
```
### How to run the Test

In the Class HomePageTests, click on right button > Run as > JUnit test.
