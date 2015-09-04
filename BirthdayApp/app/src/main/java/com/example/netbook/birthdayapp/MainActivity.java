package com.example.netbook.birthdayapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button onOkButtonClick;
    private EditText user_date_edit_text;
    private EditText user_name_edit_text;
    private TextView rating_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onOkButtonClick = (Button) findViewById(R.id.ok_button);
        user_date_edit_text = (EditText) findViewById(R.id.editText);
        user_name_edit_text = (EditText) findViewById(R.id.editTextName);
        rating_text = (TextView) findViewById(R.id.textView);


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

    public void onOkButtonClick(View view) {

        String user_date = String.valueOf(user_date_edit_text.getText());
        String user_name = String.valueOf(user_name_edit_text.getText());
        String date_response = "Thank you, " + user_name + ". " + user_date + " is a great date to be born!";
        Toast.makeText(this, date_response, Toast.LENGTH_LONG).show();

    }

    public void unfriendlyButtonClick(View view) {
        String user_date = String.valueOf(user_date_edit_text.getText());
        String user_name = String.valueOf(user_name_edit_text.getText());
        String date_response = "Oh great, some wiseguy called " + user_name + ". " + user_date + " is a really shitty date to be born. I can't stand you.";
        Toast.makeText(this, date_response, Toast.LENGTH_LONG).show();

    }

    public void onRatingClick(View view) {
        findViewById(R.id.textView);
                rating_text.setText("Thanks for rating!");
    }
}
