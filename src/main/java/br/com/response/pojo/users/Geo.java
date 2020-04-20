package br.com.response.pojo.users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor
public class Geo {

    public String lat;
    public String lng;
}
