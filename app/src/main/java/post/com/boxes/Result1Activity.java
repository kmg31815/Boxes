package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        float boxes = getIntent().getFloatExtra("boxes" , 0);
        TextView result1 = findViewById(R.id.ed_result1);
        result1.setText("Box3"+"Dimention: 23 / 14 / 13 cm"+"Price: 65");
    }
}
