# Use Cucumber in SBT

This project demonstrates:

- How to use `Cucumber` in SBT
- Separate test run between `Cucumber` and `ScalaTest` tests

## Note

- Pass tags parameter to Cucumber in test run: `sbt -Dcucumber.filter.tags="@tagged" cucumber`
- Pass scenario parameter to Cucumber in test runL `sbt -Dcucumber.features=classpath:features/Hello.feature:17 cucumber`
