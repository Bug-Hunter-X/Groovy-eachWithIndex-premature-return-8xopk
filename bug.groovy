```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        println "Item $index: $item"
        if (item == "someValue") {
            return // This will exit the eachWithIndex loop prematurely
        }
    }
}

myMethod(["value1", "someValue", "value3"])
```