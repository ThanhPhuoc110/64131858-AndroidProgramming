package thigk.nguyenthanhphuoc;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class MH3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mh3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listView = findViewById(R.id.ListV);
        ArrayList<String> nguondulieu = new ArrayList<String>();
        nguondulieu.add("Tiến về Sài Gòn");
        nguondulieu.add("Giải phóng miền Nam");
        nguondulieu.add("Đất nước trọn niềm vui");
        nguondulieu.add("Bài ca thống nhất");
        nguondulieu.add("Cơn mưa nga ấy");
        nguondulieu.add("Mùa Xuân trên thành phố HỒ CHí MInh");
        ListView lv = (ListView) findViewById(R.id.ListV);
        ArrayAdapter<String> baihat = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nguondulieu);
// nap du leiu vao
        lv.setAdapter(baihat);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = baihat.getItem(position);
                Toast.makeText(MH3.this, "Bạn đã chọn: " + value, Toast.LENGTH_SHORT).show();
            }
        });
//xu ly su kien


    }
}