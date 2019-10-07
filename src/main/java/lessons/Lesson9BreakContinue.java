package lessons;

public class Lesson9BreakContinue {
    public static void main (String [] args){

       int i = 0;
       int ii=0;
       while(true){
           if(i == 15){
               break;
           }
           System.out.println(i);
           i++;
       }
        System.out.println("Out of cycle because i="+ i);
        System.out.println("---------------------------");
        System.out.println("Start to check 'continue'");

       for (ii=0; ii<=15; ii++){
           if(ii%2==0){
               continue;
           }
           System.out.println("odd numbers "+ii);
       }

    }
}
