# BD_EXPO

LINEAR SUPPORT VECTOR MACHINE


## Algorythm Description 

A support vector machine constructs a hyperplane or set of hyperplanes in a high- or infinite-dimensional space, which can be used for classification, regression, or other tasks

### Prerequisites

* Ubuntu 18 
* [Apache Spark](https://computingforgeeks.com/how-to-install-apache-spark-on-ubuntu-debian/)


### Previous Knowledge
 * Linear Algebra
 
 ###  Basic Concepts

* Hyperplane: It is a plane that divides space into two halves.
* Transposed Matrix: It is formed  by writing its columns as rows.

###  Sparse data (Sparse)
Algorithms for SVM significantly improve their efficiency if they are scattered data

# Efficient calculation of scalar products i
# Iterating only over non-null data

- SVM can process sparse data with 10,000s of attributes.

### Regularization
It is quite frequent that the data has noise, that they are not perfectly labeled, or that the problem is so difficult that for a few points, it is very difficult to classify them correctly.

### Kernel function
There are times when there is no way to find a hyperplane that allows two classes to be separated. In these cases we say that the classes are not linearly separable.
The trick of the kernel is to invent a new dimension in which we can find a hyperplane to separate the classes.

 ### Features
 
SVM works well for linearly separable data.
For data that is almost linearly separable, SVM can work well with the correct hyperplane value.
For data that is not linearly separable, we can project the data to the space where it is perfectly or almost linearly separable.

### Advantages
An excellent ability to generalize, due to the minimization of structured risk.
There are few parameters to adjust the model only depends on the data with more information.

###  Applications

-Optical character recognition
 
-Face detection for digital cameras to focus correctly
 
-Spam filters for email

-Image recognition on board satellites (know what parts of an image have clouds, earth, water, ice, etc.)

###  References

- Tang, Y. (2013). Deep learning using linear support vector machines. arXiv preprint arXiv:1306.0239.

- Fung, G., Sandilya, S., & Rao, R. B. (2005, August). Rule extraction from linear support vector machines. In Proceedings of the eleventh ACM SIGKDD international conference on Knowledge discovery in data mining (pp. 32-40). ACM.

- Furey, T. S., Cristianini, N., Duffy, N., Bednarski, D. W., Schummer, M., & Haussler, D. (2000). Support vector machine classification and validation of cancer tissue samples using microarray expression data. Bioinformatics, 16(10), 906-914.
 

