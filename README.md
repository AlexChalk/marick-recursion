# Marick-Recursion

Some puzzles involving recursion in Clojure.

I am following exercises created by Brian Marick—they are available in his book [Functional Programming for the Object-Oriented Programmer](https://leanpub.com/fp-oo).

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
