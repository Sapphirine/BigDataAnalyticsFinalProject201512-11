1. About this code.
This code is used to filter data by using Pig Latin. The process of filtering the data is the following. First, you need to start shell and connect to localhost. Then making a direction on the localhost and naming it as a PigSource. Third, uploading the data file into the localhost as a PigSource. Then running pig in local mode, loading the data, and filtering the data according to your needs. Then store the results in your computer by writing a specific path on the command line.

2. How to use the sample code.
In the following, it shows the sample code for filtering driverÕs license expiration data. Running the sample command lines in the terminal, and make a little change on the filter condition, you can generate your own filter results. 


$ssh localhost$cd /usr/local/Cellar/hadoop/2.7.1$sbin/start-dfs.sh($sbin/start-all.sh)($bin/hdfs namenode -format)$bin/hdfs dfs -mkdir /PigSource$bin/hdfs dfs -put /$Your own path to the data file$ /PigSource$pigÊ-x local$trained = LOAD 'hdfs://localhost:9000/PigSource/Train1.csv' USING PigStorage(',') ASÊ(LicenseNumber,Date);$DUMP trained$train_filter = FILTER trained BY (float)Date>$put your own filter condition$ and (float)Date<$put your own filter condition$;$store train_filter into Ô/$Put your own storage path on your computer$';