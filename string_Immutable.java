
public class string_Immutable {

    public static void main(String[] args) {
        String str = "Vaishnavi";
        str.concat(" Kesherwani");  // cant change
        String str2 = str.concat(" Kesherwani");
        System.out.println(str);
        System.out.println(str2);
    }
}
