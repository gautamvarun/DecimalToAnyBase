import java.util.*;
public class DecimalToAnyBase
{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int dn=decimaltoanybase(n,b);
        System.out.println(dn);
    }
    public static int decimaltoanybase(int n,int b){
        int rv=0;
        int power=1;
        while(n>0){
            int dig=n%b;
            n=n/b;
            rv+=dig*power;
            power=power*10;
        }
        return  rv;
    }
}
