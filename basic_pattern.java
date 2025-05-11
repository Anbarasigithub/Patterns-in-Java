import java.util.Scanner;
class basic_pattern{
    public static void main(String args[])
    {
        int n,m;
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        m=a.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}