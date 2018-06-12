package com.example.beanlistproperty;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ToString
@Component
@NoArgsConstructor
@ConfigurationProperties(prefix = "bean-list-property.company")
public class Company {
    private String document;
    private String socialName;
    private List<String> phones;
    private List<String> emails;
}
