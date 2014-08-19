package com.yuva.android.customlistview;

import java.util.LinkedList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter{
	
	private LayoutInflater mInflater;
	private Context mContext;
	private LinkedListHolder mLisItem;
	private LinkedList<LinkedListHolder> mLinkList;

	public CustomListAdapter(Context context,LinkedList<LinkedListHolder> mLinkedList) {
		// TODO Auto-generated constructor stub
		this.mContext=context;
		this.mLinkList=mLinkedList;
		this.mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mLinkList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		final ViewHolder mHolder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item, null);
			mHolder = new ViewHolder();

			mHolder.mName=(TextView) convertView.findViewById(R.id.name);
			mHolder.mCountry=(TextView) convertView.findViewById(R.id.Country);
			mHolder.mFlag=(ImageView) convertView.findViewById(R.id.itemImage);
			convertView.setTag(mHolder);

		} else {
			mHolder = (ViewHolder) convertView.getTag();
		}
		mLisItem=mLinkList.get(position);
		mHolder.mName.setText(mLisItem.Name);
		mHolder.mCountry.setText(mLisItem.Country);
		mHolder.mFlag.setBackgroundResource(mLisItem.Flag);
		return convertView;
	}
	
	private class ViewHolder {
		private TextView mName;
		private TextView mCountry;
		private ImageView mFlag;
	}

}
