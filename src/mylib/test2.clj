(ns mylib.test2
  (:require [mylib.core :refer [defthing]]))

(defthing hello [n]
  (str "Hello, " n))

(hello "Dude")
