package sg.edu.rp.c346.id20017533.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvClickModule1;
    TextView tvClickModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvClickModule1=findViewById(R.id.textView1);
        tvClickModule2=findViewById(R.id.textView2);

        tvClickModule1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class );
                intent.putExtra("C346","ModuleCode: C346 \n ModuleName: Android Programming\n AcademicYear: 2021\n Semester: 1\n ModuleCredit: 4\n Venue:E62E");
                startActivity(intent);
            }
        });

        tvClickModule2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class );
                intent.putExtra("C218","ModuleCode: C218 \n ModuleName: UI/UX Design for Apps\n AcademicYear: 2021\n Semester: 1\n ModuleCredit: 4\n Venue:W64G");
                startActivity(intent);
            }
        });

    }
}