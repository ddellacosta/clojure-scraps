clojure-scraps
==============

Clojure examples, experiments, and code I don't want to forget.

Run scripts like:

    $ java -cp /path/to/clojure-1.4.0.jar clojure.main accumulator.clj
    $ java -cp /path/to/clojure-1.4.0.jar clojure.main fizzbuzz.clj

etc.

## Includes:

* fizzbuzz.clj

  Yeah, this is old, but...well, read the post: http://imranontech.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/

* accumulator.clj

  An accumulator (a.k.a. reduce function) based on Raganwald's "Closures and Higher Order Functions" (http://weblog.raganwald.com/2007/01/closures-and-higher-order-functions.html) post.  Didn't implement his currying example (yet).

* load-file.clj

  Just trying to figure out how to load files.  Added a super simple example of providing variable arity to a function while I was at it.

* fibonacci.clj

  Does what it says on the label.  Written in response to problem 26 at 4clojure.com (http://www.4clojure.com/problem/26)
