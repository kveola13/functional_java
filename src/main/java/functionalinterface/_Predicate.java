package functionalinterface;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("004795959595"));
        System.out.println(isPhoneNumberValid("004695959595"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("0047") && phoneNumber.length() == 12;
    }
}
