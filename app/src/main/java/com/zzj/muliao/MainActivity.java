package com.zzj.muliao;

import android.support.annotation.Nullable;
import android.widget.TextView;


import com.zzj.common.app.Activity;

import butterknife.BindView;

public class MainActivity extends Activity {
//    @BindView(R.id.main_text)
//    TextView mTextView;

    @BindView(R.id.text_main) TextView text;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
//        TextView text = (TextView) findViewById(R.id.text);
//        text.setText("hhhhhhhhhhhhhhhhh");
        text.setText("hahahahahah");
    }
}
