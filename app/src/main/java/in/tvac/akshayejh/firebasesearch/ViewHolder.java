package in.tvac.akshayejh.firebasesearch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public  class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

    }


    public void setDetails(Context ctx, String Firstseen, String lastseen, String image,String id){


        TextView last_seen = mView.findViewById(R.id.last_seen);
        TextView user_first =  mView.findViewById(R.id.first_seen);

        ImageView user_image =  mView.findViewById(R.id.image);





        user_first.setText("FirstSeen :"+Firstseen
        );
        last_seen.setText("LastSeen : " +lastseen);


        Glide.with(ctx).load(image).into(user_image);


    }




}
