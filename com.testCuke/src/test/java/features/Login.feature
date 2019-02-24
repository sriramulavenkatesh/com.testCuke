Feature: Amaozon Test

Scenario Outline:: Amazon Search
Given Browser intialized
Then Navigate to Amazon Site
Then Search for product <products>

Examples:
|products |
|mobiles |
|Kitchen |



