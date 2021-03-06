lein-sinker
===========

A platform for experimenting with [Leiningen](https://github.com/technomancy/leiningen) and [Robert Hooke](https://github.com/technomancy/robert-hooke/). All you need is Hooke, Lein, and Sinker.

We don't know what we're doing
------------------------------

This part is where we tell you that we don't guarantee it works, but let us know if it doesn't.
We built this to understand Leiningen's plugin system, which can be a bit obscure; consequently, we don't know if any of this is proper style.

How to build and run lein-sinker
--------------------------------

We included the simple bash script we wrote to automate building it: `leinUpdate.sh`. 

All it actually does is run:

1. `lein pom`
2. `lein jar`
3. `lein install`

This makes the pieces that Leiningen needs, and places them in Leiningen's local repository. To run it, once built, simply `lein sinker` in the context of a project that has `[lein-sinker "0.2.0"]` in `:plugins` in the project map. This runs the active behavior of the project; what happens when it is directly invoked. There is another set of behaviors, the automatic loading of hooks (see Robert Hooke) contained in `/src/leiningen/sinker.clj`'s `hooks` function.

Leiningen's [plugin documentation](https://github.com/technomancy/leiningen/blob/stable/doc/PLUGINS.md) is essentially required reading.

