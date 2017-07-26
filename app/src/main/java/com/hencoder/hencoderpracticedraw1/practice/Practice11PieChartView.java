package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        canvas.drawArc(200,200,600,600,180,120,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(210,210,630,630,-60,60,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(210,210,630,630,5,10,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(210,210,630,630,20,10,true,paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(210,210,630,630,35,40,true,paint);
        paint.setColor(Color.LTGRAY);
        canvas.drawArc(210,210,630,630,78,100,true,paint);
        paint.setStrokeWidth(3);
        float[] floats = {100,250,240,250,240,250,260,260};
        paint.setTextSize(20);
        canvas.drawLines(floats,paint);
        canvas.drawText("Lollipop",20,250,paint);
        canvas.drawText("饼图",400,700,paint);
    }
}
