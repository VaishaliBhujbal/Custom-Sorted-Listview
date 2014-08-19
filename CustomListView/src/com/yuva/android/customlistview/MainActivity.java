package com.yuva.android.customlistview;

import java.util.LinkedList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private LinkedList<LinkedListHolder> mLinkedList;
	private ListView mListview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListview=(ListView) findViewById(R.id.mList);
		mLinkedList=new LinkedList<LinkedListHolder>();
		addData();
		//Collections.sort(mLinkedList);
		mListview.setAdapter(new CustomListAdapter(getApplicationContext(),mLinkedList));
	}

	public void addData(){
		mLinkedList.add(new LinkedListHolder("Mira","India",R.drawable.indian));
		mLinkedList.add(new LinkedListHolder("Kiara","Australia",R.drawable.australia));
		mLinkedList.add(new LinkedListHolder("Harry","France",R.drawable.france));
		mLinkedList.add(new LinkedListHolder("Sam","Greenland",R.drawable.greenland));
		mLinkedList.add(new LinkedListHolder("Kim","Japan",R.drawable.japan));
		mLinkedList.add(new LinkedListHolder("Tom","Mexico",R.drawable.mexico));
		mLinkedList.add(new LinkedListHolder("Adrian","China",R.drawable.china));
		mLinkedList.add(new LinkedListHolder("Rosy","Russia",R.drawable.russian));
		mLinkedList.add(new LinkedListHolder("Andy","Belgium",R.drawable.belgium));
		mLinkedList.add(new LinkedListHolder("Simmi","Canada",R.drawable.canada));
		mLinkedList.add(new LinkedListHolder("Ulfam","Iraq",R.drawable.iraq));
		mLinkedList.add(new LinkedListHolder("Salil","Kuwait",R.drawable.kuwait));
		mLinkedList.add(new LinkedListHolder("Mark","Malaysia",R.drawable.malaysia));
		mLinkedList.add(new LinkedListHolder("Yash","Nepal",R.drawable.nepal));
		mLinkedList.add(new LinkedListHolder("Shikha","Thailand",R.drawable.thailand));
	}
}
