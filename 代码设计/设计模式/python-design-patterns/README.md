## 基于Pyspark的各类临时需求Spark计算Job

spark-submit --master yarn-client  --driver-memory 2g --executor-memory 3g test_events.py

!/bin/bash
spark-submit
--master yarn-client
--executor-cores 2
--executor-memory 14g
--queue your-queue
--num-executors 100
--driver-memory 10g
--conf spark.ui.port=$RANDOM
--conf spark.shuffle.manager=SORT
--conf spark.shuffle.memoryFraction=0.2
--conf spark.yarn.executor.memoryOverhead=2048
--conf spark.core.connection.ack.wait.timeout=300
--conf spark.akka.frameSize=600 ./word2vector_training.py


