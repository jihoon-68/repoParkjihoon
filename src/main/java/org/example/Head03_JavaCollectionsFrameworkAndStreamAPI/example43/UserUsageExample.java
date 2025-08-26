package org.example.Head03_JavaCollectionsFrameworkAndStreamAPI.example43;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
    String grade;
    double usageTime;
    public User(String grade, double usageTime) {
        this.grade = grade;
        this.usageTime = usageTime;
    }
    public String getGrade() {
        return grade;
    }
    public double getUsageTime() {
        return usageTime;
    }
    @Override
    public String toString() { return grade + "(" + usageTime + "h)"; }
}

public class UserUsageExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Bronze", 2.5),
                new User("Silver", 3.0),
                new User("Gold", 5.0),
                new User("Silver", 4.5)
        );

        Map<String, Double> avgUsageByGrade =
                users.stream().collect(Collectors.groupingBy(
                        User::getGrade,
                        Collectors.averagingDouble(User::getUsageTime)
                        
                ));
    }
}
