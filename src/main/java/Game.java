import Actor.Actor;

public class Game {


        public static void main(String[] args) {
            System.out.println("hello world");

            Actor actor1 = new Actor("LazerFace", 22);
            System.out.println(actor1.toString());

            Actor actor2 = new Actor("Demoted",45);
            System.out.println(actor2.toString());

            Actor actor3 = new Actor("Munky", 45);
            System.out.println(actor3.toString());
        }
}
