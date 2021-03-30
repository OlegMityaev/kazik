package com.example.kazik;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import static androidx.core.content.ContextCompat.startActivity;

public class MyView extends View {


    Paint paint = new Paint();

    public MyView(Context context) {
        super(context);

    }
    Intent i;

    String[] a = {"Гугнир", "Леон", "Банка пива", "Говно", "ЧИЖ", "CUM", "СНЮС"};
    int n = (int) Math.floor(Math.random() * a.length);
    int q = (int) Math.floor(Math.random() * a.length);
    int w = (int) Math.floor(Math.random() * a.length);
    int e = (int) Math.floor(Math.random() * a.length);
    int r = (int) Math.floor(Math.random() * a.length);
    int t = (int) Math.floor(Math.random() * a.length);
    int y = (int) Math.floor(Math.random() * a.length);
    int u = (int) Math.floor(Math.random() * a.length);

    float x = 0;
    float c = 25f;


    void Krug(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x, 900, x + 400, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        canvas.drawText(a[n], x + 100, 765, paint);
        x += c;

    }


    void Krug1(Canvas canvas) {
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x + 400, 900, x + 800, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        canvas.drawText(a[q], x + 500, 765, paint);

        x += c;
    }

    void Krug2(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x + 800, 900, x + 1200, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        canvas.drawText(a[w], x + 850, 765, paint);
        x += c;
        if (x + 400 > 700) {
            x = -1300;
        }

    }

    void Krug3(Canvas canvas) {
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x + 1200, 900, x + 1600, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        canvas.drawText(a[r], x + 1300, 765, paint);
        x += c;
    }

    void Krug4(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x + 1600, 900, x + 2000, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        canvas.drawText(a[t], x + 1700, 765, paint);
        x += c;
    }

    void Krug5(Canvas canvas) {
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x - 400, 900, x, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        //int n = (int)Math.floor(Math.random() * a.length);
        canvas.drawText(a[e], x - 300, 765, paint);
        x += c;
    }

    void Krug6(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x + 2000, 900, x + 2400, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        //int n = (int)Math.floor(Math.random() * a.length);
        canvas.drawText(a[y], x + 2100, 765, paint);
        x += c;

    }

    void Krug7(Canvas canvas) {
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(x - 800, 900, x - 400, 600, paint);
        paint.setTextSize(60f);
        paint.setColor(Color.BLACK);
        //int n = (int)Math.floor(Math.random() * a.length);
        canvas.drawText(a[u], x + 2500, 765, paint);
        x += c;

    }

    void WIN(Canvas canvas) {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        paint.setTextSize(100f);
        paint.setColor(Color.GREEN);
        canvas.drawText("Ваш выигрыш:", 200, 300, paint);
        canvas.drawText(a[q], 400, 500, paint);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        Krug7(canvas);
        Krug5(canvas);
        Krug(canvas);
        Krug1(canvas);
        Krug2(canvas);
        Krug3(canvas);
        Krug4(canvas);
        Krug6(canvas);

        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        float m = 0.5f;
        if (c == 0) {
            m = 0.00000f;
            WIN(canvas);
        }
        c -= m;

        invalidate();
    }

}


