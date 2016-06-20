package com.sender2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

/**
 * 列表控件
 * @author 屈向前
 */
public class ListView extends android.widget.ListView {
    private String url="";



    /**
     * 设置网络地址的URL路径
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }



    public ListView(Context context) {
        super(context);
        init(null, 0);
    }

    public ListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public ListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        // Load attributes
        final TypedArray a = getContext().obtainStyledAttributes(
                attrs, R.styleable.ListView, defStyle, 0);
        String s= a.getString(R.styleable.ListView_url);
        if(!s.equals("")){
            this.url=s;
//            String[] strs=a.getString(R.styleable.ListView_url).split(",");
//            this.setAdapter(new ArrayAdapter<String>(this.getContext(),android.R.layout.simple_list_item_1, strs));
        }


    }

    private void invalidateTextPaintAndMeasurements() {

    }

    /**
     * 加载数据
     */
    public void load(){

    }




}
