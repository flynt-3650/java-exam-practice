# CONTRIBUTING

1. Все классы в пакетах дожны быть default.
2. Весь текст в файлах должен быть Английским.
3. Придерживайтесь код-стайла Джавы. Выжимка:

    - Packages: Names should be in lowercase. With small projects that only have a few packages it's okay to just give them simple (but meaningful!) names:

        ```java
        package pokeranalyzer;
        package mycalculator;
        ```

    - Classes: Names should be in PascalCase. Try to use nouns because a class is normally representing something in the real world:

        ```java
        class House {}
        class CustomerAccount {}
        ```

    - Interfaces: Names should be in PascalCase and start from letter 'I'. They tend to have a name that describes an operation that a class can do:

        ```java
        interface IComparable {}
        interface IDataProcessor {}
        ```

    - Methods: Names should be in camelCase. Use verbs to describe what the method does:

        ```java
        void calculateTax() {}
        String getSurname() {}
        ```

    - Variables: Names should be in camelCase. The names should represent what the value of the variable represents:

        ```java
        String firstName;
        int orderNumber;
        ```

    - Only use very short names when the variables are short-lived, such as in `for` loops:

        ```java
        for (int i = 0; i < 20; i++) { // 'i' only lives in here
        }
        ```

    - Constants: Names should be in SCREAMING_SNAKE_CASE.

        ```java
        final int DEFAULT_WIDTH;
        static final int MAX_HEIGHT;
        ```
