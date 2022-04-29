/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in01 = new Scanner(System.in);
        Scanner in02 = new Scanner(System.in);
        AppDoubly list = new AppDoubly();
        Client client;
        int op;
        String name, adress, email, tel;
        
            do{
            System.out.println("Enter you option: \n"
                    + "1 - Insert a client in the list; \n"
                    + "2 - Remove a client in the list; \n"
                    + "3 - Search client by name: "
                    + "4 - See all clients in the list;\n"
                    + "5 - Exit. \n");
            op = in01.nextInt();
            
            switch(op)  {
                case 1:
                        
                        System.out.print("Insert the name of client: ");
                        name = in02.nextLine();
                        System.out.print("Insert the adress of client: ");
                        adress = in02.nextLine();
                        System.out.print("Insert the email of client: ");
                        email = in02.nextLine();
                        System.out.print("Insert the Telephone of client: ");
                        tel = in02.nextLine();
                        client = new Client(name, adress, email, tel);
                        list.insetRightSide(client);
                        break;
                case 2:
                    list.removeRightSide();
                    break;
                case 3:
                    System.out.print("Insert the name of client: ");
                        name = in02.nextLine();;
                        list.search(name);
                        break;
                case 4:
                    list.print();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(op >= 1 && op < 6);
    }
    
}
