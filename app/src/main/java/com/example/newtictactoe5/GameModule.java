package com.example.newtictactoe5;

public class GameModule {
    //public static int xwin=0;
    //public static int owin=1;

    public int isWin(Cell [][] arr)
    {
        // 0=x win
        // 1=o win
        // 2 = no win
       // return 2;

        //x עמודות
        for (int i = 0; i < 2; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                if (arr[i][k].getval()==0 &&
                    arr[i+1][k].getval()==0 &&
                    arr[i+2][k].getval()==0 &&
                    arr[i+3][k].getval()==0)
                    return 0;
                if (arr[i][k].getval()==1 &&
                        arr[i+1][k].getval()==1 &&
                        arr[i+2][k].getval()==1 &&
                        arr[i+3][k].getval()==1)
                    return 1;
            }
        }
        //x שורות
        for (int i = 0; i < 5; i++)
        {
            for (int k = 0; k < 2; k++)
            {
                if (arr[i][k].getval()==0 &&
                        arr[i][k+1].getval()==0 &&
                        arr[i][k+2].getval()==0 &&
                        arr[i][k+3].getval()==0)
                    return 0;
            }
        }
        //x אלכסון ראשי
        for (int i = 0; i < 2; i++)
        {
            for (int k = 0; k < 2; k++)
            {
                if (arr[i][k].getval()==0 &&
                        arr[i+1][k+1].getval()==0 &&
                        arr[i+2][k+2].getval()==0 &&
                        arr[i+3][k+3].getval()==0)
                    return 0;
            }
        }
        //x אלכסון ראשי 2
        for (int i = 0; i < 2; i++) {
            for (int k = 4; k >= 3; k--) {
                if (    arr[i][k].getval() == 0 &&
                        arr[i + 1][k - 1].getval() == 0 &&
                        arr[i + 2][k - 2].getval() == 0 &&
                        arr[i + 3][k - 3].getval() == 0)
                    return 0;
            }
        }

        //x אלכסון משני work
         int i = 0, k=4;
            if (    arr[i+1][k].getval()==0 &&
                        arr[i+2][k-1].getval()==0 &&
                        arr[i+3][k-2].getval()==0 &&
                        arr[i+4][k-3].getval()==0)
                    return 0;

        //x אלכסון משני
        if (    arr[i][k-1].getval()==0 &&
                arr[i+1][k-2].getval()==0 &&
                arr[i+2][k-3].getval()==0 &&
                arr[i+3][k-4].getval()==0)
            return 0;


        //x אלכסון משני 2
        if (    arr[i+1][k-4].getval()==0 &&
                arr[i+2][k-3].getval()==0 &&
                arr[i+3][k-2].getval()==0 &&
                arr[i+4][k-1].getval()==0)
            return 0;

        //x אלכסון משני 2
        if (    arr[i][k-3].getval()==0 &&
                arr[i+1][k-2].getval()==0 &&
                arr[i+2][k-1].getval()==0 &&
                arr[i+3][k].getval()==0)
            return 0;




        // o

        //o עמודות

   
        //o שורות
        for (i = 0; i < 5; i++)
        {
            for (k = 0; k < 2; k++)
            {
                if (arr[i][k].getval()==1 &&
                        arr[i][k+1].getval()==1 &&
                        arr[i][k+2].getval()==1 &&
                        arr[i][k+3].getval()==1)
                    return 1;
            }
        }
        //o אלכסון ראשי
        for (i = 0; i < 2; i++)
        {
            for (k = 0; k < 2; k++)
            {
                if (arr[i][k].getval()==1 &&
                        arr[i+1][k+1].getval()==1 &&
                        arr[i+2][k+2].getval()==1 &&
                        arr[i+3][k+3].getval()==1)
                    return 1;
            }
        }
        //o אלכסון ראשי 2
        for (i = 0; i < 2; i++) {
            for (k = 4; k >= 3; k--) {
                if (    arr[i][k].getval() == 1 &&
                        arr[i + 1][k - 1].getval() == 1 &&
                        arr[i + 2][k - 2].getval() == 1 &&
                        arr[i + 3][k - 3].getval() == 1)
                    return 1;
            }
        }

        //o אלכסון משני
        i = 0; k=4;
        if (    arr[i+1][k].getval()==1 &&
                arr[i+2][k-1].getval()==1 &&
                arr[i+3][k-2].getval()==1 &&
                arr[i+4][k-3].getval()==1)
            return 1;

        //o אלכסון משני
        if (    arr[i][k-1].getval()==1 &&
                arr[i+1][k-2].getval()==1 &&
                arr[i+2][k-3].getval()==1 &&
                arr[i+3][k-4].getval()==1)
            return 1;


        //o אלכסון משני 2
        if (    arr[i+1][k-4].getval()==1 &&
                arr[i+2][k-3].getval()==1 &&
                arr[i+3][k-2].getval()==1 &&
                arr[i+4][k-1].getval()==1)
            return 1;

        //o אלכסון משני 2
        if (    arr[i][k-3].getval()==1 &&
                arr[i+1][k-2].getval()==1 &&
                arr[i+2][k-1].getval()==1 &&
                arr[i+3][k].getval()==1)
            return 1;



















        return 2;
    }

}
