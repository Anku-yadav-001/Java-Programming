package classobject;

public class classes{
   public static void main(String[] args) {
    
// first object----------
    Student aman=new Student(43,"anju",6f,'f');

    aman.roll=20;
    aman.name="Aman yadav";
    aman.marks=30.4f;
    aman.specialChar='g';

    System.out.println(aman.roll); // for int return 0
    System.out.println(aman.name); // for string return null
    System.out.println(aman.marks); // for boolean return 0.0
    System.out.println(aman.specialChar);// for char return nothing/blank
//second-obbject-----
     Student anku=new Student(70,"ram",23.5f,'y');
     anku.greeting();
     anku.changeName("raghav");
     System.out.println(anku.name);
     
//third object----
     Student nested=new Student(anku);
     System.out.println(nested.name);

//fourth and fifth object
Student one=new Student();
Student two=one;
one.name="ankur1";
System.out.println(two.name);
   }
}

class Student{
   int roll;
   String name;
   float marks;
   char specialChar;
   void greeting(){
    System.out.println("hello, my name is  "+ this.name);
   }
   void changeName(String newName){
    System.out.println("My new name is "+ newName);
   }
   Student(Student other){
    this.roll=other.roll;
    this.name=other.name;
    this.marks=other.marks;
    this.specialChar=other.specialChar;
   }
   Student(){
    this.roll=4353;
    this.name="ankur";
    this.marks=567.3f;
    this.specialChar='t';
   }
  
   Student (int roll,String name,float marks,char specialChar){
       this.roll=roll;
       this.name=name;
       this.marks=marks;
       this.specialChar=specialChar;
   }
}