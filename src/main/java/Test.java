public class Test {

    public static void main(String args[]){
        String password  ="AUzs-nV";
        if(!password.matches(".*[0-9].*"))
            System.out.println("Yes");


        if(!password.matches("(.*[a-z].*)")){
            System.out.println("capital");
        }
        if(!password.matches(".*[0-9].*")){
            System.out.println("number");
        }
        if(!password.matches(".*[!@#$%^&*()-+].*")){
            System.out.println("special");
        }
        if(!password.matches(".*[-].*")){
            System.out.println("special2");
        }

    }

}
