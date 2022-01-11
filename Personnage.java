package Model;

public class Personnage {

    public int idPersonnage;

    public Personnage(int idPersonnage){
        this.idPersonnage = idPersonnage;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "idPersonnage=" + idPersonnage +
                '}';
    }
}
