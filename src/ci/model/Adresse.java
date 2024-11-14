package ci.model;

public class Adresse {

     private String ville;
     private String codePostal;
     private String rue;

     public Adresse(String ville, String codePostal, String rue) {
          this.ville = ville;
          this.codePostal = codePostal;
          this.rue = rue;
     }

     public String getVille() {
          return ville;
     }

     public void setVille(String ville) {
          this.ville = ville;
     }

     public String getCodePostal() {
          return codePostal;
     }

     public void setCodePostal(String codePostal) {
          this.codePostal = codePostal;
     }

     public String getRue() {
          return rue;
     }

     public void setRue(String rue) {
          this.rue = rue;
     }

     public void afficher() {
          System.out.println("Adresse : " + this.ville + " - " + this.codePostal + " - " + this.rue);
     }

}