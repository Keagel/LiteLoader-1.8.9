**LiteLoader** is a lightweight mod framework designed primarily for client-side
mods. It aims to provide a wide array of features as possible whilst having
minimal footprint and very low impact game performance when features are not in
use.

### Features

* __Simple callback system based on interfaces__. Simply implement the
interfaces your mod needs
* __Powerful class transformers__. If LiteLoader can't meet your needs "out of
the box", you have a wide selection of powerful class transformers at your
fingertips. It provides access to cutting edge transformers developed for
LiteLoader but also used by the wider modding community. This guarantees that
LiteLoader's transformers are the most stable and powerful libraries available
* __Tiny footprint__. Liteloader injects minimal code into the game, and uses
native bytecode injection for maximum performance. LiteLoader makes use of Java
libraries shipped with the base game such as Gson rather than bundling a slew of
optional libraries
* __Native bytecode event handlers__. Liteloader generates raw java bytecode for
event callbacks, this makes its event handlers blazing fast

### License and Permissions

LiteLoader is Copyright 2012-2017 Adam Mummery-Smith  All Rights Reserved
You are free to use the source code for personal reference.
You may not redistribute modified versions of the loader.
You may not redistribute the source code in any form without written permission.

### Building the project
**LiteLoader** uses the [Gradle](http://gradle.org/) build automation
system. To build the project simply navigate to the project directory in a terminal and execute

```
./gradlew build
```
