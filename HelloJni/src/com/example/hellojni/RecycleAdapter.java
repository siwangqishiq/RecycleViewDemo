package com.example.hellojni;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RecycleAdapter extends RecyclerView.Adapter<ViewHolder> {
	private List<Bean> beans;

	public RecycleAdapter(List<Bean> beans) {
		super();
		this.beans = beans;
	}

	public class ImageHolder extends RecyclerView.ViewHolder {
		public ImageView mImageview;
		public ImageHolder(View textview) {
			super(textview);
			this.mImageview = (ImageView) textview.findViewById(R.id.myimage);
		}
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return beans.size();
	}

	/**
	 * 获取消息的类型
	 */
	@Override
	public int getItemViewType(int position) {
		// TODO Auto-generated method stub
		return beans.get(position).getType();
	}

	/**
	 * 创建VIewHolder
	 */
	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewtype) {
		View v = null;
		v = LayoutInflater.from(parent.getContext()).inflate(
		          R.layout.recylce_item_x, null);
		ImageHolder	holer = new ImageHolder(v);
		return holer;
	}

	/**
	 * 绑定viewholder
	 */
	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {
		ImageHolder imageHoler = (ImageHolder) holder;
		imageHoler.mImageview.setImageResource(R.drawable.ic_launcher);
	}
}
