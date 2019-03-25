package com.pipi.test;

//头文件（另：此程序需要优化~本学渣正在努力~若运行第一遍时有问题请不要关闭cmd再运行一次就好~）
import java.io.*;
import java.util.Date; 

public class getm1{
	public static void main(String args[]){

		int MAX = 2159;//对应视频帧数
		int time = 28;//每帧延时
		int num;
		String s=null;
		
			
		try{
			//循环读取每帧图片
			for (int i = 0; i <= MAX; i++)
			{
				String temp = String.valueOf(i); 
				StringBuffer only = new StringBuffer();
				//路径
				StringBuffer name = new StringBuffer("C:\\Users\\Administrator\\Desktop\\字符输出\\pictur\\ASCII-哔哩哔哩-【1080P】少女终末旅行 OP TV size 中日双字幕（8 字幕组）(7)[高清版] ");
				//将路径与对应文件编号拼接
				StringBuffer sub = new StringBuffer("0000");
				int a = 4-(temp.length());
				sub.replace(a,4,temp);
				only = name.append(sub);
				//定义read流
				File readFile = new File(only+".txt");
				FileReader inOne = new FileReader(only+".txt");
				BufferedReader inTwo = new BufferedReader(inOne);
				if (inOne == null) 
				{
					num = i;
					System.out.println("load completely");
					break;
				}
				while((s=inTwo.readLine())!=null)
				{
					//逐行输出
					System.out.println(s);
				}
				//关闭流
				inOne.close();
				try
				{
					//每帧延时，如需更改帧数时修改上面值就好
					Thread.sleep(time);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
			
	}
}