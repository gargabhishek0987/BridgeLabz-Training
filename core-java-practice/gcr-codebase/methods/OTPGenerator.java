public class OTPGenerator {
    public static void main(String[] args) {

        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        boolean unique = areOTPsUnique(otps);
        System.out.println("All OTPs Unique? " + unique);
    }
     public static int generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return otp;
    }

    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;   
                }
            }
        }
        return true; 
    }
}
