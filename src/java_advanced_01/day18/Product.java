package java_advanced_01.day18;

// 제품
// 제품 번호(no), 제품 이름(name), 제조사(company), 가격(price) 속성
// Setter, Getter, toString 오버라이딩
// 제품 생성 시 모든 속성의 값 할당

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class Product {
    private String no;
    private String name;
    private String company;
    private Integer price;

}


