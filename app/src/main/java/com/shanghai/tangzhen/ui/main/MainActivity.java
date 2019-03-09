package com.shanghai.tangzhen.ui.main;

import android.os.Bundle;
import android.widget.TextView;

import com.shanghai.tangzhen.R;
import com.shanghai.tangzhen.ui.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.sample_text)
    TextView tv;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tv.setText(stringFromJNI());

        
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
