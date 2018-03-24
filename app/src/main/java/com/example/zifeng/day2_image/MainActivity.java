package com.example.zifeng.day2_image;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by ZiFeng on 2018/3/24.
 */
public class MainActivity extends Activity {
    // 定义一个访问图片的int数组images
    int[] images = new int[]{
            R.drawable.image_0,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };
    // 定义一个int
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 实例化LinearLayout布局容器main
        LinearLayout main = findViewById(R.id.root);
        // 创建一个ImageView控件imageView
        final ImageView imageView = new ImageView(this);
        // 将imageView控件添加到main布局中
        main.addView(imageView);
        // 给imageView控件设置一个显示的图片，images[0]，表示images数组第一个参数
        imageView.setImageResource(images[0]);
        // 给imageView控件设置一个点击事件监听器
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 给imageView控件设置一个显示的图片
                // ++ 是自增1 ，% 是求余运算符
                imageView.setImageResource(images[ ++ currentImg % images.length]);
            }
        });
    }
}
