package com.example.irenachernyak.messingaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button first, second,third;
    private Button yesButton, noButton;
    private TextView responseView;
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (Button)findViewById(R.id.first_button);
        second = (Button)findViewById(R.id.second_button);
        third = (Button)findViewById(R.id.third_button);
        responseView = (TextView)findViewById(R.id.click_textview);

        yesButton = (Button)findViewById(R.id.yes_button);
        noButton = (Button)findViewById(R.id.no_button);
        nameEditText = (EditText)findViewById(R.id.name_edit_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onFirstButtonClicked(View view) {
        responseView.setText("1st button is clicked");
    }

    public void onSecondButtonClicked(View view) {
        responseView.setText("2nd button is clicked");
    }

    public void onThirdButtonClicked(View view) {
        responseView.setText("3rd button is clicked");
    }

    public void onYesButtonClicked(View view) {
        String name = String.valueOf(nameEditText.getText());
        String yourResponse = "That is great " + name;
        Toast.makeText(this, yourResponse, Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClicked(View view) {
        String name = String.valueOf(nameEditText.getText());
        String yourResponse = "That is sad " + name;
        Toast.makeText(this, yourResponse, Toast.LENGTH_SHORT).show();
    }
}
