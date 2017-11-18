###

create new Scala Object

code

import org.apache.spark.SparkContext, org.apache.spark.SparkConf

object wordcount {
  def main(args : Array[String]) {
    val conf = new SparkConf().setAppName("Word Count").setMaster("local")
    val sc = new SparkContext(conf)
    val inputpath = args(0)
    val outputpath = args(1)
    
    
    val wc = sc.textFile(inputpath).flatMap(rec => rec.split(" ")).map(rec => (rec, 1)).
        reduceByKey{case (x,y) => x + y}
        wc.saveAsTextFile(outputpath)
  }
  
}


go to Run as and run configurations

give arguments

input and output path ( make sure output text file is not existing)

run the program
































