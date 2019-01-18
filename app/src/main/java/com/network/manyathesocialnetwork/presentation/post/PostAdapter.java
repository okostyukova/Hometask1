package com.network.manyathesocialnetwork.presentation.post;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Post> data;

    public PostAdapter(List<Post> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_post_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = data.get(position);

        holder.userIdView.setText(String.valueOf(post.getUserId()));
        holder.titleView.setText(post.getTitle());
        holder.bodyView.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    void addPost(Post newPost) {
        data.add(newPost);
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