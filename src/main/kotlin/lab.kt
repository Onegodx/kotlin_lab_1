import kotlin.math.max

//Миньков Владимир 22исп3-1 средний уровень 8 вариант
//import kotlin.random.Random
//
//fun main() {
//    val array = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
//    var i = 0
//    var largestElement = array[0]
//
//    while (i < array.size) {
//        array[i] = Random.nextInt(10)
//        print(array[i])i
//        print(" ")
//        i++
//    }
//    for (number in array)
//    {
//        if (number % 2 != 0 && largestElement < number)
//        {
//            largestElement = number
//
//        }
//    }
//    val index = array.indexOf(largestElement)
//    println("Индекс наибольшего положительного нечетного числа в массиве равен:$index")
//}




// Миньков Владимир 22исп3-1 базовый уровень 8 вариант двумерный массив
fun main() {
    print("Введите размерность массива ")
    val n = readLine()!!.toInt()

    val matrix = Array(n) { DoubleArray(n) }


    for (i in 0 until n) {
        for (j in 0 until n) {
            print("Введите элемент A[$i][$j]: ")
            matrix[i][j] = readLine()!!.toDouble()
        }
    }
    val minnumber = DoubleArray(n) { i -> matrix[0][i]}
    for (i in 1 until n) {
        for (j in 0 until n) {
            if (matrix[i][j] < minnumber[j]) {
                minnumber[j] = matrix[i][j]
            }
        }
        var product = 1.0
        for (element in minnumber) {
            product *= element
        }

        println("Произведение наименьших элементов каждого столбца: $product")
    }
    }
