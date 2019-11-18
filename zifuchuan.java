package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zifuchuan {

	//count model
	public static int count(String srcStr, String findStr) {
		int count = 0;
		int index = 0;
		while ((index = srcStr.indexOf(findStr, index)) != -1) {
			index = index + findStr.length();
			count++;
		}
		return count;
	}
	
	public static void printsplit(String strsplit) {
		for (int i = 0; i<strsplit.length(); i = i+7) {
			if( i%2 == 0 ){
				String split = strsplit.substring(i, i+7);
				System.out.print(split+ "，");			
			} 
			if( i%2 == 1 ){
				String split = strsplit.substring(i, i+7);
				System.out.print(split+ "。" + "\n");			
			} 
		}	
	}
    public static void main(String[] args) {
        printsplit(args[0]);
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String str = null;
        while(true){
            try {
                System.out.println("请输入要查询的字符: " );
                str = br.readLine();
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("错误!");
            }
            //System.out.print(str+"\n");
            break;
        }
		int count = count(args[0], str);
        System.out.println(str + " 出现 " + count + " 次。");
    }
}
