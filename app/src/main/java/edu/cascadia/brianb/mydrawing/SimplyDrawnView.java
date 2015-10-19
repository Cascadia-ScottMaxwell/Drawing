package edu.cascadia.brianb.mydrawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Edited by Brian Bansenauer on 10/18/15.
 */
public class SimplyDrawnView extends View {

    private Paint mPaint;
    private Path mPath;
    private float mWidth, mHeight;

    public SimplyDrawnView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        mPaint = new Paint();
        mPath = new Path();
    }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE); //draw background

        //Draw line
        mPaint.setColor(Color.BLACK);
        canvas.drawLine(mWidth, 0, 200, mHeight, mPaint);

        //Draw red line
        mPaint.setColor(Color.RED); mPaint.setStrokeWidth(10);
        canvas.drawLine(mWidth / 2, mHeight / 2, mWidth, mHeight, mPaint);
        //Draw green lines
        mPaint.setColor(Color.GREEN); mPaint.setStrokeWidth(20);
        canvas.drawLine(20, 50, mWidth - 20, 50, mPaint);
        mPaint.setColor(Color.GREEN); mPaint.setStrokeWidth(20); mPaint.setAlpha(100);
        canvas.drawLine(20, 200, mWidth - 20, 200, mPaint);
        mPaint.setColor(Color.GREEN); mPaint.setStrokeWidth(20); mPaint.setAlpha(75);
        canvas.drawLine(20, 350, mWidth - 20, 350, mPaint);
        mPaint.setColor(Color.GREEN); mPaint.setStrokeWidth(20); mPaint.setAlpha(50);
        canvas.drawLine(20, 500, mWidth - 20, 500, mPaint);
        mPaint.setColor(Color.GREEN); mPaint.setStrokeWidth(20); mPaint.setAlpha(25);
        canvas.drawLine(20, 650, mWidth - 20, 650, mPaint);
        //Draw Text
        mPaint.setColor(Color.BLACK); mPaint.setTextSize(50);
        canvas.drawText("I am drawing.", 20, mHeight / 2, mPaint);
        //Draw Text on a Path
        //mPaint.setColor(Color.CYAN); mPaint.setTextSize(60);
        //canvas.drawTextOnPath("drawing on a Path can be lots of fun", mPath, 150, 150, mPaint);
        //Draw filled, opaque, and open ovals
        mPaint.setColor(Color.RED);
        canvas.drawCircle(mWidth / 2, mHeight / 2, 20, mPaint);
        mPaint.setColor(Color.GRAY); mPaint.setAlpha(50);
        canvas.drawCircle(mWidth / 2, mHeight / 2, 150, mPaint);
        mPaint.setColor(Color.BLACK); mPaint.setStyle(Paint.Style.STROKE); mPaint.setStrokeWidth(10);
        canvas.drawCircle(mWidth / 2, mHeight / 2, 150, mPaint);
        //Draw bee bitmap
        Drawable b = getResources().getDrawable(R.drawable.bee,null);

    }
}
