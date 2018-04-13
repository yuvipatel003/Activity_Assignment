package yuvraj.activity_assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity extends AppCompatActivity {
    public static final int APP_ACTIVITY_ID = 1818;

    // if(key) for the text value to be passed from result activity and this one
    public static final String TEXT_KEY = "";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);
        button = findViewById(R.id.button);

        button.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, NameActivity.class);
            startActivityForResult(intent,APP_ACTIVITY_ID);
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==APP_ACTIVITY_ID)
        {
            //was called from our activity
            if(resultCode==RESULT_OK)
            {
                // Callback Activity defined as success the value

                String textValue= data.getStringExtra(TEXT_KEY);
                button.setText(textValue);
            }
        }
    }
}
