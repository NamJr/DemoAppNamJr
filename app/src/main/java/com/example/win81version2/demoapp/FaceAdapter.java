package com.example.win81version2.demoapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Win ic_8.ic_1 Version ic_2 on ic_8/ic_11/2017.
 */

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.ViewHolder>{

    private Context context;
    private List<Face> listFace;
    private LayoutInflater inflater;

    public FaceAdapter() {
    }

    public FaceAdapter(Context context, List<Face> listFace ) {
        this.context = context;
        this.listFace = listFace;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // tạo ra vewHolder
        // parent = Recycler
        // false: k đính trực tiếp đc lên view
        View view = inflater.inflate(R.layout.item_face, parent, false);
        return (new ViewHolder(view));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Face face = listFace.get(position);
        holder.img.setImageResource(face.getIdImage());
        holder.txt.setText(face.getNameImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                if( position < 0 )  return;
                listFace.remove(position);
                Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
                notifyItemRemoved(position);
            }
        });
    }

    @Override
    public int getItemCount() {

        return listFace.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            txt = itemView.findViewById(R.id.textView);
        }
    }
}
