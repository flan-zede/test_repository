package ci.model;

import java.util.List;

public class Person {

     private String nom;
     private String prenom;
     private int age;
     private double taille;
     private boolean hasJob;

     private Adresse adresse;

     private List<String> diplomes;

     public Person() {
     }

     public Person(String nom, String prenom, int age, double taille) {
          this(nom, prenom, age, taille, true);
     }

     public Person(String nom, String prenom, int age, double taille, boolean hasJob) {
          this.nom = nom;
          this.prenom = prenom;
          this.age = age;
          this.taille = taille;
          this.hasJob = hasJob;
     }

     public void afficher() {
          System.out.println("Nom et Prénoms : " + this.nom + "  " + this.prenom + " Diplomes : " + this.diplomes);
          if (this.adresse != null) {
               this.adresse.afficher();
          }
          // System.out.println("Adresse : " + this.adresse.getVille() + " " +
          // this.adresse.getCodePostal() + " " + this.adresse.getRue());
     }

     public String getSituationProfessionnelle() {
          String stPro = age < 25 ? "En emploi" : "Au chomage";
          return stPro;
     }

     public String getSituationProfessionnelle(boolean hasEmploi) {
          String stPro = hasEmploi ? "En emploi" : "Au chomage";
          return stPro;
     }

     public String getNom() {
          return nom;
     }

     public void setNom(String nom) {
          this.nom = nom;
     }

     public String getPrenom() {
          return prenom;
     }

     public void setPrenom(String prenom) {
          this.prenom = prenom;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public double getTaille() {
          return taille;
     }

     public void setTaille(double taille) {
          this.taille = taille;
     }

     public boolean isHasJob() {
          return hasJob;
     }

     public void setHasJob(boolean hasJob) {
          this.hasJob = hasJob;
     }

     @Override
     public String toString() {
          return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", taille=" + taille + ", hasJob="
                    + hasJob + ", getSituationProfessionnelle()=" + getSituationProfessionnelle() + ", getNom()="
                    + getNom() + ", getPrenom()=" + getPrenom() + ", getClass()=" + getClass() + ", getAge()="
                    + getAge() + ", getTaille()=" + getTaille() + ", isHasJob()=" + isHasJob() + ", hashCode()="
                    + hashCode() + ", toString()=" + super.toString() + "]";
     }

     @Override
     public boolean equals(Object obj) {
          Person other = (Person) obj;
          if (nom == null) {
               if (other.nom != null)
                    return false;
          } else if (!nom.equalsIgnoreCase(other.nom))
               return false;
          if (prenom == null) {
               if (other.prenom != null)
                    return false;
          } else if (!prenom.equalsIgnoreCase(other.prenom))
               return false;
          return true;
     }

     public Adresse getAdresse() {
          return adresse;
     }

     public void setAdresse(Adresse adresse) {
          this.adresse = adresse;
     }

     public List<String> getDiplomes() {
          return diplomes;
     }

     public void setDiplomes(List<String> diplomes) {
          this.diplomes = diplomes;
     }

}
