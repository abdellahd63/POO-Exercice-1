public class Abonne {

    private String nom;

    private String numero;

    public Abonne(String nom,String numero){
        this.nom=nom;
        this.numero=numero;
    }

    public String getnom(){
        return nom;
    }

    public String getnumero(){
        return numero;
    }

    public void setnom(String nom){
        this.nom=nom;
    }

    public void setnumero(String numero){
        this.numero=numero;
    }
    
}
