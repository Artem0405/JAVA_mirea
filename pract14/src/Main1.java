import java.util.ArrayList;
import java.util.List;

// Класс, представляющий структуру UML-диаграммы
class UML {
    private List<Class> classes; // Поле для хранения списка классов

    // Конструктор по умолчанию, создает пустой список классов
    public UML() {
        classes = new ArrayList<>();
    }

    // Метод для добавления класса в список
    public void addClass(Class clazz) {
        classes.add(clazz);
    }

    // Метод для удаления класса из списка
    public void removeClass(Class clazz) {
        classes.remove(clazz);
    }

    // Метод для вывода информации о классах
    public void showClasses() {
        for (Class clazz : classes) {
            System.out.println(clazz.toString());
        }
    }
}

class Class {
    private String name; // Поле для хранения имени класса
    private List<Method> methods; // Поле для хранения списка методов класса
    private List<Attribute> attributes; // Поле для хранения списка атрибутов класса

    // Конструктор, принимающий имя класса и создающий пустые списки для методов и атрибутов
    public Class(String name) {
        this.name = name;
        this.methods = new ArrayList<>();
        this.attributes = new ArrayList<>();
    }

    // Метод для получения имени класса
    public String getName() {
        return name;
    }

    // Метод для получения списка методов класса
    public List<Method> getMethods() {
        return methods;
    }

    // Метод для получения списка атрибутов класса
    public List<Attribute> getAttributes() {
        return attributes;
    }

    // Метод для добавления метода в список методов класса
    public void addMethod(Method method) {
        methods.add(method);
    }

    // Метод для добавления атрибута в список атрибутов класса
    public void addAttribute(Attribute attribute) {
        attributes.add(attribute);
    }

    // Переопределение метода toString для вывода информации о классе
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class: ").append(name).append("\n"); // Вывод имени класса
        stringBuilder.append("Methods:\n");
        for (Method method : methods) {
            stringBuilder.append(method.toString()).append("\n"); // Вывод информации о каждом методе
        }
        stringBuilder.append("Attributes:\n");
        for (Attribute attribute : attributes) {
            stringBuilder.append(attribute.toString()).append("\n"); // Вывод информации о каждом атрибуте
        }
        return stringBuilder.toString();
    }
}

class Method {
    private String name; // Поле для хранения имени метода
    private String returnType; // Поле для хранения типа возвращаемого значения метода
    private List<Parameter> parameters; // Поле для хранения списка параметров метода

    // Конструктор, принимающий имя метода и тип возвращаемого значения
    public Method(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
        this.parameters = new ArrayList<>();
    }

    // Метод для получения имени метода
    public String getName() {
        return name;
    }

    // Метод для получения типа возвращаемого значения
    public String getReturnType() {
        return returnType;
    }

    // Метод для получения списка параметров метода
    public List<Parameter> getParameters() {
        return parameters;
    }

    // Метод для добавления параметра в список параметров метода
    public void addParameter(Parameter parameter) {
        parameters.add(parameter);
    }

    // Переопределение метода toString для вывода информации о методе
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method: ").append(name).append(" (").append(returnType).append(")"); // Вывод имени метода и типа возвращаемого значения
        if (!parameters.isEmpty()) { // Проверка, есть ли параметры у метода
            stringBuilder.append(" [");
            for (int i = 0; i < parameters.size(); i++) {
                stringBuilder.append(parameters.get(i).toString()); // Вывод информации о каждом параметре
                if (i < parameters.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

class Parameter {
    private String name; // Поле для хранения имени параметра
    private String type; // Поле для хранения типа параметра

    // Конструктор, принимающий имя параметра и тип параметра
    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Метод для получения имени параметра
    public String getName() {
        return name;
    }

    // Метод для получения типа параметра
    public String getType() {
        return type;
    }

    // Переопределение метода toString для вывода информации о параметре
    @Override
    public String toString() {
        return type + " " + name; // Вывод типа и имени параметра
    }
}


class Attribute {
    private String name; // Поле для хранения имени атрибута
    private String type; // Поле для хранения типа атрибута

    // Конструктор, принимающий имя атрибута и тип атрибута
    public Attribute(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Метод для получения имени атрибута
    public String getName() {
        return name;
    }

    // Метод для получения типа атрибута
    public String getType() {
        return type;
    }

    // Переопределение метода toString для вывода информации об атрибуте
    @Override
    public String toString() {
        return type + " " + name; // Вывод типа и имени атрибута
    }
}

public class Main1 {
    public static void main(String[] args) {
        UML uml = new UML(); // Создание объекта uml

        Class class1 = new Class("Person"); // Создание объекта class1 с именем "Person"
        class1.addAttribute(new Attribute("name", "String")); // Добавление атрибута с именем "name" и типом "String" к class1
        class1.addAttribute(new Attribute("age", "int")); // Добавление атрибута с именем "age" и типом "int" к class1
        class1.addMethod(new Method("getName", "String")); // Добавление метода с именем "getName" и типом возвращаемого значения "String" к class1
        class1.addMethod(new Method("getAge", "int")); // Добавление метода с именем "getAge" и типом возвращаемого значения "int" к class1
        uml.addClass(class1); // Добавление class1 в uml

        Class class2 = new Class("Car"); // Создание объекта class2 с именем "Car"
        class2.addAttribute(new Attribute("model", "String")); // Добавление атрибута с именем "model" и типом "String" к class2
        class2.addAttribute(new Attribute("year", "int")); // Добавление атрибута с именем "year" и типом "int" к class2
        class2.addMethod(new Method("getModel", "String")); // Добавление метода с именем "getModel" и типом возвращаемого значения "String" к class2
        class2.addMethod(new Method("getYear", "int")); // Добавление метода с именем "getYear" и типом возвращаемого значения "int" к class2
        uml.addClass(class2); // Добавление class2 в uml

        uml.showClasses(); // Вывод информации о классах в uml
    }
}

