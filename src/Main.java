public class Main {
    public static void main(String[] args) {
        Hashtable table =new Hashtable(10);
        table.insert(2);
        table.insert(5);
        table.insert(10);
        table.insert(12);
        table.insert(3);
        table.display();
        System.out.println(table.search(3).getData());
        System.out.println(table.delete(3).getData());
        table.display();
        table.insert(4);
        table.display();
        table.insert(3);
        table.insert(7);
        table.insert(20);
        table.insert(11);
        table.insert(15);
        table.display();
        table.delete(15);
        table.display();
    }
}
