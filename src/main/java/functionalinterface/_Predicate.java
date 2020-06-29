package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("004795959595"));
        System.out.println(isPhoneNumberValid("004695959595"));
        System.out.println(isPhoneNumberValid("00479595959"));
        System.out.println(isPhoneNumberValid("00469595959"));

        System.out.println(isPhoneNumberValidPredicate.test("004795959595"));
        System.out.println(isPhoneNumberValidPredicate.test("004795959595"));
        System.out.println(isPhoneNumberValidPredicate.test("00479595959"));
        System.out.println(isPhoneNumberValidPredicate.test("00469595959"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumberNine).test("004795959595"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumberNine).test("004795959595"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("0047") && phoneNumber.length() == 12;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("0047") && phoneNumber.length() == 12;

    static Predicate<String> containsNumberNine = phoneNumber -> phoneNumber.contains("9");
}
