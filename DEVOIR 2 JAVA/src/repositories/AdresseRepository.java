package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Adresse;
import entities.Client;

public class AdresseRepository extends Database {
    private final  String SQL_SELECT_ALL="Select * from Adresse a, client c where a.client_id=c.idclient" ;
    private final  String SQL_INSERT="INSERT INTO addresse ('nomComplet_client','email','tel',client_id) VALUE ('?,?;?;?') " ;
    
      public void insert(Adresse adresse){
        try {
          openConnexion();
          initPreparedStatement(SQL_INSERT);
          statement.setString(1, adresse.getNumVilla());
          statement.setString(2, adresse.getQuartier());
          statement.setString(3, adresse.getVille());
          
          
          int nbreLigne=executeUpdate();
        } 
         catch (SQLException e) {
          System.out.println("Erreur de Connexion a la BD");
        }
        }

      public List<Adresse> selectAllAdresses(){
         List<Adresse> adresses=new ArrayList<>();
        try {
          openConnexion();
          initPreparedStatement(SQL_SELECT_ALL);
          ResultSet rs= executeSelect();
            while (rs.next()) {
               
                Client client=new Client();
                    client.setId(rs.getInt("id_client"));
                    client.setEmail(rs.getString("Email_client_client"));
                    client.setNomComplet(rs.getString("NomComplet_client"));
                    client.setTelephone(rs.getString("telephone_client"));
                Adresse adresse=new 4Adresse(0, SQL_INSERT, SQL_INSERT, SQL_INSERT);
                    
                    
                adresse.setQuartier(rs.getString("quartier_adresse"));
                adresse.setVille(rs.getString("ville_adresse"));
                adresse.setNumVilla(rs.getString("NumVilla_adresse"));
                

                adresse.add(adresse);
            }
            
            rs.close();
             closeConnexion();
       } 
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
       return adresses;
      }
      
      }


    

