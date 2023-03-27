import java.util.*;

public class meituan4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int q = in.nextInt();
        HashMap<String,String> map = new HashMap<String,String>();

        String[] keys = s.split(";");
        int keyNums = keys.length;
        for(int i = 0;i<keyNums;i++){
            String[] var = new String[2];
            var = keys[i].split("=");
            map.put(var[0],var[1]);
        }
        String keyInput;
        keyInput = in.nextLine();
        for(int i = 0;i < q;i++){
            keyInput = in.nextLine();
            String valueGet = map.get(keyInput);
            if(valueGet == null){
                System.out.println("EMPTY");
            }else{
                System.out.println(valueGet);
            }

        }



    }
}