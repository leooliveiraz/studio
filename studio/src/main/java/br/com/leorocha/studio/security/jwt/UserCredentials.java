package br.com.leorocha.studio.security.jwt;

import lombok.Data;

@Data
public class UserCredentials {

  private String username;
  private String password;

}