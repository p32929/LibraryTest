# LibraryTest

A small teaching project that shows how to make your own Android library and publish it on JitPack. Most guides skip the parts that confuse beginners, like how the library module differs from an app and how a tag turns into a dependency. This repo keeps the library tiny, a chat bubble list, so you can see that setup clearly.

I made it to teach interns. The library itself is not the point; the setup around it is.

## What's in here

| Module | What it is |
|---|---|
| `chatbubblelibrary/` | The library module: a `Chat` model, a `ChatAdapter` and one item layout |
| `app/` | A demo app that depends on the library module and renders a chat list |

## The lesson, in order

1. **`chatbubblelibrary/build.gradle`:** it uses `apply plugin: 'com.android.library'` instead of `application`, and has no `applicationId`.
2. **`app/build.gradle`:** how the demo app pulls the module in.
3. **Tag a release** (this repo is at `1.0.0.1`). JitPack builds from tags.
4. **Use it from JitPack** like any other dependency:

```gradle
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
    implementation 'com.github.p32929:LibraryTest:1.0.0.1'
}
```

## Using the library

```java
ChatAdapter chatAdapter = new ChatAdapter(this, chats);
RecyclerView recyclerView = findViewById(R.id.chatRv);
recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setAdapter(chatAdapter);

chats.add(new Chat(name, message));
chatAdapter.notifyDataSetChanged();
```

Open `app/src/main/java/org/richit/librarytest/MainActivity.java` for the full working example.

## License

MIT License — Copyright (c) Fayaz Bin Salam. See [LICENSE](LICENSE) for the full text.

## Contributing

Contributions are very welcome, thank you! Before you start on a pull request, please open an issue and tell me what you would like to add or change. That way we can agree on it first, and your time is not wasted on something that might not fit. Thanks for helping make LibraryTest better.

## Share

<a href="https://p32929.github.io/share/?repo=LibraryTest"><picture><source media="(prefers-color-scheme: dark)" srcset="https://p32929.github.io/readme/share-dark.svg"><img src="https://p32929.github.io/readme/share-light.svg" alt="Share this with your friends in just a click" width="420"></picture></a>

## Support

<a href="https://p32929.github.io/support/"><picture><source media="(prefers-color-scheme: dark)" srcset="https://p32929.github.io/readme/support-dark.svg"><img src="https://p32929.github.io/readme/support-light.svg" alt="If you like my works and want to support me, feel free to support" width="420"></picture></a>
