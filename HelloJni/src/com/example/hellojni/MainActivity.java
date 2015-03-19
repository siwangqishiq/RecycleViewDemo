package com.example.hellojni;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {
	private RecyclerView mRecyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

		// // improve performance if you know that changes in content
		// // do not change the size of the RecyclerView
		mRecyclerView.setHasFixedSize(true);

		// �������ֹ�����
		LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
		//mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
		mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
		mRecyclerView.setLayoutManager(mLayoutManager);
		
		// ��ʼ������
		List<Bean> myDataset = new ArrayList<Bean>();

		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.X_TYPE, "shit"));
		myDataset.add(new Bean(Bean.X_TYPE, "�Ҳ�"));
		myDataset.add(new Bean(Bean.Z_TYPE, "ͼƬ"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.Y_TYPE, "��ť"));
		myDataset.add(new Bean(Bean.X_TYPE, "����"));
		// ����Adapter
		RecycleAdapter mAdapter = new RecycleAdapter(myDataset);
		mRecyclerView.setAdapter(mAdapter);
	}
}// end class
