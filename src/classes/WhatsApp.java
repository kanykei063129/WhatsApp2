package classes;

import enums.Status;

import java.util.ArrayList;
import java.util.List;

public class WhatsApp {
    private int id;
    private String uzerName;
    private int phoneNumber;
    private Status status;
    private Status image;
    private String password;
    private ArrayList<String> massege;
    private List<Person> people;

    public WhatsApp(int id, int phoneNumber, String uzerName, Status status, Status image, String password, ArrayList<String> massege, List<Person> people) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.uzerName = uzerName;
        this.status = status;
        this.image = image;
        this.password = password;
        this.massege = massege;
        this.people = people;
    }

    public WhatsApp(int id2, int phoneNumber, String whatsappName, Status неМогуГоворитьТолькоWhatsapp, String default_image, String password) {
    }

    public WhatsApp(int id2, int phoneNumber, String whatsappName, Status неМогуГоворитьТолькоWhatsapp, String default_image, String password, List<Person> person) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUzerName() {
        return uzerName;
    }

    public void setUzerName(String uzerName) {
        this.uzerName = uzerName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getImage() {
        return image;
    }

    public void setImage(Status image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getMassege() {
        return massege;
    }

    public void setMassege(ArrayList<String> massege) {
        this.massege = massege;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>" +
                "\nID : " + id +
                "\nPHONE NUMBER : " + phoneNumber +
                "\nUZER NAME : " + uzerName +
                "\nWHATSAPP STATUS : " + status +
                "\nWHATSAPP image : " + image +
                "\nPASWORD : " + password +
                "\nMASSEGE : " + massege;
    }
}
