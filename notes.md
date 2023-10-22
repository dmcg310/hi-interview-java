### Encapsulation

- Wrapping data (attributes) and code (methods) as a single unit.

### Inheritance

- Acquiring properties and behaviours from another class.

### Polymorphism

- Ability to take on many forms (overloading and overriding).

### Abstraction

- Hiding complex details and showing only the necessary features

### `final`

- The value of the variable cannot be changed. The method cannot be
  overridden by any subclass. The class cannot be subclassed (no
  other class can extend it).

### `static`

- Variable belongs to the class rather than any particular instance.
  Method belongs to the class and can be called without creating an
  instance of the class.

### `abstact`

- A method declared without an implementation (no braces). Subclasses
  inheriting an abstact class must provide an implementation for its
  absract methods, unless the subclass is also abstract. Abstract class
  cannot be instantiated on its own and must be subclassed.

### `synchronized`

- Synchronized method can be accessed by only one thread at at time.

### `transient`

- Indicates that a variable should not be serialised. When an object
  is serialised, `transient` variables are skipped from the serialisation
  process.

### `volatile`

- Guarantees that any thread reading the field sees the most recently
  written value.

### ArrayList

- Resizable array implementation of the `List` interface.

```java
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Java");
arrayList.get(0);
```

### LinkedList

- Doubly-linked list implementation of the `List` and `Deque` interfaces.

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Java");
linkedList.get(0);
```

### HashSet

- A collection that doesn't allow duplicate elements. Implements the
  `Set` interface, backed by a `HashMap`. No guarantee of order.

```java
HashSet<String> hashSet = new HashSet<>();
hashSet.add("Java");
hashSet.add("Java");
hashSet.size(); // 1
```

### LinkedHashSet

- Hash table and linked list implementation of the `Set` interface.
  Maintains insertion order.

```java
LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Blue");
linkedHashSet.add("Red");
linkedHashSet.add("Green");
System.out.println(linkedHashSet); // [Blue, Red, Green] maintaining order
```

### TreeSet

- NavigableSet implementation using a red-black tree.

```java
TreeSet<String> treeSet = new TreeSet<>();
treeSet.add("Pine");
treeSet.add("Oak");
treeSet.add("Maple");
System.out.println(treeSet); // [Maple, Oak, Pine] sorted order
```

### HashMap

- An object that maps keys to values. A map cannot contain duplicate keys.
  Implements the `Map` interface, backed by a hash table.

```java
HashMap<Integer, String> hashMap = new HashMap<>();
hashMap.put(1, "One");
hashMap.get(1);
```

### LinkedHashMap

- Hash table and linked list implementation of the `Map` interface.

```java
LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put(3, "Three");
linkedHashMap.put(2, "Two");
linkedHashMap.put(1, "One");
System.out.println(linkedHashMap); // 3=Three, 2=Two, 1=One maintaining insertion order
```

### TreeMap

- Red-black tree based NavigableMap implementation.

```java
TreeMap<Integer, String> treeMap = new TreeMap<>();
treeMap.put(3, "Three");
treeMap.put(1, "One");
treeMap.put(2, "Two");
System.out.println(treeMap); // 1=One, 2=Two, 3=Three sorted by key
```
