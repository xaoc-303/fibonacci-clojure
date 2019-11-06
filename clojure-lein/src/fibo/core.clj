(ns fibo.core
    (:require [fibo.fibo :as fibo])
    (:gen-class))

(defn start [f n]
    (cond
        (= f "f1") (time (fibo/f1 n))
        (= f "f2") (time (fibo/f2 n))
        :else "fail"))

(defn -main [& args]
    (println (start (first args) (Integer/parseInt (second args)))))
