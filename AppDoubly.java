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
public class AppDoubly {

    private Node start;
    private Node end;
    private int size;

    public AppDoubly() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public boolean search(String name) {
        for (Node node = start; node != null; node = node.next) {
            if (name.equals(node.getClient().getName())) {
                 System.out.print(node.client + ", ");
                return true;
            }
        }
         System.out.print("unregistered client");
        return false;
    }

    public void insetRightSide(Client client) {
        Node novelNo = new Node(client);
        if (isEmpty()) {
            start = novelNo;
            end = novelNo;
        } else {
            novelNo.setPrevious(end);
            end.setNext(novelNo);
            end = novelNo;
        }
    }

    public void removeRightSide() {
        //Node novelNo = new Node(client);
        if (isEmpty()) {
            System.out.println("Empty List");
        } else if (start == end) {
            start.setClient(null);
            end.setClient(null);
            size--;
        } else {
            end = end.getPrevious();
            end.setNext(null);
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty List");
        } else {
            System.out.println("List size: " + size);
            for (Node node = start; node != null; node = node.next) {
                System.out.print(node.client + ", ");
            }
            System.out.println();
        }

    }
}
