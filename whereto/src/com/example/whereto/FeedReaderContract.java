package com.example.whereto;

import android.database.sqlite.*;
import android.provider.BaseColumns;

public final class FeedReaderContract {
	
	//To prevent someone from accidentally instantiating the contract
	//class, give it an empty constructor 
	
	public FeedReaderContract() {}
	
	//Define Table Contents
	public static abstract class FeedEntry implements BaseColumns{
		public static final String TABLE_NAME = "User Information";
	}

}
