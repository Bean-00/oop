package ch18;

import java.util.Objects;

public class Company {

    private static Company instance = new Company();

    private Company() {

    }

    public static Company getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Company();
        }
        return instance;
    }

}
