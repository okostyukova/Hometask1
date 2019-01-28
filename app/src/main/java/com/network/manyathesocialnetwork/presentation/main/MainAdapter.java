package com.network.manyathesocialnetwork.presentation.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.List;

import javax.inject.Inject;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<Post> posts;
    private View.OnClickListener listener;


    @Inject
    MainAdapter(List<Post> data, View.OnClickListener listener) {
        this.posts = data;
        this.listener = listener;
    }

    public void loadPosts(List<Post> posts) {
        this.posts.addAll(posts);
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MainAdapter.ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_post_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        Post post = posts.get(position);

        holder.userIdView.setText(String.valueOf(post.getUserId()));
        holder.titleView.setText(post.getTitle());
        holder.bodyView.setText(post.getBody());
        holder.itemView.setOnClickListener(listener);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView userIdView;
        TextView titleView;
        TextView bodyView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            userIdView = itemView.findViewById(R.id.userId);
            titleView = itemView.findViewById(R.id.title);
            bodyView = itemView.findViewById(R.id.postBody);
        }
    }
}
