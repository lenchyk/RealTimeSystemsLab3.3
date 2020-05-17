package genetic.algo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    public TextView result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.result_activity);

        result = (TextView) findViewById(R.id.result);


    }


}