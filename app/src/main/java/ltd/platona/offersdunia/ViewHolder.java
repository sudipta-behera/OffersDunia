package ltd.platona.offersdunia;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {
    View mView;

    TextView mTitleView;
    TextView mDetailTv;
    ImageView mImageTv;

    public ViewHolder(View itemView) {
        super(itemView);

        mView = itemView;
        mTitleView=mView.findViewById(R.id.rTitleTv);
        mDetailTv=mView.findViewById(R.id.rDescriptionTv);
        mImageTv=mView.findViewById(R.id.rImageView);
    }

    public void setDetails(Context ctx,String title,String description,String image){
        TextView mTitleView=mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv=mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageTv=mView.findViewById(R.id.rImageView);

        mTitleView.setText(title);
        mDetailTv.setText(description);
        Picasso.get().load(image).into(mImageTv);

    }

}