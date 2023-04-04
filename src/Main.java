import classes.Person;
import classes.WhatsApp;
import enums.Country;
import enums.Gender;
import enums.Status;
import service.impl.PersonServiceImpl;
import service.impl.WhatsAppServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peoples = new ArrayList<>();
        List<WhatsApp> whatsApps = new ArrayList<>();
        PersonServiceImpl personServices = new PersonServiceImpl();
        WhatsAppServiceImpl whatsAppService = new WhatsAppServiceImpl();
        while (true) {
            System.out.println("PRESS 1 CREATE PASSPORT!");
            System.out.println("PRESS 2 GET ALL PASPORT!");
            System.out.println("PRESS 3 CREATE WHATSAPP ACCOUNT!");
            System.out.println("PRESS 4 GET ALL WHATSAPP ACCOUNT!");
            System.out.println("PRESS 5 GET WHATSAPP PROFIL!");
            System.out.println("PRESS 6 GET PERSON FIRST NAME!");
            System.out.println("PRESS 7 GET MASSEGE!");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    String aa = scanner.nextLine();
                    System.out.print("FIRST NAME : ");
                    String firstName = scanner.nextLine();
                    System.out.print("LAST NAME : ");
                    String lastName = scanner.nextLine();
                    System.out.print("DATE OF BIRTH-(XXXX-XX-XX) : ");
                    String dateOfBirt = scanner.nextLine();
                    System.out.println(personServices.greate(new Person(id, firstName, lastName, dateOfBirt, Country.KYRGYZSTAN, Gender.FEMALE)));
                    break;
                case 2:
                    System.out.println(personServices.getPerson());
                    break;
                case 3:
                    System.out.print("ID : ");
                    int id2 = scanner.nextInt();
                    String nn = scanner.nextLine();
                    System.out.print("UZER NAME : ");
                    String whatsappName = scanner.nextLine();
                    System.out.print("PHONE NUMBER: ");
                    int phoneNumber = scanner.nextInt();
                    System.out.print("PASWORD : ");
                    String password = scanner.nextLine();
                    System.out.println(whatsAppService.greateWhatsappAccount(new WhatsApp(id2,
                            phoneNumber, whatsappName, Status.НЕ_МОГУ_ГОВОРИТЬ_ТОЛЬКО_WHATSAPP,"Default image",password,personServices.getPerson()), peoples));
                    break;
                case 4:
                    System.out.println(whatsAppService.getWhatsappUzer());
                    break;
                case 5:
                    System.out.print("PASSWORD : ");
                    String password2 = scanner.nextLine();
                    System.out.println(whatsAppService.getProfil(password2, whatsAppService.getWhatsappUzer()));
                    break;
                case 6:
                    System.out.print("FIRST NAME : ");
                    String firstName2 = scanner.nextLine();
                    System.out.println(personServices.getPersonFirsName(firstName2, personServices.getPerson()));
                    break;
                case 7:
                    System.out.print("PASSWORD : ");
                    String password4 = scanner.nextLine();
                    System.out.print("UZER NAME : ");
                    String uz = scanner.nextLine();
                    System.out.print("MASSEGE : ");
                    String massege = scanner.nextLine();
                    System.out.println(whatsAppService.getMAssege(password4, uz, massege, whatsAppService.getWhatsappUzer(), whatsAppService.getWhatsappUzer()));
            }
        }
    }
}