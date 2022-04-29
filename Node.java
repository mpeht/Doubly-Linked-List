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
public class Node {

    public Node previous;
    public Node next;
    public Client client;

    public Node(Client obj) {
        this.previous = null;
        this.next = null;
        this.client = obj;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void nodeDisplay() {
        String name = client.getName();
        String adress = client.getAdress();
        String tel = client.getTel();

        System.out.print("Name: " + name + " \n"
                + "Adress: " + adress + "\n"
                + "Tel: " + tel + "\n");
    }

}
