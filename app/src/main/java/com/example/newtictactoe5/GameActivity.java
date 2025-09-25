package com.example.newtictactoe5;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    FBModule fbModule;
    Bord bord;
    GameModule gameModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       Bord board = new Bord(this);
        setContentView(board);

        fbModule=new FBModule(this);
        gameModule=new GameModule();
    }

    public void setPlayInGameActivity(Position position)
    {
        int row = position.getRow();
        int col = position.getCol();
        bord.setNewValOnBoard(row, col);
        if(gameModule.isWin(bord.getarr()) != 2)
            Toast.makeText(this, "win="+gameModule.isWin(bord.getarr()), Toast.LENGTH_SHORT).show();
    }

    public void setNewTouch(int row, int cal)
    {
        Position position=new Position(row,cal);
        fbModule.setPlayInFireBase(position);
    }
}