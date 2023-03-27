import java.util.*;

public class meituan5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] candy = new int[n];
        int[][][] dp = new int[n][2][k+1];
        //1：第几天，2：吃没吃，3：还剩几次机会
        for(int i = 0 ;i < n;i++){
            candy[i] = in.nextInt();
        }
        for(int j = 0; j<= k ;j++){
            dp[0][1][j] = candy[0];
            dp[0][0][j] = 0;
        }
        for(int i = 1 ;i < n ;i++){
            for(int j = 0 ;j <=k ;j++){
                dp[i][0][j] = Math.max(dp[i-1][0][j],dp[i-1][1][j]);//今天不吃
                if(j == 0){
                    dp[i][1][j] = dp[i-1][0][j]+candy[i];
                }else{
                    dp[i][1][j] = Math.max(dp[i-1][0][j],dp[i-1][1][j-1])+candy[i];
                }
            }
        }
        int maxCandy = 0;
        for(int j =0;j<2;j++){
            for(int l=0;l<=k;l++){
                if(dp[n-1][j][l]>maxCandy){
                    maxCandy = dp[n-1][j][l];
                }

            }
        }
        System.out.println(maxCandy);




    }
}