package com.example.mvc_demo.model;

import lombok.*;

//@Data   //сеттеры и геттеры
//@Setter // отдельно сеттеры
//@Getter //отдельно геттеры
//@AllArgsConstructor //все аргументы
//@NoArgsConstructor  //без аргументов конструктор
//@RequiredArgsConstructor //то что требуется вставляется
public class User {
    private String name;
    private String email;
    private String password;
    private Integer year;
}
