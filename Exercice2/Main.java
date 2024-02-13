public class Main {
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire(5);

        repertoire.addAbonne(new Abonne("Mohamed", "0766554433"));
        repertoire.addAbonne(new Abonne("Slimane", "0667889443"));
        repertoire.addAbonne(new Abonne("Zoubir", "0556689087"));
        //repertoire.addAbonne(new Abonne("Karim", "0667883929"));
        //repertoire.addAbonne(new Abonne("Hamid", "0771235678"));
        


        System.out.println("Nombre d'abonnés : " + repertoire.getNabonne());

        System.out.println("Numéro de Mohamed : " + repertoire.getNumero("Mohamed"));

        Abonne abonne = repertoire.getAbonne(2);
        System.out.println("Abonné 2 : " + abonne.getnom());

        Abonne[] abonnesTrie = repertoire.getAbonnesTries();
        for (int i = 1; i < abonnesTrie.length; i++) {
            System.out.println(abonnesTrie[1].getnom());
        }
    }   
}
