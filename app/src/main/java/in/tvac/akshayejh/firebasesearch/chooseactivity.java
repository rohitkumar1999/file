package in.tvac.akshayejh.firebasesearch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseactivity extends AppCompatActivity {

    Button btnUploadImage,btnTrackPerson ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseactivity);

        btnTrackPerson=findViewById(R.id.button2);
        btnUploadImage=findViewById(R.id.button3);

        btnTrackPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(chooseactivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        btnUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i =new Intent(chooseactivity.this,deleteactivity.class);
                startActivity(i);

            }
        });
    }
}
