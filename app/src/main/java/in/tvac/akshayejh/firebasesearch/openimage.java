package in.tvac.akshayejh.firebasesearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class openimage extends AppCompatActivity {

    ImageView imageView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openimage);
        imageView = findViewById(R.id.openimage) ;

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("Url");

        Glide.with(getApplicationContext()).load(message).into(imageView);



    }
}
