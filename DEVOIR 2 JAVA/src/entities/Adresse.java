package entities;

public class Adresse {
    private int id; 
    private String ville; 
    private String quartier;
    private String numVilla;
    public Adresse(int id, String ville, String quartier, String numVilla) {
        this.id = id;
        this.ville = ville;
        this.quartier = quartier;
        this.numVilla = numVilla;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public String getNumVilla() {
        return numVilla;
    }
    public void setNumVilla(String numVilla) {
        this.numVilla = numVilla;
    }
    public void add(Adresse adresse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}
