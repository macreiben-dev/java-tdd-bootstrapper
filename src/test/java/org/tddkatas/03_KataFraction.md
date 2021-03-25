# Kata Fraction

Implement a fraction sum. For example :

1/2 + 3/2 = 2

The fraction will be reduced. An implementation of GCD is given :

```Java
static int gcd(int a, int b) {
return b == 0 ? a : gcd(b, a % b);
}
```

```JS
var gcd = function(a, b) {
return b == 0 ? a : gcd(b, a % b);
};
```