import java.util.*;

public class meituan6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //巧克力数量
        int m = in.nextInt(); //询问次数
        long ques;
        ArrayList<Integer> cholo = new ArrayList<Integer>();
        long[] pre = new long[n];
        for(int i = 0;i < n;i++){
            int q = in.nextInt();
            cholo.add(q );
        }
        cholo.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        pre[0] = cholo.get(0);
        for(int i = 1 ;i <n ;i++){
            pre[i] = pre[i-1] + cholo.get(i)*cholo.get(i);
        }

        for(int i = 0;i<m;i++){
            ques = in.nextLong();
            for(int j = 0;j<n;j++){
                if(ques< pre[j]){
                    System.out.println(j);
                    break;
                }
                if( j == n-1){
                    System.out.println(n);
                }
            }
        }



    }
}