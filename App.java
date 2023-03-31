import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack <String> Jurusan = new Stack <String>();
        Jurusan.push ("teknik informatika");
        Jurusan.push ("teknik industri");
        Jurusan.push ("teknik mesin");
        Jurusan.push ("DKV");

        System.out.println("Stack items \t\t  : "+ Jurusan );
        Jurusan.pop();
        System.out.println("Stack after pop \t  : "+ Jurusan );
        System.out.println("pick \t\t\t  : "+ Jurusan.peek() );

        System.out.println("Chek apakah kosong?\t  : "+ Jurusan.empty() );
        System.out.println("Chek apakah kosong?\t  : "+ Jurusan.isEmpty() );

        System.out.println("lihat index ke 2\t: " +Jurusan.get(1));
        System.out.println("lihat index pertama\t: " +Jurusan.firstElement());
        System.out.println("lihat index pertama\t: " +Jurusan.lastElement());
        Jurusan.remove(1);
        System.out.println("Stack items sebelum clear\t: " +Jurusan);
        Jurusan.clear();
        System.out.println("Stack items setelah clear\t: " +Jurusan);

        for (String j : Jurusan ) {
            System.out.println("Stack items\t : " + j);
        }
    }
}