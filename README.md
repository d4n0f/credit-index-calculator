# Credit index calculator

A simple console-based application to calculate the credit index for university courses.

## Features

#### Users can choose from three different course types:
- **Mandatory** (6 credits)
- **Elective** (3 credits)
- **Optional** (2 credits)
#### Or they can specify a custom value for the credit.

## Usage

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Course> courseList = List.of(
                new Course("Course1", 6, Grades.FIVE),
                new Course("Course2", 6, Grades.FIVE),
                new Course("Course3", 3, Grades.FOUR),
                new Course("Course4", ClassType.OPTIONAL, Grades.THREE)
        );

        var calculator = new Calculator(courseList);
        System.out.println("Total credits: " + calculator.getTotalCredits()); // outputs: 17
        System.out.println("Credit index: " + calculator.getCreditIndex()); // outputs: 4.588235294117647
    }
}
```

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.
