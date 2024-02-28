package entities;

public class Client {
    public Client() {
    }
    public Client(int id, String nomComplet, String email, String telephone) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.email = email;
        this.telephone = telephone;
    }
    private int id;
    private String nomComplet; 
    private String email; 
    private String telephone;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
