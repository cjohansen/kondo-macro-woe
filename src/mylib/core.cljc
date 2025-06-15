(ns mylib.core
  #?(:cljs (:require-macros [mylib.core :refer [defthing]])))

(defmacro defthing
  {:clj-kondo/lint-as 'clojure.core/defn}
  [name & forms]
  `(defn ~name ~@forms))
