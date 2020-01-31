package com.example.chatapp;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context ncontext;
    List<Person> ndata;
    Dialog mydialog;

    public RecyclerViewAdapter(Context ncontext, List<Person> ndata) {
        this.ncontext = ncontext;
        this.ndata = ndata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(ncontext).inflate(R.layout.itemcontact, parent, false);
        MyViewHolder vholder = new MyViewHolder(v);
        mydialog = new Dialog(ncontext);
        mydialog.setContentView(R.layout.dailog_contct);
        ImageView m = (ImageView) mydialog.findViewById(R.id.contactImage);
        m.setImageResource(ndata.get(vholder.getAdapterPosition()).getImg());
        vholder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialog.show();
            }
        });

        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvname.setText(ndata.get(position).getName());
        holder.tvmessage.setText(ndata.get(position).getMessage());
        holder.img.setImageResource(ndata.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return ndata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvname;
        private TextView tvmessage;
        private CircleImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname = (TextView) itemView.findViewById(R.id.itmname);
            tvmessage = (TextView) itemView.findViewById(R.id.message);
            img = (CircleImageView) itemView.findViewById(R.id.shadodw);

        }
    }
}
