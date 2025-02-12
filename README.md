# Java Leetcode Practice
1. Get a problem description
2. Create a file in java.com.problems
3. Create corresponding test file in test folder
4. Run junit

## How to run
```
$ git clone
$ mvn test

# Alternatively for specific problem
$ mvn -Dtest=problems.TwoSumTest test
```

## To run all test cases for a problem
```
$ mvn -Dtest=TwoSumTest  test 
```

## To run a specific test case
Class name followed by #, followed by the method name in Test
```
$ mvn -Dtest=TwoSumTest#shouldReturnException test
```
