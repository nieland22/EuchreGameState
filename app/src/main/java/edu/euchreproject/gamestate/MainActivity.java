package edu.euchreproject.gamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting onClick for run test button
        Button run = (Button) findViewById(R.id.runTestButton);
        run.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                boolean isRoundComplete = false;
                EditText edit = (EditText)findViewById(R.id.editText);
                edit.getText().clear();
                //creating firstInstance
                GameState firstInstance = new GameState();
                //creating secondInstance
                GameState secondInstance = new GameState(firstInstance);
                //calling methods on firstInstance
                edit.append("***********FIRST INSTANCE (initial game state)*************\n");
                edit.append(firstInstance.toString());

                edit.append("***********SECOND INSTANCE (should change pass, turn, tricks, " +
                        "round over)*************\n");
                firstInstance.isPass(0);
                firstInstance.isGoingAlone(1);
                firstInstance.isRoundOver(firstInstance.trickNum);
                firstInstance.blueTrickScore = 2;
                firstInstance.redTrickScore = 0;
                firstInstance.trickNum = 2;
                edit.append(firstInstance.toString());

                edit.append("***********THIRD INSTANCE (should change pass, turn, tricks, " +
                        "round over)*************\n");
                firstInstance.isPass(0);
                firstInstance.isGoingAlone(1);
                firstInstance.isRoundOver(firstInstance.trickNum);
                firstInstance.blueTrickScore = 3;
                firstInstance.redTrickScore = 0;
                firstInstance.trickNum = 3;
                edit.append(firstInstance.toString());

                edit.append("***********FOURTH INSTANCE (should change pass, turn, tricks, " +
                        "round over)*************\n");
                firstInstance.isPass(0);
                firstInstance.isGoingAlone(1);
                firstInstance.blueTrickScore = 5;
                firstInstance.redTrickScore = 0;
                firstInstance.trickNum = 5;
                firstInstance.isRoundOver(firstInstance.trickNum);
                edit.append(firstInstance.toString());

                //creating thirdInstance
                GameState thirdInstance = new GameState();
                //creating fourthInstance
                GameState fourthInstance = new GameState(thirdInstance);








            }
        });
    }
}
