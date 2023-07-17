import java.util.Scanner;
public class Unset_ithBit {
    static int findUnSet(int n, int index) {
        int x=n;
        for(int i=0;i<index;i++){
            x>>=1;
        }
        if((x&1)==1){
            return n^(1<<index);
        }
        else{
            return n;
        }

    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int A= scanner.nextInt();
        int B=scanner.nextInt();
        int unsetBits=findUnSet(A,B);
        System.out.println(unsetBits);
    }
}
