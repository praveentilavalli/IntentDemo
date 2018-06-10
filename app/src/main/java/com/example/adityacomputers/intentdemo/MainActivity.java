package com.example.adityacomputers.intentdemo;

import android.app.SearchManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText searchET;
    Button searchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchET=(EditText)findViewById(R.id.searchET);
        searchBtn=(Button)findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchText=searchET.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q="+searchText));
                /*Intent i=new Intent(Intent.ACTION_WEB_SEARCH);
                i.putExtra(SearchManager.QUERY,searchText);*/
                startActivity(i);
            }
        });

    }
}
