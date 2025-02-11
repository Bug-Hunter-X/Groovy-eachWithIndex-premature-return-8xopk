```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        println "Item $index: $item"
        if (item == "someValue") {
            return false //Returning a value to stop iteration
        }
    }
}

myMethod(["value1", "someValue", "value3"])
```