package com.example.compteurfruits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button compter;
    private TextView nbPomme;
    private TextView nbPoire;
    private RadioButton pomme;
    private RadioButton poire;
    private int compteurPomme=0;
    private int compteurPoire=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compter=(Button) findViewById(R.id.compter);
        nbPomme=(TextView) findViewById(R.id.nbPomme);
        nbPoire=(TextView) findViewById(R.id.nbPoire);
        pomme=(RadioButton) findViewById(R.id.radioPomme);
        poire=(RadioButton) findViewById(R.id.radioPoire);
        compter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pomme.isChecked()){
                    compteurPomme++;
                    nbPomme.setText(String.valueOf(compteurPomme));
                }
                else if(poire.isChecked()){
                    compteurPoire++;
                     nbPoire.setText(String.valueOf(compteurPoire));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tp3,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuPommes:
                Toast.makeText(this,String.valueOf(compteurPomme),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuPoires:
                Toast.makeText(this,String.valueOf(compteurPoire),Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuQuitter:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
