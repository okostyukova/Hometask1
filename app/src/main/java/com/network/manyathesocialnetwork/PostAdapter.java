package com.network.manyathesocialnetwork;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    @NonNull
    List<PostItem> data;

    public PostAdapter(@NonNull List<PostItem> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_post_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PostItem postItem = data.get(position);

        holder.userIdView.setText(String.valueOf(postItem.getUserId()));
        holder.titleView.setText(postItem.getTitle());
        holder.bodyView.setText(postItem.getBody());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView userIdView;
        TextView titleView;
        TextView bodyView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            userIdView = itemView.findViewById(R.id.userId);
            titleView = itemView.findViewById(R.id.title);
            bodyView = itemView.findViewById(R.id.body);
        }
    }
}