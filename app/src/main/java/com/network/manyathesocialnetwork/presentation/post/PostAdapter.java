package com.network.manyathesocialnetwork.presentation.post;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.network.manyathesocialnetwork.R;
import com.network.manyathesocialnetwork.domain.entity.Comment;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    private List<Comment> comments;
    private View.OnClickListener listener;


    public void setComments(List<Comment> data, View.OnClickListener listener) {
        this.comments = data;
        this.listener = listener;
        //notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_comment_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Comment comment = comments.get(position);

        holder.postIdView.setText(String.valueOf(comment.getPostId()));
        holder.numberIdView.setText(String.valueOf(comment.getId()));
        holder.nameView.setText(comment.getName());
        holder.bodyView.setText(comment.getBody());
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView postIdView;
        TextView numberIdView;
        TextView nameView;
        TextView bodyView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            postIdView = itemView.findViewById(R.id.postId);
            numberIdView = itemView.findViewById(R.id.numberId);
            nameView = itemView.findViewById(R.id.name);
            bodyView = itemView.findViewById(R.id.postBody);
        }
    }
}