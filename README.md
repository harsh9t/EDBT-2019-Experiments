# GREMLINATOR-2019-Experiments
The base repository of Gremlinator experiments

## Data
This repo consists of all the data used for the experiments. (i.e. both files of both the datasets [northwind, bsbm-1M], rdf and graph files plus their groovy scripts)

## Queries
This repo consists of all the 30 queries for both datasets (northwind, bsbm-1M) for both graph query languages (SPARQL, Gremlin). Additionally we have added two versions of Gremlin queries (3.x+ and 2.x+).

## Results
The spreadsheet - https://docs.google.com/spreadsheets/d/183aOScNR6y7GVv8NVOl16_TELS1oZA4R9HKSZVWo3jw/edit?usp=sharing  consists of the results of the benchmarks conducted on both the datasets using diverse RDF and Graph DMS.
This includes datasets loading time, and Query execution time (cold and warm) for both the datasets.

## Benchmarking Platform
We used scripts from the LITMUS Benchmark Suite [https://github.com/LITMUS-Benchmark-Suite/] for orchestrating the experiments on these DMSs under a variety of setting (mentioned in the paper)


