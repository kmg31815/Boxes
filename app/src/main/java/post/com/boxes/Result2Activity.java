package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        float boxes = getIntent().getFloatExtra("boxes" , 0);
        TextView result1 = findViewById(R.id.ed_result2);
        result1.setText("Box5"+"Dimention: 39.5 / 27.5 / 23 cm"+"Price: 90");
    }
}
