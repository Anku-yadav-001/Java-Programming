

public class Human {
    int age;
    String name;
    Boolean marriage;
  static long Population;
    public Human(int age,String name,Boolean marriage){
        this.age=age;
        this.name=name;
        this.marriage=marriage;
        Human.Population=Population+1;
    }
}
