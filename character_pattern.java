import java.util.Scanner;
class character_pattern{
    public static void main(String args[])
    {
        int n;
        char ch='A';
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println(" ");
        }
    }
}