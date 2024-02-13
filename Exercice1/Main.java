public class Main {
    public static void main( String args[]){

        System.out.println(" ");

        //Affichage de coordonnees

        Point centre1=new Point(5, 5);

        Circle c1=new Circle(centre1,10);

        c1.affiche();


        //Affichage de coordonnees apres deplacement
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");

        centre1.deplace(2, 1);

        Circle c2=new Circle(centre1,10);

        c2.affiche();

        //creation circle2
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");

        double x = 1;

        double y = 4;

        Circle2 c3=new Circle2(1,4,8);

        c3.affiche();




    }
}
