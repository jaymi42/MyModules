package sg.edu.rp.c346.id22036150.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCred;
    TextView tvVenue;

    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSem = findViewById(R.id.tvSem);
        tvCred = findViewById(R.id.tvCred);
        tvVenue = findViewById(R.id.tvVenue);
        btnReset = findViewById(R.id.btnReset);

        Intent intentSelected = getIntent();

        String modCode = getIntent().getStringExtra("ModCode");
        tvCode.setText("Module Code: " + modCode);

        String modName = getIntent().getStringExtra("ModName");
        tvName.setText("Module Name: " + modName);

        String modYear = getIntent().getStringExtra("ModYear");
        tvYear.setText("Module Year: " + modYear);

        String modSem = getIntent().getStringExtra("ModSem");
        tvSem.setText("Module Semester: " + modSem);

        String modCred = getIntent().getStringExtra("ModCred");
        tvCred.setText("Module Credit: " + modCred);

        String modVenue = getIntent().getStringExtra("ModVenue");
        tvVenue.setText("Module Venue: " + modVenue);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                finish();
            }
        });


    }
}