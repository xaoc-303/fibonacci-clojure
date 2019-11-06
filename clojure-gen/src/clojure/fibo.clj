(ns clojure.fibo
    (:gen-class))

; recursive if-else
(defn f1 [n]
    (cond
        (= n 0) 0
        (= n 1) 1
        :else (+ (f1 (- n 1)) (f1 (- n 2)))))

; optimization
(defn f2
    [^long x]
    (loop [a 0 b 1 cnt x]
        (if (= cnt 0)
            a
            (recur (+ a b) a (dec cnt)))))

(defn start [f n]
    (cond
        (= f "f1") (time (f1 n))
        (= f "f2") (time (f2 n))
        :else "fail"))

(defn -main [& args]
    (println (start (first args) (Integer/parseInt (second args)))))
