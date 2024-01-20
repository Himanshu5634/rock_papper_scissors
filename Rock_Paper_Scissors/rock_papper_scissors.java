import java.util.Scanner;
import java.util.Random;
public class rock_papper_scissors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random random=new Random();
        int r=random.nextInt(3);
       // System.out.println(random);
        System.out.println("Rock-->0 \nPapper-->1 \nSeissor-->2");
        System.out.print("enter your choice:");
        int a=s.nextInt();

        if(a==0&&r==2 || a==1&&r==0 || a==2&&r==1){

            System.out.println("computer choise:"+r);
            System.out.println("you win!!");


        }
        else if(a==r){
            System.out.println("computer choise:"+r);
            System.out.println("draw....");

        }
        else{
            System.out.println("computer choise:"+r);
            System.out.println("you loss");
        }



    }
}
