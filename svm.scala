
//To start using the linear support vector machine algorithm, the following algorithm libraries need to be set the library needed to use the linear support vector machine qualifier is imported
import org.apache.spark.ml.classification.LinearSVC

// The proposed training data is loaded to start using the algorithm

val training = spark.read.format("libsvm").load("data/mllib/sample_libsvm_data.txt")


// An Lsvc variable was created where the .setMax (10) and .setRegParam (0.1) parameters are set
val lsvc = new LinearSVC()
  .setMaxIter(10)
  .setRegParam(0.1)

// The model is adjusted to use the training

val lsvcModel = lsvc.fit(training)

// // Subsequently here the Coefficients are printed and intercepted for linear svc and once executed in the console it shows us the final result

println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
