import java.util.*;

public class meituan3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] candy = new int[n];
        int[] dp = new int[n];
        for(int i = 0;i< n;i++){
            candy[i] = in.nextInt();
        }
        for(int i = 0;i< n;i++){
            if(i == 0){
                dp[0] = candy[0];
            }else if(i == 1){
                dp[1] = Math.max(dp[0],candy[1]);
            }else if(i == 2){
                dp[2] = Math.max(dp[0],Math.max(dp[1],candy[2]));
            }else{
                dp[i] = Math.max(dp[i-2],Math.max(dp[i-1],dp[i-3]+candy[i]));
            }
        }
        System.out.println(dp[n-1]);



    }
}