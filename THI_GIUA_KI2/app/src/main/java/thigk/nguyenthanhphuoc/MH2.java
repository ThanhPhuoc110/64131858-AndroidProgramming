package thigk.nguyenthanhphuoc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MH2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mh2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText nhapThang = findViewById(R.id.edt1);
        EditText nhapNam = findViewById(R.id.edt2);
        Button btnKT = findViewById(R.id.btn_kt);
        TextView KQ= findViewById(R.id.Kq);
        btnKT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nam = nhapNam.getText().toString();
                String Thang = nhapThang.getText().toString();
                int month = Integer.parseInt(Thang);
                int year = Integer.parseInt(Nam);
                if (month == 4 && year == 1975) {
                    KQ.setText("Chính xác! ");
                } else {
                    KQ.setText("Sai rồi! Hãy thử lại.");
                }
            }

        });
    }
}