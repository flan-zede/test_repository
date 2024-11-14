import ci.model.Etudiant;
import ci.model.Person;

import java.util.ArrayList;
import java.util.List;

import ci.model.Adresse;

public class App {
     public static void main(String[] args) throws Exception {
          // Person person = new Person();
          // person.afficher();
          // String stPro = person.getSituationProfessionnelle();
          // System.out.println("Stuation professionnelle : " + stPro);
          // String stPro2 = person.getSituationProfessionnelle(false);
          // System.out.println("Stuation professionnelle : " + stPro2);
          // person.setNom("Bamba");
          // person.setPrenom("Karidja");
          // System.out.println(person.getNom() + " " + person.getPrenom());

          Adresse addr = new Adresse("Abidjan", "225", "I 135");
          // addr.afficher();

          Person person1 = new Person("FlAN", "Gohon Adèle", 41, 1.63);

          person1.setAdresse(addr);
          List<String> diplomes = new ArrayList<String>();

          diplomes.add("BEPC");
          diplomes.add("BAC");
          diplomes.add("MASTER");
          person1.setDiplomes(diplomes);

          person1.afficher();

          Person person2 = new Person("FLAN", "Zédé Delphin", 35, 1.69, true);
          // person2.setAdresse(addr);
          person2.afficher();

          // Etudiant etu = new Etudiant();
          // etu.setNom("Gomy");
          // System.out.println(etu.toString());

          // System.out.println(person1.equals(person2));

     }
}
