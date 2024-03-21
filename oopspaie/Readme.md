## Inheritance
when you inherit the properties of base class from the dervied class  it is known as inheritance.

### child class
Basically, the child class have the properties of base calss and also it have its own properites.

### base class
the main class is known as base class it is also known as super/parent class

### super
used to initialized the value present in parent class.
    when the child class want to access the variables of parent class the we have to use `super` keyword to extract the variables of parent class.

    if there are same variable exist in both of the class then if we want to access the variables of parent class then we can use `super` .

    if there are same variable exist in both class and we are using `this` then the this will check the variable in child class and print the value that are store in child class variable. 

    in other cases if we are using `this` keyword then this will check the flue in child class first and if the value is not present in child class it will check the parent class.

### private members
all the variables that are declared private thay are not accessable in anoter class.

1. the object of parent class can not be able to access the value of child class until and unless the the object of child class is not being created

`child-->weight`
`parent-->Inheritance`

child referance variable-->parent parent object(not accessable)
`Weight obj9=new Inheritance(3,5,5);`

child referance variable-->child parent object
`Weight obj8=new Weight(3,4,3,3);`

parent referance variable-->parent parent object
`Inheritance obj10=new Inheritance(3,4,3);`

parent referance variable-->child parent object
 `Inheritance obj7=new Weight(4,5,4,5);`

 ## Types of inheritance
 1. single inheritance
 2. multilevel inheritance

 1. single inheritance-when one child class inherit the properties of parent class, called as single inheritance.
 `public class A(){
        //parent class
 }
 public class B extends A(){
        //child class
 }`

 2. multilevel inheritance
  `public class A(){
        //parent class 
 }
 public class B extends A(){
        //child class for A
        //parent class for C
 }
 public class C extends B(){
    //child class for B
 }`
