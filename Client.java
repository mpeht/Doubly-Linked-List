/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author mpeht
 */
public class Client {
    
     private String name;
    private String adress;
    private String email;
    private String tel;

    public Client(String name, String adress, String email, String tel) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String toString()    {
        
        String obj;
        obj = "Nome: " + getName() + "\n"
              + "Adress: " + getAdress() + "\n"
                + "Email: " + getTel() +" \n"
              + "Tel: " + getTel() + "\n";
        return obj;       
    }
}
