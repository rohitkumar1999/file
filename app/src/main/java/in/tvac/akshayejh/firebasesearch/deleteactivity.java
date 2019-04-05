package in.tvac.akshayejh.firebasesearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class deleteactivity extends AppCompatActivity {

    private DatabaseReference mFirebaseDatabse ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleteactivity);

        mFirebaseDatabse = FirebaseDatabase.getInstance().getReference("Users");



    }
}
