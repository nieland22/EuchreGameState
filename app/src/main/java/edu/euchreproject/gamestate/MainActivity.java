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
                EditText edit = (EditText)findViewById(R.id.editText);
                //edit.setText(GameState.toString());

            }
        });
    }
}
