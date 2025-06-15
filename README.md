# What's this?

This repo reproduces a linting issue I'm seeing. I have a custom macro that has
the same syntax as `defmacro`, so I it want linted as such:

```clj
{:clj-kondo/lint-as 'clojure.core/defn}
```

This works fine when the macro is in a `.clj` file. However, if I put the file
in a `cljc` file, I get linting errors when using this macro in `.clj`, `.cljs`,
`.cljc` as demonstrated by the test namespaces:

```sh
clj-kondo --version
clj-kondo v2025.06.05

clj-kondo --lint src/mylib/test.clj
src/mylib/test.clj:4:11: error: Unresolved symbol: hello
src/mylib/test.clj:4:18: error: Unresolved symbol: n
linting took 39ms, errors: 2, warnings: 0
```
