# LibraryTest

A teaching repo: a deliberately tiny Android library (`chatbubblelibrary`) plus a demo app that consumes it, built to show interns **how an Android library is structured, built and published to JitPack**.

The library itself is just a chat-bubble RecyclerView adapter — the point isn't the library, it's the wiring around it.

## What's in here

| Module | What it is |
|---|---|
| `chatbubblelibrary/` | The library module — `Chat` model, `ChatAdapter`, one item layout |
| `app/` | A demo app that depends on the library module and renders a chat list |

## The lesson, in order

1. **`chatbubblelibrary/build.gradle`** — note `apply plugin: 'com.android.library'` instead of `application`, and that there's no `applicationId`
2. **`app/build.gradle`** — how the demo app pulls the module in
3. **Tag a release** (this repo is at `1.0.0.1`) — JitPack builds from tags
4. **Consume it from JitPack** like any other dependency:

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

Contributions are warmly welcomed and greatly appreciated! Whether it's a bug fix, new feature, or improvement, your input helps make this project better for everyone.

Before submitting a pull request, please:

1. Create an issue describing the feature or bug fix you'd like to work on
2. Wait for discussion and approval to ensure alignment with project goals
3. Fork the repository and create your feature branch
4. Submit your pull request with a clear description of changes

This approach helps avoid duplicate efforts and ensures smooth collaboration. Thank you for considering contributing!

## Share

Sharing this repository with your friends is just one click away from here

[![facebook](https://user-images.githubusercontent.com/6418354/179013321-ac1d1452-0689-493f-9066-940cf2302b6e.png)](https://www.facebook.com/sharer/sharer.php?u=https://github.com/p32929/LibraryTest/)
[![twitter](https://user-images.githubusercontent.com/6418354/179013351-7d8d6d1c-4ce2-46ab-bef8-4c4765a1b888.png)](https://twitter.com/intent/tweet?url=https://github.com/p32929/LibraryTest/)
[![tumblr](https://user-images.githubusercontent.com/6418354/179013343-3111f55a-3b90-40c7-8487-9777348672b0.png)](https://www.tumblr.com/share?v=3&u=https://github.com/p32929/LibraryTest/)
[![pocket](https://user-images.githubusercontent.com/6418354/179013334-b095c45f-becf-49f4-9ee1-5a731a9b1f85.png)](https://getpocket.com/save?url=https://github.com/p32929/LibraryTest/)
[![pinterest](https://user-images.githubusercontent.com/6418354/179013331-44cd9206-11b1-4b65-becb-5863b61c828f.png)](https://pinterest.com/pin/create/button/?url=https://github.com/p32929/LibraryTest/)
[![reddit](https://user-images.githubusercontent.com/6418354/179013338-7416ae3f-73ba-4522-86e1-1374d7082d22.png)](https://www.reddit.com/submit?url=https://github.com/p32929/LibraryTest/)
[![linkedin](https://user-images.githubusercontent.com/6418354/179013327-ca7b7102-1da8-4b1c-858f-1a6e5f21bd70.png)](https://www.linkedin.com/shareArticle?mini=true&url=https://github.com/p32929/LibraryTest/)
[![whatsapp](https://user-images.githubusercontent.com/6418354/179013353-f477fa0b-3e6f-4138-a357-c9991b23ff88.png)](https://api.whatsapp.com/send?text=https://github.com/p32929/LibraryTest/)

---

## Support

If you like my works and want to support me/my works, feel free to support or donate. My payment details can be found here: https://p32929.github.io/SendMoney2MeV1/
