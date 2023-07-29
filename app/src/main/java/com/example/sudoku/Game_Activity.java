package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Game_Activity extends AppCompatActivity {

    Button b[] = new Button[9];
    TextView txt1;
    ArrayList<Integer> list = new ArrayList<>();
    int cnt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        txt1=findViewById(R.id.txt1);

        for (int i = 0; i < b.length; i++)
        {
            int id = getResources().getIdentifier("b"+i,"id",getPackageName());
            b[i] = findViewById(id);
        }

        b[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[1].getText().equals(""))
                {
                    b[1].setText(b[0].getText());
                    b[0].setText("");
                }
                if(b[3].getText().equals(""))
                {
                    b[3].setText(b[0].getText());
                    b[0].setText("");
                }
            }
        });
        b[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[0].getText().equals(""))
                {
                    b[0].setText(b[1].getText());
                    b[1].setText("");
                }
                if(b[2].getText().equals(""))
                {
                    b[2].setText(b[1].getText());
                    b[1].setText("");
                }
                if(b[4].getText().equals(""))
                {
                    b[4].setText(b[1].getText());
                    b[1].setText("");
                }
            }
        });
        b[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[1].getText().equals(""))
                {
                    b[1].setText(b[2].getText());
                    b[2].setText("");
                }
                if(b[5].getText().equals(""))
                {
                    b[5].setText(b[2].getText());
                    b[2].setText("");
                }

            }
        });
        b[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[0].getText().equals(""))
                {
                    b[0].setText(b[3].getText());
                    b[3].setText("");
                }
                if(b[4].getText().equals(""))
                {
                    b[4].setText(b[3].getText());
                    b[3].setText("");
                }
                if(b[6].getText().equals(""))
                {
                    b[6].setText(b[3].getText());
                    b[3].setText("");
                }
            }
        });
        b[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[1].getText().equals(""))
                {
                    b[1].setText(b[4].getText());
                    b[4].setText("");
                }
                if(b[3].getText().equals(""))
                {
                    b[3].setText(b[4].getText());
                    b[4].setText("");
                }
                if(b[5].getText().equals(""))
                {
                    b[5].setText(b[4].getText());
                    b[4].setText("");
                }
                if(b[7].getText().equals(""))
                {
                    b[7].setText(b[4].getText());
                    b[4].setText("");
                }
            }
        });
        b[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[2].getText().equals(""))
                {
                    b[2].setText(b[5].getText());
                    b[5].setText("");
                }
                if(b[4].getText().equals(""))
                {
                    b[4].setText(b[5].getText());
                    b[5].setText("");
                }
                if(b[8].getText().equals(""))
                {
                    b[8].setText(b[5].getText());
                    b[5].setText("");
                }
            }
        });
        b[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[3].getText().equals(""))
                {
                    b[3].setText(b[6].getText());
                    b[6].setText("");
                }
                if(b[7].getText().equals(""))
                {
                    b[7].setText(b[6].getText());
                    b[6].setText("");
                }
            }
        });
        b[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[4].getText().equals(""))
                {
                    b[4].setText(b[7].getText());
                    b[7].setText("");
                }
                if(b[6].getText().equals(""))
                {
                    b[6].setText(b[7].getText());
                    b[7].setText("");
                }
                if(b[8].getText().equals(""))
                {
                    b[8].setText(b[7].getText());
                    b[7].setText("");
                }
            }
        });
        b[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b[5].getText().equals(""))
                {
                    b[5].setText(b[8].getText());
                    b[8].setText("");
                }
                if(b[7].getText().equals(""))
                {
                    b[7].setText(b[8].getText());
                    b[8].setText("");
                }
            }
        });
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b[0].setEnabled(true);
                b[1].setEnabled(true);
                b[2].setEnabled(true);
                b[3].setEnabled(true);
                b[4].setEnabled(true);
                b[5].setEnabled(true);
                b[6].setEnabled(true);
                b[7].setEnabled(true);
                b[8].setEnabled(true);

                cnt=0;
                list.clear();
                for (int i = 0; i < b.length; i++)
                {
                    if(cnt < 9)
                    {
                        while (true)
                        {
                            int max = 10,min = 1;
                            int r = new Random().nextInt(max-min) + min;
                            if(list.isEmpty())
                            {
                                list.add(r);
                                cnt++;
                            }
                            if(!list.contains(r))
                            {
                                list.add(r);
                                cnt++;
                                break;
                            }
                        }
                    }
                }
                for (int i = 0; i < list.size(); i++)
                {
                    System.out.println("List"+list.get(i));
                    b[i].setText(""+list.get(i));
                    if(list.get(i)==9)
                    {
                        b[i].setText("");
                    }

                }

            }
        });
    }
}