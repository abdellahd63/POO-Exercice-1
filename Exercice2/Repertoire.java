public class Repertoire {

    private Abonne[] listeAbonnees;

    private int nombremax;

    private int n;

    public Repertoire(int nombremax){
        this.nombremax=nombremax;
        listeAbonnees = new Abonne[nombremax];
        n=0;
    }

    public boolean addAbonne(Abonne a){
        if(n==nombremax){
            System.out.println("Le repertoire est plein");
            return false;
        }else{
            listeAbonnees[n++]=a;
            n++;
            return true;
        }
    }

    public String getNumero(String nom){
        int i=0;
        while (i<listeAbonnees.length) {
            if(listeAbonnees[i].getnom().equals(nom)){
                return listeAbonnees[i].getnumero();
            }
            
        }
        return null;
    }

    public int getNabonne(){
        return n;
    }

    public Abonne getAbonne(int range){
        return listeAbonnees[range];
    }

    public Abonne[] getAbonnesTries() {
        Abonne[] abonnesTries = new Abonne[n];
        System.arraycopy(listeAbonnees, 0, abonnesTries, 0, n-1);
        // Tri des abonnés par nom
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (abonnesTries[j] != null && abonnesTries[j + 1] != null &&
                        abonnesTries[j].getnom().compareToIgnoreCase(abonnesTries[j + 1].getnom()) > 0) {
                    Abonne temp = abonnesTries[j];
                    abonnesTries[j] = abonnesTries[j + 1];
                    abonnesTries[j + 1] = temp;
                }
            }
        }
        return abonnesTries;
    }
    

}
