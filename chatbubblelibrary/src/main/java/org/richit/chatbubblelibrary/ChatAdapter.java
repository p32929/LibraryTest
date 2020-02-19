package org.richit.chatbubblelibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    Context context;
    ArrayList<Chat> chats = new ArrayList<>();

    public ChatAdapter(Context context, ArrayList<Chat> chats) {
        this.context = context;
        this.chats = chats;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.chat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chat chat = chats.get(position);

        holder.textViewName.setText("" + chat.getName());
        holder.textViewMessage.setText("" + chat.getText());
        if (chats.get(0).getName().equals(chat.getName())) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(32, 0, 0, 0);
            holder.linearLayoutParent.setLayoutParams(params);
        } else {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(0, 0, 32, 0);
            holder.linearLayoutParent.setLayoutParams(params);
        }

    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewMessage;
        LinearLayout linearLayoutParent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayoutParent = itemView.findViewById(R.id.parentLL);
            textViewName = itemView.findViewById(R.id.nameTv);
            textViewMessage = itemView.findViewById(R.id.messageTv);
        }
    }
}
