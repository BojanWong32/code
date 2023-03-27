import java.util.Scanner;
import java.util.Stack;

public class meituan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        for(int z = 1 ;z <= t ;z++){
            int index = 0;
            int[] inQueue = new int[50005];
            int[] outQueue = new int[50005];
            Stack<Integer> station = new Stack<Integer>();
            n = in.nextInt();
            for(int i = 0 ;i < n;i++){
                inQueue[i] = in.nextInt();
            }
            for(int i = 0 ;i < n;i++){
                outQueue[i] = in.nextInt();
            }
            for(int i = 0;i < n;i++){
                station.push(inQueue[i]);
                while(index<n && !station.empty()){
                    if(station.peek() == outQueue[index]){
                        station.pop();
                        index++;
                    }else{
                        break;
                    }
                }
            }
            if(index == n && station.empty()){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }

    }
}