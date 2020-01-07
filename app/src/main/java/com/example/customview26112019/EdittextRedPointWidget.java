package com.example.customview26112019;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EdittextRedPointWidget extends RelativeLayout {

    private TextView mTvLabel;
    private EditText mEditext;

    public EdittextRedPointWidget(Context context) {
        super(context);
        init(null);
    }

    public EdittextRedPointWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public EdittextRedPointWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.widget_edittext_red_point,this,true);
        mapview(view);
        loadAttrs(attrs);
        setUpview();
    }


    private void mapview(View view) {
        mEditext = view.findViewById(R.id.edittext);
        mTvLabel = view.findViewById(R.id.tvLabel);
    }

    private void loadAttrs(AttributeSet attrs) {
    }

    private void setUpview() {
    }
}
