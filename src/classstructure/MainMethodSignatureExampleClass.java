package classstructure;

/**
 *
 */
public class MainMethodSignatureExampleClass {
    public static void main(String[] args) {
        System.out.println("signature1: public static void main(String[] args)");
    }

//     public static void main(String... args) {
//        System.out.println("signature2: public static void main(String... args)");
//    }

//    public static void main(String args[]) {
//        System.out.println("signature3: public static void main(String args[])");
//
//    }

    public static int main(int[] args) {
        System.out.println("NOT an entry point: public static int main(int[] args)");
        return 0;
    }

    public void main(int args) {
        System.out.println("NOT an entry point: public  void main(int args)");
    }
}
