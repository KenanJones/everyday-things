# everyday-things
CPS206 Iterative In Class Examples

## Purpose
This repository is for students of CPS206 at John A Logan College in the Spring 2017 semester to have in class examples correctly completed for them. 

### Cloning
Clone this repository with the shell command `git clone https://github.com/anthonykulis/everyday-things.git`

### Forking
If you wish to contribute to this source code, please fork the repository via github. From there, you are free to contribute with pull requests.

If you need to update your fork with the current in class work, use `git pull https://anthonykulis/everyday-things.git master`

## Versioning
This repository will follow semantic versioning. This means as we continue with lectures, I will update the repository with either *minor* or *micro* tag updates. Each version will update this read me about the changes we accomplished in that lecture.

## Versions
The following are the versioning changelogs.

### Version 0.4.0
Adds empty method that accepts a lambda. Demonstrates using filters, forEach, and passing custom lambdas to override class behavior.

### Version 0.3.2 && 0.3.3
Updates this readme

### Version 0.3.1
Lambda in HandSanitizer driver

### Version 0.3.0
Adds anonymous interface to HandSanitizer

### Version 0.2.2
Fixes this file. No code changes

### Version 0.2.1
Failed attempt to fix this file

### Version 0.2.0
Today in lab we added two interfaces, `Pourable` and `Fillable`. Using the *Interface Segregation Principle* we determined we only needed method per interface, `public void pour()` and `public void fill()`, respectively. This version implements those two methods and demonstrates them in the application driver.

### Version 0.1.4
We identified that the `toString` methods are repetitive and that we could use polymorphism to allow us to stay DRY.

Because of this, we need to do a lot of refactoring. First, we need to create a `Liquid`. From that `Liquid`, we need create `Beverage` which extends `Liquid`, and `Soda` and `Beer` extend `Beverage`. But because `Water` is not only a `Beverage`, we need to move that class out of `beverage` and into the `liquid` package. Maybe later `Water` will identify which package is correct for it, but until then, moving it into `Liquid` is satisfactory.

We also decided to change our beverages so we can keep using declarative accessor methods, e.g. `sodaBottle.getSoda()` vs `sodaBottle.getLiquid()`. In the process, we discover that `WaterBottle`'s constructor cannot pass a `Liquid` to a `Beverage` because a `Liquid` is not a `Beverage`. 

This forces us to move `WaterBottle` out of `Beverage`. But now we have an issue of repetition that needs to be solved. This issue will be an extra credit assignment due Friday, March 3, 2017 at midnight. Simply for the repository and once you have made the changes, do a pull request. Those correct solutions will be given 5 points. 





### Version 0.1.3
We demonstrated that we can polymorph into bottles and that the latest `toString` method would resolve and that each child class can use `getCapacity`. Then we introduced the `HandSanitizerBottle`. This led us to the conclusion that we needed to refactor some to prevent us from drinking hand sanitizer on accident. This version reminds us what we did.

### Version 0.1.2
In this version, we introduced the basic usage of *polymorphsim*. We create a basic main driver to put a bunch of bottles into a collection.

### Version 0.1.1
We decied that `Bottle` should be be intantiated, so we set the class to `abstract`

### Version 0.1.0
We realized we had duplicate code. Because of so, we decided to *abstract* out those features and put them into a parent class named `Bottle`, and *extend* `Bottle` into our 3 bottle-typed classes.

### Version 0.0.2
This version simply adds the `toString` methods which were required.

### Version 0.0.1
Adds base objects of `SodaBottle`, `BeerBottle`, `WaterBottle` with no inheritance. Also provides empty objects of `Soda`, `Beer`, and `Water` for *has-a* relationships.

### Version 0.0.0
Initial - no code.




