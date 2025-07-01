package code.week8.Encrypt;

public class Driver
{
    public static void main(String[] args)
    {

        Secret secret = new Secret("This is a secret message");
        secret.encrypt();

        Password password = new Password("Password123");
        password.encrypt();

        System.out.println("Secret message encrypted: " + secret);
        System.out.println("Secret message decrypted: " + secret.decrypt());
        System.out.println("Password encrypted: " + password);
        System.out.println("Password decrypted: "+ password.decrypt());
    }
}
