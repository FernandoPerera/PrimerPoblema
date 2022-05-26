public class Main {

    public static void main(String[] args) {

        SuperList list = new SuperList();

        list.addElement(2);
        list.addElement(7);
        list.addElement(10);
        list.addElement(5);

        list.removeElement(3);

        list.showElements();

        System.out.println("----------------");

        list.showReversedElements();
    }
}
