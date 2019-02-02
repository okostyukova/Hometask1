package com.network.manyathesocialnetwork.presentation.comment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Comment;
import com.network.manyathesocialnetwork.domain.entity.Post;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {

    private Post post;
    private List<Comment> comments = new ArrayList<>();

    @Inject
    CommentAdapter(Post post) {
        this.post = post;
    }

    public void loadComments(List<Comment> comments) {
        this.comments.addAll(comments);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_comment_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Comment comment = comments.get(position);

        holder.numberIdView.setText(String.valueOf(comment.getId()));
        holder.nameView.setText(comment.getName());
        holder.bodyView.setText(comment.getBody());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView numberIdView;
        TextView nameView;
        TextView bodyView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            numberIdView = itemView.findViewById(R.id.numberId);
            nameView = itemView.findViewById(R.id.title);
            bodyView = itemView.findViewById(R.id.body);
        }
    }
}