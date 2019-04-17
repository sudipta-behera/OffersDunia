package ltd.platona.offersdunia;


import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

public class CouponAdapter extends FirebaseRecyclerAdapter<Model, ViewHolder> {
    private CouponClickListener listener;

    public CouponAdapter(Class<Model> modelClass, int modelLayout, Class<ViewHolder> viewHolderClass, Query ref) {
        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    public void setListener(CouponClickListener listener){
        this.listener = listener;
    }

    @Override
    protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {
        viewHolder.mTitleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null){
                    listener.onCouponClicked();
                }
            }
        });
    }




    public interface CouponClickListener{
        void onCouponClicked();
    }
}
