package de.authada.parentproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.authada.wrapper.Wrapper;

public class ParentActivity extends AppCompatActivity {

    Button setScore, getScore;
    EditText sentVal;
    TextView coreVal;
    Wrapper wrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        wrapper = new Wrapper(getApplicationContext());
        init();
        initListeners();
    }

    private void init() {
        setScore = findViewById(R.id.set_score);
        getScore = findViewById(R.id.get_score);
        sentVal = findViewById(R.id.value_sent);
        coreVal = findViewById(R.id.core_val);
    }

    private void initListeners() {
        setScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sentVal.getText()!= null) {
                    wrapper.setCoreScore(Integer.parseInt(sentVal.getText().toString()));
                    coreVal.setText("core set");
                }
            }
        });

        getScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = wrapper.getCoreScore();
                coreVal.setText("core score = "+score);
            }
        });
    }
}
