# eviction.csv

## Brief Description

This dataset was provided by the Eviction Lab at Princeton University. It consists of formal eviction records and other demographic information on the city-year level. Because of the way the data were collected, not all cities or states are represented in this dataset. If you are curious, here is more information about how the data were collected at the Eviction Lab: https://evictionlab.org/methods/

NOTE: This is the same dataset we will provide to you as part of Assignment 7. We have cleaned this dataset from its original source in two ways:
(1) For cities that had some missing information (but had at least one year's worth of information per variable), we extrapolated (filled in) what the missing variable fields were. This means that this dataset has NO 'None' fields. Come talk to us if you would like to learn more about how those fields were extrapolated. 
(2) For cities that had any variables associated with no information (e.g. a city that had no data for eviction fillings), we dropped ALL data associated with these cities. This means that some cities and some states will not show up in this dataset.

## Source

Original source: https://evictionlab.org/get-the-data/

## Data Snapshot

Here's a snapshot of what the first line of this dataset looks like.

(Note that for readability, we flipped the orientation of this row. In the
 real dataset, the dataset is formatted vertically with each row of data
 representing one observation.)

| Variable Name              | Example Value |
| -------------------------- | ------------- |
| year                       | 2006          |
| name                       | Holland       |
| state                      | Texas         |
| population                 | 609           |
| poverty.rate               | 12.16         |
| renter.occupied.households | 129.1         |
| pct.renter.occupied        | 33.2          |
| pct.white                  | 80.79         |
| pct.af.am                  | 7.72          |
| pct.hispanic               | 10.84         |
| pct.am.ind                 | 0             |
| pct.asian                  | 0             |
| pct.nh.pi                  | 0.66          |
| pct.multiple               | 0             |
| pct.other                  | 0             |
| eviction.filings           | 6.79          |
| evictions                  | 3.88          |
| eviction.rate              | 3.01          |
| eviction.filing.rate       | 5.26          |
