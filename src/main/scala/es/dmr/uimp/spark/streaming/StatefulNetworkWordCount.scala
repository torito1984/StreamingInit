package es.dmr.uimp.spark.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming._
import org.apache.spark.examples.streaming._

/**
 * Cuenta las palabras recibidas por red.
 *
 * Uso: NetworkWordCount <ip> <puerto>
 * <ip> y <puerto> describe la direccion TCP a la que se 
 * conecta Spark Streaming para recibir datos 
 *
 */
object StatefulNetworkWordCount {
  def main(args: Array[String]) {
    if (args.length < 2) {
      System.err.println("Usage: StatefulNetworkWordCount <hostname> <port>")
      System.exit(1)
    }

    // Introduzca su codigo aqui
  }
}
