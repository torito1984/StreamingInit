package es.dmr.uimp.spark.streaming

import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.examples.streaming._

/**
 * Cuenta las palabras recibidas por red.
 *
 * Uso: NetworkWordCount <ip> <puerto>
 * <ip> y <puerto> describe la direccion TCP a la que se 
 * conecta Spark Streaming para recibir datos 
 */
object NetworkWordCount {
  def main(args: Array[String]) {
    
    if (args.length < 2) {
      System.err.println("Uso: NetworkWordCount <hostname> <port>")
      System.exit(1)
    }
    
    
    // Introduzca su codigo aqui
    
  }
}
