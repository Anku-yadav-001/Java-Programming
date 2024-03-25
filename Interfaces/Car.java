public class Car implements Engine,Service,Media {
           @Override
           public void acc() {
                        System.out.println("I like accelaration the car");
           }
           @Override
           public void stop() {
                        System.out.println("I like stop the car");
           }
           @Override
           public void start() {
                        System.out.println("I like start the car");
           }
           @Override
           public void brake() {
                        System.out.println("I like breaking the car");
           }
}
