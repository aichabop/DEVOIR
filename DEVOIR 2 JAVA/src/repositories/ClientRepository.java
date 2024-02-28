package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientRepository extends Database {
   private final  String SQL_SELECT_ALL="Select * from client" ;
   private final  String SQL_SELECT_BY_TEL="Select * from client where tel_client like ? " ;
   private final  String SQL_INSERT="INSERT INTO `client` (`nomComplet_client`, `email_client`, `telephone_client`) VALUES (?,?,?)";
      public void insert(Client client){
        try {
          openConnexion();
          initPreparedStatement(SQL_INSERT);
          statement.setString(1, client.getNomComplet());
          statement.setString(2, client.getEmail());
          statement.setString(3, client.getTelephone());
          int nbreLigne=executeUpdate();
        } 
         catch (SQLException e) {
          System.out.println("Erreur de Connexion a la BD");
        }
        }

      public List<Client> selectAll(){
         List<Client> clients=new ArrayList<>();
        try {
          openConnexion();
          initPreparedStatement(SQL_SELECT_ALL);
          ResultSet rs= executeSelect();
            while (rs.next()) {
               //Une ligne ==> rs de la requete
                Client client=new Client();
                client.setId(rs.getInt("id_client"));
                client.setNomComplet(rs.getString("nomComplet_client"));
                client.setEmail(rs.getString("email_client"));
                client.setTelephone(rs.getString("tel_client"));
                clients.add(client);
            }
            statement.close();
            rs.close();
             closeConnexion();
       } 
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
       return clients;
      }
      public Client selectClientByTel(String tel){
        Client client=null;
        try {
            openConnexion();
            initPreparedStatement(SQL_SELECT_BY_TEL);
            statement.setString(1, tel);
            ResultSet rs= executeSelect();
            if (rs.next()) {
               //Une ligne ==> rs de la requete
                client=new Client();
                client.setId(rs.getInt("id_client"));
                client.setNomComplet(rs.getString("nomComplet_client"));
                client.setEmail(rs.getString("email_client"));
                client.setTelephone(rs.getString("tel_client"));
            }
            statement.close();
            rs.close();
            conn.close();
       } 
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
           return client;
      }
}
