package com.network.manyathesocialnetwork.presentation.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<Post> posts = new ArrayList<>();
    private OnItemClickListener listener;

    @Inject
    MainAdapter(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void loadPosts(List<Post> posts) {
        this.posts.addAll(posts);
        notifyDataSetChanged();
    }

    public void loadPost(Post post) {
        this.posts.add(post);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_post_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Post post = posts.get(position);

        holder.userIdView.setText(String.valueOf(post.getUserId()));
        holder.titleView.setText(post.getTitle());
        holder.bodyView.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public interface OnItemClickListener {
        void onItemClick(Post post);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView userIdView;
        TextView titleView;
        TextView bodyView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View view) {
                    int pos = getLayoutPosition();
                    if (listener != null)
                        listener.onItemClick(posts.get(pos));
                }
            });

            userIdView = itemView.findViewById(R.id.userId);
            titleView = itemView.findViewById(R.id.title);
            bodyView = itemView.findViewById(R.id.postBody);
        }
    }
}
