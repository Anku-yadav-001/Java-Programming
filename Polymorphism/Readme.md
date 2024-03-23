 ## Polymorphism
it means many ways to represent the single entity or item.
same name and different parameters

### Types of polymorphism
1. Comiple time/static/early binding
2. Run time/dynamic/late binding

1. compile time polymorphism-same name but differnet parameters
it is achieved via method overloading
example:-multiple constructor

it is compile time becaues java determines which method is called at compile time

`Note: java automatically convert int to double but not doule to int`

2. run time polymorphism
it is achieved by method overriding`

Dynamic Method Dispatch-it is a mechanizm to call the overridden method it resolverd at run thime rather than compile time

### overriding 
it is called annotation
it is used to check weather the method is overridden or not.

if you want to check weather method is overriddent or not you can use `@Override`

`Note: final method can not be overridden 
           static method can not be overridden`

static can't be dependent of object, override depends on object,hance static methos can not be overridden.

### upcasting
if we create a object of child class with the help of parent class  as a reference then which method should be  called is known as upcasting.

Basically, it check the method is available in child class, if the method is available in child class it will execute child class method otherwise parent class method.

### --
you can run but you can hide
you can inherit but you can not override