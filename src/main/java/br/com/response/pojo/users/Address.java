package br.com.response.pojo.users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor
public class Address {


    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public Geo geo;
}
