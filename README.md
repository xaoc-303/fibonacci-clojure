# fibonacci-clojure

[![Build Status](https://travis-ci.org/xaoc-303/fibonacci-clojure.svg?branch=master)](https://travis-ci.org/xaoc-303/fibonacci-clojure)

## recursive if-else

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 1.10.1.469 | [Clojure](./clojure-lein/src/fibo/fibo.clj) (uberjar) | 0.038356533 | 0.208630531 | 2.075427501 | 23.255528474 |
| 1.10.1.469 | [Clojure](./clojure-gen/src/clojure/fibo.clj) (gen) | 0.043102284 | 0.212649269 | 2.082499946 | 22.879287563 |
| 1.10.1.469 | [Clojure](./clojure/fibo.clj) | 0.040306367 | 0.221583837 | 2.111861578 | 23.751176313 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |

## optimization

| v | # | 30 | 35 | 40 | 45 |
| --- | --- | --- | --- | --- | --- |
| 1.10.1.469 | [Clojure](./clojure-lein/src/fibo/fibo.clj) (uberjar) | 0.000021203 | 0.000019519 | 0.000021302 | 0.000020928 |
| 1.10.1.469 | [Clojure](./clojure-gen/src/clojure/fibo.clj) (gen) | 0.000023397 | 0.000023213 | 0.00002434 | 0.000022332 |
| 1.10.1.469 | [Clojure](./clojure/fibo.clj) | 0.000037316 | 0.000036835 | 0.000038081 | 0.000037017 |
| | [Total](https://github.com/xaoc-303/fibonacci) | | | | |
