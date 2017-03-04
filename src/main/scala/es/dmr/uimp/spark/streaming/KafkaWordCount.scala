package es.dmr.uimp.spark.streaming

import java.util.HashMap

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}

import org.apache.spark.SparkConf
import org.apache.spark.streaming._
import org.apache.spark.streaming.kafka._
import org.apache.spark.examples.streaming._

/**
 * Consume mensajes de uno o mas temas de Kafka
 * Uso: KafkaWordCount <zkQuorum> <group> <topics> <numTheads>
 *
 */
object KafkaWordCount {
  def main(args: Array[String]) {
    if (args.length < 4) {
      System.err.println("Uso: KafkaWordCount <zkQuorum> <group> <topics> <numTheads>")
      System.exit(1)
    }

    StreamingExamples.setStreamingLogLevels()
    
    // Introduzca su codigo aqui
  }
}
