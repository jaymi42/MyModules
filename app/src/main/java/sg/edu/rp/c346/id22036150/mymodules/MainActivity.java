package sg.edu.rp.c346.id22036150.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC203;
    TextView tvC235;
    TextView tvC206;
    TextView tvC218;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.tvC346);
        tvC203 = findViewById(R.id.tvC203);
        tvC235 = findViewById(R.id.tvC235);
        tvC206 = findViewById(R.id.tvC206);
        tvC218 = findViewById(R.id.tvC218);
        tvG953 = findViewById(R.id.tvG953);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModCode", "C346");
                intent.putExtra("ModName", "Android Programming");
                intent.putExtra("ModYear", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "E63A");
                startActivity(intent);


            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModCode", "C203");
                intent.putExtra("ModName", "Web Appln Development in php");
                intent.putExtra("ModYear", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "W64P");
                startActivity(intent);


            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModCode", "C235");
                intent.putExtra("ModName", "IT Security and Management");
                intent.putExtra("ModYear", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "3");
                intent.putExtra("ModVenue", "W64P");
                startActivity(intent);


            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModCode", "C206");
                intent.putExtra("ModName", "Software Development Process");
                intent.putExtra("ModYear", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "3");
                intent.putExtra("ModVenue", "W64P");
                startActivity(intent);


            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModCode", "C346");
                intent.putExtra("ModName", "UI/UX Design for Apps");
                intent.putExtra("ModYear", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "4");
                intent.putExtra("ModVenue", "W64P");
                startActivity(intent);


            }
        });

        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModCode", "G953");
                intent.putExtra("ModName", "Life Skills III");
                intent.putExtra("ModYear", "2023");
                intent.putExtra("ModSem", "1");
                intent.putExtra("ModCred", "3");
                intent.putExtra("ModVenue", "HB02");
                startActivity(intent);


            }
        });
    }
}