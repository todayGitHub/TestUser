package com.neuedu.Util;

public class ScannerUtil {
	public static int getInt(String a,int start,int end){
		int b = -1;
		if(!("".equals(a)||a==null)){			
				try{
					b = Integer.parseInt(a);
					if(b>=start && b<=end){
						return b;
					}else{
						return -1;
					}
				}catch(NumberFormatException e){
					System.out.println(a+"´íÎó");	
				}	
				
		}
		return b;		
	}
}
