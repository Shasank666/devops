import java.util.*;
import java.io.*;
 
class Capture
{
     
    static String generateCaptcha(int n)
    {

        Random rand = new Random(62); 
         
        String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      
        String captcha = "";
        while (n-->0){
            int index = (int)(Math.random()*62);
            captcha+=chrs.charAt(index);
        }
           
        return captcha;
    }
    
    public static void main(String[] args)throws IOException
    {
         
        String captcha = generateCaptcha(9);
        System.out.println("Random captcha generator  :");
        System.out.println(captcha);
    }
}
