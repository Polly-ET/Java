package code.week8.Encrypt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Password implements Encryptable
{
        private String password;
        private boolean encrypted = false;

    public Password(String password)
    {
        this.password = password;
    }


    public void encrypt()
        {
            if (!encrypted)
            {
                password = new StringBuilder(password).reverse().toString();
                encrypted = true;
            }
        }

        public String decrypt()
        {
            if (encrypted)
            {
                password = new StringBuilder(password).reverse().toString();
                encrypted = false;
            }
            return password;
        }

        public String toString()
        {
            return password;
        }

}
