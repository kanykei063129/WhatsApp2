package service;

import classes.Person;
import classes.WhatsApp;

import java.util.List;

public interface WhatsAppService {
    String greateWhatsappAccount(WhatsApp whatsApp,List<Person>people);
    List<WhatsApp> getWhatsappUzer();
    WhatsApp getProfil(String pasword,List<WhatsApp>whatsApps);
    String getMAssege(String password,String name,String massege,List<WhatsApp>uzers,List<WhatsApp>uzers2);
}
