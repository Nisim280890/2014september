package com.example.linking;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        String str1 = getIntent().getStringExtra(MainActivity.STR_1);
        int age1 = getIntent().getIntExtra(MainActivity.AGE_1, 0);

        Toast.makeText(this, "str1: " + str1, Toast.LENGTH_LONG).show();
        Toast.makeText(this, Integer.toString(age1), Toast.LENGTH_LONG).show();;

        Bundle extras = getIntent().getExtras();
        Toast.makeText(this,extras.getString("str2"), Toast.LENGTH_LONG).show();
        Toast.makeText(this,Integer.toString(extras.getInt("age2")),Toast.LENGTH_LONG);

        Dog d = (Dog)extras.getSerializable("myDog");




    }

    public void btnReturn(View view){
        Intent intent = new Intent();
        intent.putExtra("age3", 68);
        setResult(RESULT_OK, intent);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
}
