package services;

import java.util.List;

import entities.Adresse;
import repositories.AdresseRepository;

public class AdresseService {
    private AdresseRepository adresseRepository=new AdresseRepository();
    public void AjouterAdresse(Adresse addresse){
        adresseRepository.insert(addresse);
    }
    public List<Adresse> listerAdresse(){
        return AdresseRepository.getAllAdresses();
    }
    
}
