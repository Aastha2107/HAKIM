package com.aasthajain.hakim;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatAdapterViewHolder>{

        List<Chat> chatList;

public ChatAdapter(List<Chat> chatList) {
        this.chatList = chatList;
        }

@NonNull
@Override
public ChatAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chatlayout,null);
        ChatAdapterViewHolder chatAdapterViewHolder = new ChatAdapterViewHolder(view);
        return chatAdapterViewHolder;

        }

@Override
public void onBindViewHolder(@NonNull ChatAdapterViewHolder holder, int i) {

        holder.textView.setText(chatList.get(i).getName());
        holder.imageView.setImageResource(R.mipmap.ic_launcher);

        }

@Override
public int getItemCount() {
        return chatList.size();
        }




public static class ChatAdapterViewHolder extends RecyclerView.ViewHolder{

    TextView textView;
    ImageView imageView;

    public ChatAdapterViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textRecycler);
        imageView = itemView.findViewById(R.id.imageRecycler);

    }
}

}
