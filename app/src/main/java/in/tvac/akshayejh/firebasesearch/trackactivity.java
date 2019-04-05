package in.tvac.akshayejh.firebasesearch;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class trackactivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef ;
    private String currentUserId ;
    private FirebaseAuth mAuth;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackactivity);





        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mAuth = FirebaseAuth.getInstance();

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("Name");
        mRef = FirebaseDatabase.getInstance().getReference().child("Users").child(message).child("tracks") ;













    }
    @Override
    protected void onStart() {
            super.onStart();
            FirebaseRecyclerAdapter<person, ViewHolder> firebaseRecyclerAdapter = new
                    FirebaseRecyclerAdapter<person, ViewHolder>(
                            person.class,
                            R.layout.row,
                            ViewHolder.class,
                            mRef) {
                        @Override
                        protected void populateViewHolder(ViewHolder viewHolder, person model, int position) {
                            viewHolder.setDetails(getApplicationContext(), model.getFirst_seen(), model.getLast_seen(), model.getImage(),model.getId());
                            final String imageUrl = model.getImage().toString() ;

                            viewHolder.mView.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent i = new Intent(trackactivity.this,openimage
                                            .class) ;
                                    i.putExtra("Url",imageUrl);


                                    startActivity(i);
                                }
                            });
                        }
                    };
            mRecyclerView.setAdapter(firebaseRecyclerAdapter);
        }



}
