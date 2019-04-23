# CS 230 Final Project Datasets

This repository is made to help students considering using a real life dataset as part of their final project. To help you, we have downloaded some datasets that you can choose from ([which match this list of curated datasets we provided](https://docs.google.com/document/d/1qdbG9gwVrUvZuIkbUUV1_kTCCZG7UXSV1MVN9IuQe_g/edit)), and we are providing a small wrapper class that can help you read CSV files into Java easier.

## Datasets

Click into each of the links below to explore what these different datasets look like. If you decide a particular dataset looks interesting, you can download that dataset for personal use by clicking into your desired dataset file (e.g. cs230-final-project-datasets/blue_bikes/bluebikes_201902.csv), and then clicking 'Download' on the right hand side link.
1. [Blue Bikes](blue_bikes)
2. [Eviction Lab](eviction_lab)
3. [MBTA](mbta)
4. [Pantheon (Culturally Influential People)](pantheon)
5. [Plagiarism Checker](plagiarism_checker) - Note that this dataset is provided in the form of raw text files. You will have to parse these text files yourselves if you decide to use this dataset.
6. Wordbank:
    a. [Child-level data](wordbank_by_child)
    b. [Word-level data](wordbank_by_word)

Note: This repository does not contain data from the movie scripts dataset -- you can download scripts from that dataset [at this link instead.](https://osf.io/zytmp/)

## CSV Reader

If you use a dataset provided in a csv format, download the [csv_parser](csv_parser) folder, and in particular take a look at the [Reader](csv_parser/Reader.java) class to understand how to read rows of your dataset into Java. A very similar class will be provided to you as part of Assignment 7.
