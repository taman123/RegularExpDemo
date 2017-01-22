package demo.taman.blog.daggertutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import dagger.taman.blog.daggertutorial.R;
import validator.regularexpression.type.widgets.FormEditText;

public class MainActivity extends AppCompatActivity {

    Button validate_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validate_btn= (Button) findViewById(R.id.validate_btn);
        final FormEditText fdt = (FormEditText) findViewById(R.id.et);
        validate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fdt.testValidity()){
                    Toast.makeText(MainActivity.this, "Valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }

}
