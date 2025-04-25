package thigk.nguyenthanhphuoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutMH2;
    Button nutMH3;
    Button nutMH4;
    void TimDieuKhien(){
        nutMH2=(Button) findViewById(R.id.btn1);
        nutMH3=(Button) findViewById(R.id.btn2);
        nutMH4=(Button) findViewById(R.id.btn3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKhien();
        nutMH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MH2 = new Intent(MainActivity.this, MH2.class);
                startActivity(MH2);
            }
        });
        nutMH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MH3 = new Intent(MainActivity.this, thigk.nguyenthanhphuoc.MH3.class);
                startActivity(MH3);
            }
        });
        nutMH4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MH4 = new Intent(MainActivity.this, thigk.nguyenthanhphuoc.MH4.class);
                startActivity(MH4);
            }
        });
    }

}