# Chap17tipCalculator
Chapter 17 tip Calculator. Create a GUI Tip Calculator. The user will enter the cost of the meal, then select the tip rate to use to calculate the tip for that meal. Here are some examples:

![examples](https://github.com/bell-kevin/Chap17tipCalculator/blob/main/Capture.PNG)

The screen has one text field for the user to input the cost of the meal. There are 3 buttons, for different tip rates, and the program needs to detect which button was pushed to calculate the appropriate answer. The last object is an uneditable text field to display that answer, formatted with a dollar sign and 2 decimal places.

This project requires only one action listener that differentiates between the 3 buttons. Hint: read sections 17.14 and 17.15 about distinguishing between multiple events in a single action listener.

Add colors to the buttons and the JPane.

The output must be formatted correctly for currency, with a dollar sign and 2 decimal places. You have formatted output previously that was written to the console, using System.out.printf(). That won't work in a GUI form. There is a class designed to format numbers in several ways, such as currency and percentage, called NumberFormat. You must add an import statement to your project to use this class. Instantiate an object of the class using the constructor that can format currency, which is getCurrencyInstance().

    import java.text.NumberFormat;
    NumberFormat money = NumberFormat.getCurrencyInstance();

Once the money object exists, which is a NumberFormat object, use its method format to provide the appropriate output for money.

    double dollars = 12.987654;
    String price = money.format(dollars);

The variable price will contain "$12.99" -- the currency format adds the dollar sign and only 2 decimal places. If the variable had a larger number that is in the thousands, the currency format inserts a comma to separate thousands from hundreds. The separator and currency symbol can be customized to be appropriate for the locale or specific project.

In this project, use NumberFormat to correctly display money.

Take 6 screenshots -- 2 different meal prices, with each tip rate for each meal.

 

Submission: the specified screenshots and the root folder for the project

 

Pay careful attention to the rubric for this assignment.

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.

Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](https://bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
email me at **bellKevin@pm.me** for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
