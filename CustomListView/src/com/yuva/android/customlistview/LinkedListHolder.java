package com.yuva.android.customlistview;

import android.content.Context;

class LinkedListHolder implements Comparable<LinkedListHolder>{
	protected String Name;
	protected String Country;
	protected int Flag; 
	protected Context mContext;

	LinkedListHolder(String Name,String mCountry,int mFlag){
		this.Name=Name;
		this.Country=mCountry;
		this.Flag=mFlag;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	@Override
	public int compareTo(LinkedListHolder c) {
		return this.getName().compareTo(c.getName());
	} 
}
