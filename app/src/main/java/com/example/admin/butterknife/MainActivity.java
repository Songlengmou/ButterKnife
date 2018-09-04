package com.example.admin.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Butter Knife 配置及使用
 * <p>
 * 使用这个的前提是 安装AS插件 Android ButterKnife Zelezny
 * <p>
 * 在Project Gradle配置文件和Modle Gradle配置文件
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_one)
    TextView tvOne;
    @BindView(R.id.btn_1)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    //①
//    @OnClick(R.id.tv_one)
//    void tvOneOnClick(View view) {
//        String content = ((TextView) view).getText().toString();
//        Toast.makeText(MainActivity.this, "" + content, Toast.LENGTH_SHORT).show();
//    }
//
//    @OnClick(R.id.btn_1)
//    void btnOnClick() {
//        Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
//    }

    //②
    @OnClick({R.id.tv_one, R.id.btn_1})
    void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_one:
                String content = ((TextView) view).getText().toString();
                Toast.makeText(MainActivity.this, "" + content, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_1:
                Toast.makeText(MainActivity.this, "test2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
