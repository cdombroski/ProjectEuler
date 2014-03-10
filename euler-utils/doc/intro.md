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

## org.icanttype.euler-utils.factor

*    ```clojure
     (gcd x)
     (gcd x y)
     (gcd x y & more)
     ```

     Computes the greatest common denominator of 1 or more numbers:
     ```clojure
     (gcd x); => |x|
     (gcd x 0); => |x|
     (gcd x y z); => (gcd (gcd x y) z)
     ```

*    ```clojure
     (lcm x)
     (lcm x y)
     (lcm x y z)
     ```

     Computes the least common multiple of 1 or more numbers:
     ```clojure
     (lcm x); => |x|
     (lcm 0 0); => special case: 0
     (lcm x y); => (* (/ |x| (gcd x y)) |y|)
     (lcm x y z); => (* (/ |x| (gcd x y z)) |y| |z|)