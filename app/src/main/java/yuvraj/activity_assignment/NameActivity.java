package yuvraj.activity_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by yuvi0 on 2018-02-13.
 */

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent=new Intent();
        //pass back the updated text value ,
        //so AppActivity is going to read it from the extras

        intent.putExtra(AppActivity.TEXT_KEY,"Welcome from NameActivity");

        setResult(RESULT_OK,intent);

        Button b = findViewById(R.id.button);

        // Mark itself for destruction
        finish();
    }
}