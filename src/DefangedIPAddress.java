public class DefangedIPAddress {

    public static void main(String [] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    // "255.100.50.0"
    public static String defangIPaddr(String address) {

        if (address == null || address.isEmpty()) {
            return address; //or return not acceptable IPv4 address
        }

        String defangedIP = "";

        int numOfDecimals = 0;
        for (int i = 0, j = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                numOfDecimals++;
                defangedIP += address.substring(j, i) + "[.]";
                j = i + 1;
            }
            if (numOfDecimals==3) {
                defangedIP += address.substring(j);
                break;
            }
        }

        return defangedIP;
    }
}
