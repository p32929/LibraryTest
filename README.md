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

## You might also like

<p><a href="https://openstore.pfay.workers.dev/more/p32929/librarytest/0"><picture><source media="(prefers-color-scheme: dark)" srcset="https://openstore.pfay.workers.dev/more/p32929/librarytest/0-dark.svg"><img src="https://openstore.pfay.workers.dev/more/p32929/librarytest/0-light.svg" width="50%" align="top" alt="More apps by p32929 on OpenStore (1)"></picture></a><a href="https://openstore.pfay.workers.dev/more/p32929/librarytest/1"><picture><source media="(prefers-color-scheme: dark)" srcset="https://openstore.pfay.workers.dev/more/p32929/librarytest/1-dark.svg"><img src="https://openstore.pfay.workers.dev/more/p32929/librarytest/1-light.svg" width="50%" align="top" alt="More apps by p32929 on OpenStore (2)"></picture></a><br><a href="https://openstore.pfay.workers.dev/more/p32929/librarytest/2"><picture><source media="(prefers-color-scheme: dark)" srcset="https://openstore.pfay.workers.dev/more/p32929/librarytest/2-dark.svg"><img src="https://openstore.pfay.workers.dev/more/p32929/librarytest/2-light.svg" width="50%" align="top" alt="More apps by p32929 on OpenStore (3)"></picture></a><a href="https://openstore.pfay.workers.dev/more/p32929/librarytest/3"><picture><source media="(prefers-color-scheme: dark)" srcset="https://openstore.pfay.workers.dev/more/p32929/librarytest/3-dark.svg"><img src="https://openstore.pfay.workers.dev/more/p32929/librarytest/3-light.svg" width="50%" align="top" alt="More apps by p32929 on OpenStore (4)"></picture></a></p>

<p><a href="https://p32929.github.io/share/?repo=LibraryTest"><picture><source media="(prefers-color-scheme: dark)" srcset="https://p32929.github.io/readme/footer-share-dark.svg"><img src="https://p32929.github.io/readme/footer-share-light.svg" width="50%" align="top" alt="Share this project with your friends in one click"></picture></a><a href="https://p32929.github.io/support/"><picture><source media="(prefers-color-scheme: dark)" srcset="https://p32929.github.io/readme/footer-support-dark.svg"><img src="https://p32929.github.io/readme/footer-support-light.svg" width="50%" align="top" alt="If you like my work and want to support me, feel free to support"></picture></a><br><a href="https://openstore.pfay.workers.dev/add"><picture><source media="(prefers-color-scheme: dark)" srcset="https://p32929.github.io/readme/footer-join-dark.svg"><img src="https://p32929.github.io/readme/footer-join-light.svg" width="100%" align="top" alt="Put your own apps on OpenStore: free, your listing lives in your own repo"></picture></a></p>
