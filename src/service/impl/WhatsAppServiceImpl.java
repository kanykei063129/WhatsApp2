package service.impl;

import classes.Person;
import classes.WhatsApp;
import service.WhatsAppService;

import java.util.ArrayList;
import java.util.List;

public class WhatsAppServiceImpl implements WhatsAppService {
    List<WhatsApp> whatsApps = new ArrayList<>();


    @Override
    public String greateWhatsappAccount(WhatsApp whatsApp, List<Person> people) {
        if (whatsApp.getId()==0){
            this.whatsApps.add(whatsApp);
            return "УСПЕШНО!!!";
        }else {
            return "АКАУНТ НЕ СОЗДАН!!!";
        }
    }

    @Override
    public List<WhatsApp> getWhatsappUzer() {
        return this.whatsApps;
    }

    @Override
    public WhatsApp getProfil(String pasword, List<WhatsApp> whatsApps) {
        for (WhatsApp whatsApp : whatsApps) {
            if (whatsApp.getPassword().equals(pasword)) {
                return whatsApp;
            }
        }
        return null;
    }

    @Override
    public String getMAssege(String password, String name, String massege, List<WhatsApp> uzers, List<WhatsApp> uzers2) {
        for (WhatsApp uzer : uzers) {
            for (WhatsApp whatsappUzer : uzers2) {
                if (uzer.getPassword().equals(password)) {
                    if (whatsappUzer.getUzerName().equals(name)) {
                        ArrayList<String> mas = new ArrayList<>();
                        mas.add(massege);
                        whatsappUzer.setMassege(mas);
                        return "СОБШЕННИЕ ОТПРАВЛЕННО!!";
                    }
                }
            }
        }
        return massege;
    }
}
