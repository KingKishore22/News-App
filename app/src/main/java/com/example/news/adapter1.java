package com.example.news;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.news.R;
import com.example.news.headlines;
import com.squareup.picasso.Picasso;

import java.util.List;
public  class  adapter1 extends RecyclerView.Adapter<adapter1.ViewHolder>
{

Context context;
        List<headlines> head;

public adapter1(Context context, List<headlines> head) {
        this.context = context;
        this.head = head;
        }
@NonNull
@Override
public adapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.generals,null);
        return new ViewHolder(view);
        }
@Override
public void onBindViewHolder(@NonNull adapter1.ViewHolder holder, int position) {

        holder.tx1.setText(head.get(position).getTitle());
        holder.tx2.setText(head.get(position).getDescription());
        if(head.get(position).getUrlToImage()!=null)
        {
        Picasso.get().load(head.get(position).getUrlToImage()).into(holder.im1);
        }
        }
@Override
public int getItemCount() {
        return head.size();
        }
public class ViewHolder extends RecyclerView.ViewHolder {
    TextView tx1;
    TextView tx2;
    ImageView im1;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tx1=(TextView) itemView.findViewById(R.id.tx1);
        tx2=(TextView) itemView.findViewById(R.id.tx2);
        im1=(ImageView) itemView.findViewById(R.id.im1);
    }
}}