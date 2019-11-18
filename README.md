# Xufan
实验目的：<br>
====

掌握字符串String及其方法的使用<br>
掌握异常处理结构<br>

业务要求<br>
====
内容：<br>
   利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：<br>
     1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”<br>
     2.允许提供输入参数，统计古诗中某个字或词出现的次数。<br>
     3.考虑操作中可能出现的异常，在程序中设计异常处理程序。<br>
   
流程图<br>
====
![Image text](https://github.com/IvanZima/Xufan/blob/master/%E6%B5%81%E7%A8%8B%E5%9B%BE.PNG)

核心代码<br>
=====

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
通过for循环进行字符串的分割和添加标点符号。

      public static int count(String srcStr, String findStr) {
		int count = 0;
		int index = 0;
		while ((index = srcStr.indexOf(findStr, index)) != -1) {
			index = index + findStr.length();
			count++;
		}
		return count;
	}
	int count = count(args[0], str);
        System.out.println(str + " 出现 " + count + " 次。");
	
编写count函数对字符串的计数以及函数的调用<br>

程序截图<br>
=========


