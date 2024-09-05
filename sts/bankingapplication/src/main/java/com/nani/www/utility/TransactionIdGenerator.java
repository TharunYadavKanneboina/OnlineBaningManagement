package com.nani.www.utility;

import java.util.UUID;

public class TransactionIdGenerator {
	public static String transactionIdGrnerator()
	{
		UUID u=UUID.randomUUID();
		String v=u.toString().replace("_", "")	;
		String w=v.substring(0,16);
		return w;
	}
}
