package com.example.aac.java.data.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.aac.expansion.list.AacListActivity;
import com.aac.module.pres.RequiresPresenter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by yangc on 2017/8/14.
 * E-Mail:yangchaojiang@outlook.com
 * Deprecated:
 */

@RequiresPresenter(TestDataListPresenter.class)
public class TestDataListActivity extends AacListActivity<TestDataListPresenter, String> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setLoadMore(true);
          setRefreshing(true);
        getSupportActionBar().setTitle("数据");
    }
   
    @Override
    public int getItemLayout() {  return android.R.layout.simple_list_item_2; }
    @Override
    public void convertViewHolder(BaseViewHolder helper, String item) {
        helper.setText(android.R.id.text1, item);
        helper.setText(android.R.id.text2, item);
    }



}
