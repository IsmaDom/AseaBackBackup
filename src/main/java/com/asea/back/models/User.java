package com.asea.back.models;

import com.asea.back.token.Token;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "_user")
public class User implements UserDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "firstname")
  private String firstname;
  @Column(name = "lastname")
  private String lastname;
  @Column(name = "email")
  private String email;
  @Column(name = "password")
  private String password;

  @Enumerated(EnumType.STRING)
  private com.asea.back.models.Roles role;

//    public List<Token> getTokens() {
//        return tokens;
//    }
//
//    public void setTokens(List<Token> tokens) {
//        this.tokens = tokens;
//    }
//
//    @OneToMany(mappedBy = "user")
//  private List<Token> tokens;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return role.getAuthorities();
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return email;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Entity
  @Table(name = "roles")
  public static class Roles {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "id", nullable = false)
      private Integer id;

      @Column(name = "name", length = 20)
      private String name;

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public Integer getId() {
          return id;
      }

      public void setId(Integer id) {
          this.id = id;
      }
  }
}
