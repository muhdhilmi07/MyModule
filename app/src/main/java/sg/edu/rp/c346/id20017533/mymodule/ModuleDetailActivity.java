package sg.edu.rp.c346.id20017533.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer=findViewById(R.id.textView);
        btnback=findViewById(R.id.buttonBack);

        Intent intentReceived=getIntent();
        String  value=intentReceived.getStringExtra("C346");


        Intent intentReceived2=getIntent();
        String  value2=intentReceived.getStringExtra("C218");


        if(value!=null){
            tvAnswer.setText(value);
        }
        else if(value2!=null){
            tvAnswer.setText(value2);
        }

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



}