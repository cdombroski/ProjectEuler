# Introduction to euler-utils

## org.icanttype.euler-utils.fibonacci

*    ```clojure
     (fibonacci)
     (fibonacci first second)
     ```

    Produces an infinite, lazy fibonacci sequence where the first two terms are `first` and `second`. Defaults to 0 and 1.

## org.icanttype.euler-utils.prime

*    ```clojure
     (sieve)
     ```

    Produces an infinite lazy prime sequence using the Sieve of Eratosthenes

*    ```clojure
     (prime-factor number)
     ```

    Produces a map of prime factors and exponents for the given number:
    ```clojure
    (prime-factor 8); => {2 3}
    (prime-factor 15); => {3 1, 5 1}
    ```