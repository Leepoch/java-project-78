## Library for checking data validation

***

### Hexlet tests and linter status:
[![Actions Status](https://github.com/Leepoch/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Leepoch/java-project-78/actions)
### GHActions & Maintainability
[![Java CI](https://github.com/Leepoch/java-project-78/actions/workflows/gradle.yml/badge.svg)](https://github.com/Leepoch/java-project-78/actions/workflows/gradle.yml)
[![Maintainability](https://api.codeclimate.com/v1/badges/f5ca63762131672b56b2/maintainability)](https://codeclimate.com/github/Leepoch/java-project-78/maintainability)
### Tests
[![Test Coverage](https://api.codeclimate.com/v1/badges/f5ca63762131672b56b2/test_coverage)](https://codeclimate.com/github/Leepoch/java-project-78/test_coverage)
***

## To start
```bash
git clone git@github.com:Leepoch/java-project-78.git
```

## How to use
The validator has three methods for checking different data
```bash
1. v.string()
2. v.number()
3. v.map()
```
You can add a check to each method, for example:
```bash
v.string().required().minLength(5)
```
At the end there is a method for validating the data
```bash
v.string().required().isValid("Cat") // true
```