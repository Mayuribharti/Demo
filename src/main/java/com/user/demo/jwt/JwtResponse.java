package com.user.demo.jwt;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class JwtResponse {
    private String jwtToken;
    private String username;
}
