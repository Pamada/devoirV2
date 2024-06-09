package model;

public class Etudiant {
   private  int id;
   private String nom;
   private String prenom;
   private String specialite;

    public Etudiant(int id,String nom, String prenom, String specialite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

   // @Override
   // public String toString() {
      //  return "Etudiant{" +
              //  "id=" + id +
              //  ", nom='" + nom + '\'' +
              //  ", prenom='" + prenom + '\'' +
              //  ", specialite='" + specialite + '\'' +
             //   '}';
   // }
}
