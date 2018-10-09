package com.example.zjf.complexanimationdemo;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;

public class CustomInterpolatorAvtivity extends Activity {
    private Button btnCustomInterpolator;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtivity_custominterpolator);
        btnCustomInterpolator = (Button)findViewById(R.id.btnCustomInterpolator);
        // 获得当前按钮的位置
        float curTranslationX = btnCustomInterpolator.getTranslationX();
        ObjectAnimator animator = ObjectAnimator.ofFloat(btnCustomInterpolator, "translationX", curTranslationX, 300,curTranslationX);
        // 创建动画对象 & 设置动画
        // 表示的是:
        // 动画作用对象是mButton
        // 动画作用的对象的属性是X轴平移
        // 动画效果是:从当前位置平移到 x=1500 再平移到初始位置

        animator.setDuration(5000);
        animator.setInterpolator(new DecelerateAccelerateInterpolator());
        // 设置插值器
        animator.start();
        // 启动动画
    }
}
