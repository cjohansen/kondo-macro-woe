(ns mylib.test
  (:require [mylib.core :refer [defthing]]))

(defthing hello [n]
  (str "Hello, " n))

(hello "Dude")
