
public class Song_2 {
    public static void main(String[] args){

        int countBug = 10;
        int bugFix = 2;
        int bugFixResult = bugFix;


        while(countBug>1)
        {
            if(countBug==0)
            {
                System.out.println("Bugs ends");
            }
            System.out.println(countBug + " little bugs in the code,");
            System.out.println(countBug + " bugs in the code,");
            bugFixResult = bugFix ;
            System.out.println( bugFixResult + " bug fixed...compile again,");
            countBug = countBug - bugFix + 1;
            System.out.println(countBug +  " little bugs in the code,");
        }
        System.out.println("All bugs fixed");

    }
}
