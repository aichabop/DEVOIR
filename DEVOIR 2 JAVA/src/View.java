import java.util.List;
import java.util.Scanner;

import entities.Adresse;
import entities.Client;
import services.AdresseService;
import services.ClientService;

public class View {
    private static AdresseService adresseService;

    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        ClientService clientService=new ClientService();
        do {
            System.out.println("1-Creer un client");
            System.out.println("2-Lister les clients");
            System.out.println("3-Ajouter une Adresse et lui associe un client");
            System.out.println("4-Lister les adresses en affichant le nom du client");
            System.out.println("5-quitter");
            

            choix=sc.nextInt();
            sc.nextLine();
            String tel;
            switch (choix) {
                case 1:
                    System.out.println("Entrer un nomComplet");
                    String nomComplet=sc.nextLine(); 
                    System.out.println("Entrer un Email");
                    String email=sc.nextLine();   
                    System.out.println("Entrer le Telephone");
                    tel=sc.nextLine();
                    Client client=new  Client();
                    
                      client.setNomComplet(nomComplet);
                      client.setEmail(email);
                      client.setTelephone(tel);
                      
                      clientService.ajouterClient(client);
                   break;
                   case 2:
                   List<Client>  clients= clientService.listerClient();
                   for (Client cl: clients) {
                     System.out.println("nomComplet "+ cl.getNomComplet());
                     System.out.println("Email "+ cl.getEmail());
                     System.out.println("Telephone "+cl.getTelephone() );
                     System.out.println("=================================");
               }
                    break;
                    case 4:
                    
                    
                    List<Adresse> adresses= adresseService.listerAdresse();
                    for( Adresse a: adresses){
                        System.out.println("ID: "+a.getId());
                        System.out.println("Ville: "+a.getVille());
                        System.out.println("Quartier: "+a.getQuartier());
                        System.out.println("numVilla: "+a.getNumVilla());
                        System.out.println("++++++++++++++++");
                        

                        
                        
                        

                        
                    }
                    break;

                   default:
                         break;

            }
            
        }while (choix!=5);
    }
}
