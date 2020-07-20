from pyspark import SparkContext
def example():
    words = sc.parallelize(["scala","java","hadoop","spark","akka"])
    return words.count()
print(example())
