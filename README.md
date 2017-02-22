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




