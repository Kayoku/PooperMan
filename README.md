# PooperMan

PooperMan is a super game.

# How to install with eclipse luna

First, you need to download the eclipse on the official page of [eclipse luna] (https://eclipse.org/downloads/packages/release/luna/sr2).

Then clone this project to your new beautiful eclipse workspace :-)

```
git clone https://github.com/Kayoku/PooperMan 
```

Now, we need to configure eclipse for the project. LWJGL is already in the project, in the directory */lib/LWJGL3*. Next, create a new Java Project with the same name "PooperMan". File > New > Java Project and "PooperMan" as Project name.
After this, go to the project "Properties" and to "Java Build Path". In the tab "Libraries", you will see "lwjgl.jar", configure like this (with "Edit" button on the right !) :
* Source attachment: "Workspace location" > button Browse > "PooperMan/lib/LWJGL3/jar/lwjgl.jar"
* Javadoc location: "Javadoc in archive" > "Workspace file" > button Browse > "PooperMan/lib/LWJGL3/doc/javadoc.zip"
* Native library location: "Workspace..." > "PooperMan/lib/LWJGL3/native"

Ok, ok and ok ! Just restart eclipse and that's work ! Enjoy !

