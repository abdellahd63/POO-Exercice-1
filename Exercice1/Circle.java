public class Circle{

    private Point centre;

    private int rayon;

    public Circle(Point centre, int rayon){
        this.centre=centre;
        this.rayon=rayon;
    }

    public Point getcentre(){
        return centre;
    }

    public int getrayon(){
        return rayon;
    }

    public void affiche(){
        System.out.println("Centre du circle : ");
        centre.affiche();
        System.out.println("Le Rayon du circle: "+rayon);
    }


}