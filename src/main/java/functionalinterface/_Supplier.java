package functionalinterface;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
    }

    static String getDBConnectionURL() {
        return "jdbc://localhost:3030/users";
    }
}
