public class throwuse {
        public static void validate(int age) {
            if(age < 18) {
                throw new ArithmeticException("Person is not eligible to vote");
            }
            else {
                System.out.println("Person is eligible to vote!!");
            }
        }
        public static void main(String[] args){
            try {
                validate(14);
            } catch (Exception e) {
                System.out.println("exception handled");
            }
            System.out.println("rest of the code...");
        }
}
