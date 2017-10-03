# EDBT-2018-Experiments
The Zion of EDBT 2018 submission experiments

## Data
This repo consists of all the data used for the experiments. (i.e. both files of both the datasets [northwind, bsbm-1M], rdf and graph files plus their groovy scripts)

## Queries
This repo consists of all the 30 queries for both datasets (northwind, bsbm-1M) for both graph query languages (SPARQL, Gremlin). Additionally we have added two versions of Gremlin queries (3.x+ and 2.x+).

## Results
This repo consists of the results of the benchmarks conducted on both the datasets using diverse RDF and Graph DMS.
This includes datasets loading time, and Query execution time (cold and warm) for both the datasets.

## Benchmarking Platform
We used scripts from the LITMUS Benchmark Suite [https://github.com/LITMUS-Benchmark-Suite/] for orchestrating the experiments on these DMSs under a variety of setting (mentioned in the paper)


## Running the task
### Generating the queries
```sh
python3 generator.py
```

### Running the queries

* For BSBM queries
```sh
python3 runner.py -p2 /home/yashwant/Downloads/gremlin-groovy-2.6.0/bin/gremlin.sh -p3 /home/yashwant/Downloads/apache-tinkerpop-gremlin-console-3.2.4/bin/gremlin.sh -n 1 -d "tinker3,sparksee,tinker,sparksee" -ds bsbmq
```
* For NW queries
```
python3 runner.py -p2 /home/yashwant/Downloads/gremlin-groovy-2.6.0/bin/gremlin.sh -p3 /home/yashwant/Downloads/apache-tinkerpop-gremlin-console-3.2.4/bin/gremlin.sh -n 1 -d "tinker3,sparksee,tinker,sparksee" -ds nwq
```
