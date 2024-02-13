public class Circle2 extends Point{
    private double rayon;

    public Circle2(double x, double y, double rayon) {
        super(x, y); 
        this.rayon = rayon;
    }

    public void afficher() {
        
        System.out.print("Centre du circle: ");
        super.affiche();
        System.out.println("Rayon du circle : " + rayon);
        
    }
    
}
