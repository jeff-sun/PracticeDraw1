package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Path path = new Path();
        //第一步，path添加左边一个扇形
        path.addArc(200, 200, 400, 400, -225, 225);
        //第二步，从第一步完成的地方添加右边的扇形
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        //第三步，从第二部步结束的地方画线，到点(400,542)也就是心形最下面的点，并与起点封闭封闭
        path.lineTo(400,542);
        //画图
        canvas.drawPath(path,paint);

    }
}
