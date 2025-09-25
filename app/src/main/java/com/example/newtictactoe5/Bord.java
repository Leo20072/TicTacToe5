package com.example.newtictactoe5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Bord extends View {
    private Cell[][] arr;
    private int canvaswidth;
    private int cellwidth, cellhigh;
    private int count = 0;
    private boolean firsttime;
    GameModule game;
    private Context context;

    public Bord(Context context)
    {
        super(context);
        this.context = context;
        this.arr= new Cell[5][5];
        firsttime=true;
        game = new GameModule();
    }

    @Override
    protected void onDraw( Canvas canvas)
    {
        super.onDraw(canvas);
        if (firsttime)
        {
            canvaswidth = canvas.getWidth();
            cellwidth = canvaswidth / 5;
            cellhigh = cellwidth;

            Bitmap picx = BitmapFactory.decodeResource(getResources(), R.drawable.x);
            Bitmap pico = BitmapFactory.decodeResource(getResources(), R.drawable.o);
            picx = Bitmap.createScaledBitmap(picx, cellwidth - 10, cellhigh - 10, false);
            pico = Bitmap.createScaledBitmap(pico, cellwidth - 10, cellhigh - 10, false);
            for (int i = 0; i < 5; i++)
            {
                for (int k = 0; k < 5; k++)
                {
                    arr[i][k] = new Cell(k * cellwidth, i * cellhigh, cellwidth, picx, pico);
                }
            }
            firsttime = false;
        }

        for (int i = 0; i < 5; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                arr[i][k].draw(canvas);
            }
        }


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        int i =(int)y/cellwidth;
        int k = (int)x/cellhigh;
        if (i<5 && k<5)
        {
            if (arr[i][k].IsEmpty())
            {
                setNewValOnBord(i,k);
                if (game.isWin(arr)==1)
                {
                    Toast.makeText(this.getContext(), "o win", Toast.LENGTH_SHORT).show();
                    return true;
                }

                if (game.isWin(arr)==0)
                {
                    Toast.makeText(this.getContext(), "x win", Toast.LENGTH_SHORT).show();
                    return true;

                }
            }
                else {
                Toast.makeText(this.getContext(), "not empty", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this.getContext(), "outside board", Toast.LENGTH_SHORT).show();}
        return false;

   }

    private void setNewValOnBord(int i, int k) {
        if (arr[i][k].setval(count)==true)
            count=1-count;

        invalidate(); // מוחקת הכול ומציירת מחדש
    }

    public Cell[][] getarr(){
        return arr;
    }

    public void setNewValOnBoard(int row, int col) {

    }
}
