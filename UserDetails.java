public class UserDetails {
    public String name;
    public int id;
    public String email;

    private String creditCardNo;
    private double creditCardBalance;

    public UserDetails(String name, int id, String email, String creditCardNo, double creditCardBalance){
        this.name = name;
        this.id = id;
        this.email = email;
        this.creditCardNo = creditCardNo;
        this.creditCardBalance = creditCardBalance;
    }

    public String getCreditCardNo(){
        return creditCardNo;
    }
    public double getCreditCardBalance(){
        return creditCardBalance;
    }

    public void printPublicInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Email: "+email);
    }

    //helpful for testing
    public static void main(String[] args){
        UserDetails user = new UserDetails("Tarush", 210, "test@gmail.com", "1234567891234567", 0);

        user.printPublicInfo();

        //System.out.println(user.creditCardNo); -- > results in error

        System.out.println("Credit Card : "+ user.getCreditCardNo());
        System.out.println("Credit Card Balance: "+user.getCreditCardBalance());
    }
}
