#!/bin/bash
CLASS=$1 
shift
spark-submit --class $CLASS --master local[4] target/spark-streaming-exercises-0.0.1-jar-with-dependencies.jar $@
