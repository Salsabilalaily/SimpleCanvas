package com.salsabila.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
//import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(Color.WHITE);
        mPaintText.setTextSize(40);
    }

    @SuppressLint("ResourceAsColor")
    public void drawSomething(View view) {
        // Background
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(Color.LTGRAY);

        //dinding
        mPaint.setColor(ContextCompat.getColor(this,R.color.colorRectangle));
        Rect mRect=new Rect();
        mRect.set(300,800, 800, 1300);
        mCanvas.drawRect(mRect,mPaint);

        // Atap
        mPaint.setColor(ContextCompat.getColor(this, R.color.brown));
        Path path = new Path();
        path.moveTo(550, 500); // Atas
        path.lineTo(250, 800); // Bawah kiri
        path.lineTo(850, 800); // Bawah kanan
        //path.lineTo(500, 400); // Balik ke atas
        path.close();
        mCanvas.drawPath(path, mPaint);



        //Pintu
        mPaint.setColor(ContextCompat.getColor(this,R.color.white));
        //Rect mRect=new Rect();
        mRect.set(500,1000, 600, 1300);
        mCanvas.drawRect(mRect,mPaint);

        //gagang pintu
        mPaint.setColor(ContextCompat.getColor(this, R.color.brown));
        mCanvas.drawCircle(580, 1150, 10, mPaint);

        //Jendelakiri
        mPaint.setColor(ContextCompat.getColor(this,R.color.white));
        //Rect mRect=new Rect();
        mRect.set(350,1000, 450, 1100);
        mCanvas.drawRect(mRect,mPaint);

        //Jendelakanan
        mPaint.setColor(ContextCompat.getColor(this,R.color.white));
        //Rect mRect=new Rect();
        mRect.set(650,1000, 750, 1100);
        mCanvas.drawRect(mRect,mPaint);

        //Nama
        mCanvas.drawText("Salsabila", 470, 900, mPaintText);

        //Jalan
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(10);
        mCanvas.drawLine(500, 1300, 300, 2500, mPaint);

        //Jalan2
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(10);
        mCanvas.drawLine(600, 1300, 800, 2500, mPaint);

        //kayujendelakirivertikal
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(400, 1000, 400, 1100, mPaint);

        //kayujendelakirihorizontal
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(350, 1050, 450, 1050, mPaint);

        //kayujendelakananvertikal
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(700, 1000, 700, 1100, mPaint);

        //kayujendelakananhorizontal
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(650, 1050, 750, 1050, mPaint);
        view.invalidate();

        //Cerobong asap
        mPaint.setColor(ContextCompat.getColor(this, R.color.colorRectangle));
        mRect.set(680, 550, 750, 700);
        mCanvas.drawRect(mRect,mPaint);
    }
}




    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(), R.color.purple_200, null));
        mPaintText.setTextSize(80);
    }
    public void drawSomething (View view){
        int vWidth=view.getWidth();
        int vHeight=view.getHeight();
        mBitmap=Bitmap.createBitmap(vWidth,vHeight,Bitmap.Config.ARGB_8888);
        mCanvas=new Canvas(mBitmap);
        mCanvas.drawColor(Color.GREEN);
        mCanvas.drawText(getString(R.string.app_name), 100, 100, mPaintText);

        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(10);
        mCanvas.drawLine(100,150,400,150,mPaint);

        mPaint.setColor(Color.RED);
        Rect mRect=new Rect();
        mRect.set(100,200,600,400);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.CYAN);
        mCanvas.drawCircle(250,500, 100, mPaint);

        Path path=new Path();
        path.moveTo(100,700);
        path.lineTo(300,800);
        path.lineTo(500,700);
        path.lineTo(700,800);

        mPaint.setColor(Color.MAGENTA);
        mCanvas.drawPath(path, mPaint);

        mPaint.setColor(Color.GRAY);
        RectF rectF=new RectF();
        rectF.set(100,200,600,400);
        mCanvas.drawOval(rectF,mPaint);

        view.invalidate();
    }
}

     */