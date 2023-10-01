package AssNum1;

public class EncapMain {
    public static void main(String[] args) {
        EncapDemo encap1 = new EncapDemo();
        encap1.setName("Azhar");
        encap1.setAge(35);
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Rizqi");
        encap2.setAge(15);

        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
    }
}
