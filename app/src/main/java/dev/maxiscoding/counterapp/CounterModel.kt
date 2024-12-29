package dev.maxiscoding.counterapp

data class CounterModel(var count: Int = 10) {
}

class CounterRepository {
    private val _counter = CounterModel()

    fun getCounter() = _counter

    fun incrementCounter() {
        _counter.count++
    }

    fun decrementCounter() {
        _counter.count--
    }
}