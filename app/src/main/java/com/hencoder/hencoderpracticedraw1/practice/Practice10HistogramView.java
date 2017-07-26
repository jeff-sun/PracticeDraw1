package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Path path = new Path();
        paint.setColor(Color.WHITE);
        float[] point = {100,700,100,100,100,700,1000,700};
        canvas.drawLines(point,paint);
        paint.setTextSize(18);
        String[] str = {"Froyo","GB","ICBS","JB","KitKat","L","M"};
        canvas.drawText(str[0],130,720,paint);
        canvas.drawText(str[1],250,720,paint);
        canvas.drawText(str[2],360,720,paint);
        canvas.drawText(str[3],460,720,paint);
        canvas.drawText(str[4],570,720,paint);
        canvas.drawText(str[5],700,720,paint);
        canvas.drawText(str[6],800,720,paint);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(60);
        float[] points = {
                150,700,150,690,
                260,700,260,690,
                370,700,370,650,
                480,700,480,630,
                590,700,590,580,
                700,700,700,500,810,700,810,400};
        canvas.drawLines(points,paint);

    }
}
