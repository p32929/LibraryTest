package org.richit.librarytest;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.richit.chatbubblelibrary.Chat;
import org.richit.chatbubblelibrary.ChatAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ChatAdapter chatAdapter;
    RecyclerView recyclerView;
    ArrayList<Chat> chats = new ArrayList<>();

    EditText editTextName, editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatAdapter = new ChatAdapter(this, chats);
        recyclerView = findViewById(R.id.chatRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(chatAdapter);

        editTextName = findViewById(R.id.nameEt);
        editTextMessage = findViewById(R.id.messageEt);
    }

    public void sendMessage(View view) {
        String name = editTextName.getText().toString();
        String message = editTextMessage.getText().toString();

        if (name.isEmpty() || message.isEmpty()) {
            Toast.makeText(this, "Cannot be empty", Toast.LENGTH_SHORT).show();
        }
        else {
            Chat chat = new Chat(name, message);
            chats.add(chat);
            chatAdapter.notifyDataSetChanged();
        }
    }
}
