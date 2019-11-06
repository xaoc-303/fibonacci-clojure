(ns fibo)
(import java.util.Locale)

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

(defn my-format [fmt n & [locale]]
    (let [locale (if locale (Locale. locale)
                            (Locale/getDefault))]
         (String/format locale fmt (into-array Object [n]))))

(defmacro measure
    [expr]
    `(let [start# (. System (nanoTime))
           ret# ~expr]
          (println (my-format "%.8f" (/ (double (- (. System (nanoTime)) start#)) 1000000000.0) "en-GB"))
    ret#))

(defn start [f n]
    (cond
        (= f "f1") (measure (f1 n))
        (= f "f2") (measure (f2 n))
        :else "fail"))

(println (start (first *command-line-args*) (read-string (second *command-line-args*))))
