package com.powerflee.bplpowerscore.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.powerflee.bplpowerscore.R;
import com.powerflee.bplpowerscore.model.MyTeam;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

        private Context mContext ;
        private List<MyTeam> mData ;



    public RecyclerViewAdapter(Context mContext, List<MyTeam> mData) {
            this.mContext = mContext;
            this.mData = mData;

        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view ;
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.layout_listitem,parent,false) ;
            final MyViewHolder viewHolder = new MyViewHolder(view) ;
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.id.setText(mData.get(position).getId()+"");
            holder.t1_name.setText(mData.get(position).getT1());
            holder.t2_name.setText(mData.get(position).getT2());

        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder {

            TextView id ;
            TextView t1_name ;
            TextView t2_name ;
            public MyViewHolder(View itemView) {

                super(itemView);
                id = itemView.findViewById(R.id.textView_id);
                t1_name = itemView.findViewById(R.id.textView_t1);
                t2_name = itemView.findViewById(R.id.textView_t2);


            }
        }
}