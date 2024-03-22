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
 3. multiple inheriance(not supported in java)
 4. hierarchial inheritance
 5. hybrid inheritance(not supported in java)
 6. cyclic inheritance

 `NOTE: If we want to access multiple and hybrid inheritance in java so be have to use interfaces.`

 1. single inheritance-when one child class inherit the properties of parent class, called as single inheritance.
 `public class A(){
        //parent class
 }
 public class B extends A(){
        //child class
 }`

 2. multilevel inheritance-it is just same as the single inheritance, the only difference is that it is the chain like structure, means the chain of single inheritance.
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

 3. multiple inheritance-when one class inherit the properties of more than one class it is known as multiple inheritance,there are many parent class and only single child class.
`multiple inheritance is not supported in java because, let suppose an example it class `A`  and class `B` are inherited by class `C` and the both parent class ie. `A` and `B` have same variable and the child class ie. `C` wants to access the value of that variable then there  is ambiguty that's why the java is not support the multiple nheritance. `

4. hierarchial inheritance-when one class is inherited by more than one class then it is known as hierarchila inheritance,there are only single parent class and multiple child classes.
 `public class A(){
        //parent class 
 }
 public class B extends A(){
        //child class
 }
 public class C extends A(){
       //child class
 }`

 5. hybrid inheritance-it is a combination of multiple and hierarchial inheritance,java does not support hybrid inheritance because as be know java also not support multiple inheritance and it hybird inheritance we use multiple inheritance that's why java not support it.

 6. Cyclic inheritance-when one class inherit itself, basically it is not inheritance becaues when the class inherit itself there is not parent object, that why it shows error.

 ## Polymorphism

 it means many ways to represent the single entity or item.