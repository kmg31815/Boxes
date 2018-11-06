package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boxes(View view){
        Log.d("Mainactivity" , "boxes");
        EditText edLength = findViewById(R.id.ed_length);
        EditText edWidth = findViewById(R.id.ed_width);
        EditText edHeight = findViewById(R.id.ed_length);
        String l = edLength.getText().toString();
        String w = edWidth.getText().toString();
        String h = edHeight.getText().toString();
        Log.d("Mainactivity" , l + "/" + w + "/" + h);
        float length = Float.parseFloat(l);
        float width = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        String boxes = "";
        Log.d("MainActivity" ,boxes +"");
        if(length <= 23){
            if (width <= 14){
                if (height <= 13){
                    Intent intent = new Intent(this, Result1Activity.class);
                    intent.putExtra("Boxes",boxes);
                    startActivity(intent);
                }
            }
        }else if (length <= 39.5){
            if (width <= 27.5){
                if (height <= 23){
                    Intent intent = new Intent(this, Result2Activity.class);
                    intent.putExtra("Boxes" , boxes);
                    startActivity(intent);
                }
            }
        }

    }
}
