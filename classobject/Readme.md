## class, object,constructor,new and this keyword
### class
class is a collection of data member and member function, also class is a user defined data type
class is template of an object
object is a instance of a class.

class=logical construct
object=physical reality

object have three things-
1. state
2. identity
3. behaviour

###  new keyword
dynamically allocates memory and return a reference variable to it.

all the class, objects are create at the run time.

When the object is not initialize it will return:-
1. int-0
2. String-null
3. float-0.0
4. char-nothing

###  constructor
it is a special type of function, that is run when you create an object, it allcoates some variables.
it is called by default constructor.

###  this keyword
this is a keyword that points the parent object.

premitive data types are not implemented as objects.
objects are stored in heap memory
premitives are not object hence they are stored in stack memory only.

if we assign a one object to another object, it will just making a copy of referance variable, and the address of these two objects are different

in premitive no such things are pass by referance everything is passed by value

when a non premitive is final, you can re assing it

###  finalized()
it is used to destroy the object.