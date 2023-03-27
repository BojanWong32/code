import java.util.*;

public class meituan2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //巧克力数量
        int m = in.nextInt(); //询问次数
        long ques;
        ArrayList<Long> cholo = new ArrayList<Long>();
        long[] pre = new long[n];
        for(int i = 0;i < n;i++){
            long q = in.nextLong();
            cholo.add(q * q);
        }
        cholo.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int)(o1 - o2);
            }
        });
        pre[0] = cholo.get(0);
        for(int i = 1 ;i <n ;i++){
            pre[i] = pre[i-1] + cholo.get(i);
        }

        for(int i = 0;i<m;i++){
            ques = in.nextLong();
            for(int j = n-1;j>=0;j--){
                if(ques>= pre[j]){
                    System.out.println(j+1);
                    break;
                }
                if( j == 0){
                    System.out.println(0);
                }
            }
        }



    }
}