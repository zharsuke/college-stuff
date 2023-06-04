package assnum4;

public class Node {
    public String nim, name;
    public double gpa;
    Node prev, next;

    public Node(Node prev, String nim, String name, double gpa, Node next) {
        this.prev = prev;
        this.next = next;
        this.nim = nim;
        this.name = name;
        this.gpa = gpa;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
