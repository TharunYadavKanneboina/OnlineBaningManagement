package com.nani.www.utility;

public class Helper {
	public static String getAlphanumericTransactionId()
	{
		String alphanumericTransactionId="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb=new StringBuilder(16);
		for(int i=0;i<16;i++)
		{
			double a=(int) Math.random();
			int index=(int) (alphanumericTransactionId.length()*a);
			sb.append(alphanumericTransactionId.charAt(index));
		}
		return sb.toString().toUpperCase();
			
			
		}
}
