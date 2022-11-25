# ChairIsAnObject
Create a class called "Chair", this is going to be a class which can create "Chair" objects. Also create a separate class to drive the function of Chair; which will be the driver class. The driver class will contain the main method you typically make while Chair will not have a main method.

# Chair-Class
- Variables (Attributes): Notice they are public. This isn't normal, but it's ok for this lab. 
  1. public int numOfLegs // how many legs are on the chair
  2. public boolean rolling // does it roll or not
  3. public String material // what is the chair made of
  
Using thes attributes you can describe most chairs. For examplem you might have a wooden chair with 4 legs that does not roll, or you may have a rolling chair made of leather with 5 legs. Now that you know the parameters and their data types, you can make a constructor - also called Chair. A constructor is a special method that shares its name with the class name. It is responsible for creating the object and starting it off with values for its attributes. It should take in user inputs to provide meaningful info for each attribute.
  
This class isn't going to have any methods, so it should only include a constructor and the attributes.
  
# Driver-Class
This class is going to have a main method and take user input for the attributes for the Chair object. Once you have all that information, create a new object with those variables as parameters.

Once you have done that, print out the information about your chair. You can use the name of your Chair object and the dot operator (a period) to print out info about the chair you created. 

Then, to show you really understand how the dot operator can work, change the attributes to:
- numOfLegs = 4;
- rolling = false;
- material = wood;
Finally, repeat your print statement you wrote earlier to print out what the chair looks like.

Tip: When taking in parameters to a constructor, you may want to have the variables used in the constructor header be different words from the attributes in the Chair class. When dealing with rolling/not rolling you may not want to use an IF statment with different print statements.
