## Classes and Objects:

- **Class:** A blueprint or prototype from which objects are created.
  It defines attributes (fields) and behaviors (methods) of an object.
- **Object:** An instance of a class.

```
class Dog {
    // attributes
    String breed;
    int age;

    // methods
    void bark() {
        System.out.println("Woof!");
    }
}

Dog myDog = new Dog();
```

## Encapsulation:

- The bundling of data (attributes) and methods that operate on the data
  into a single unit (class) and restricting access to some of the
  object's components.
- This is typically achieved using private variables and public getter
  and setter methods.

```
class Circle {
    private double radius;

    // Setter
    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            System.out.println("Invalid radius");
        }
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

## Inheritance:

- Allows one class (child/subclass) to inherit the attributes and
  behaviors of another class (parent/superclass).
- Promotes reusability and establishes a relationship between the
  parent and child class.

```
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}

Dog d = new Dog();
d.eat();  // inherited method
d.bark();
```

### Polymorphism:

- Ability of a single function or method to work in different ways
  based on the input or on the object it's called on.
- **Method Overloading**: Same method name but different parameters.
- **Method Overriding**: Child class provides a specific implementation
  of a method that is already defined in its parent class.

```
// Method Overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // overriding the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### Abstraction:

- Hiding complex implementation details and showing only the
  necessary features of an object.
- Achieved using abstract classes and interfaces.

```
abstract class Shape {
    abstract double getArea();  // abstract method
}

class Circle extends Shape {
    double radius = 5.0;

    double getArea() {
        return Math.PI * radius * radius;
    }
}
```

### Association, Aggregation, Composition:

- **Association**: A general binary relationship that describes an activity between two classes. E.g., Teacher and Student having an association.
- **Aggregation**: A specialized form of association, represents a "whole-part" relationship. E.g., Department and Teacher, where a Department can exist without a Teacher.
- **Composition**: A strong type of aggregation. The child cannot exist independently of the parent. E.g., Human and Heart.

```
class Engine { }

class Car {
    // Composition because a car always has an engine
    Engine engine = new Engine();

    void move() {
        System.out.println("Car is moving.");
    }
}
```
