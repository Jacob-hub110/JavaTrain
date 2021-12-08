package wzorce_projektowe.builder.Zad1;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class User {
    private String email;
    private String password;
    private String name;
    private LocalDateTime birthDate;
    private String pesel;
    private char sex;

    private User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", pesel=" + pesel +
                ", sex=" + sex +
                '}';
    }

    public static class Builder {
        private String email;
        private String password;
        private String name;
        private LocalDateTime birthDate;
        private String pesel;
        private char sex;

        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder birthDate(LocalDateTime birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder pesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder sex(char sex) {
            this.sex = sex;
            return this;
        }

        public User build() {
            User user = new User();
            user.email = this.email;
            user.password = this.password;
            user.birthDate = this.birthDate;
            user.name = this.name;
            user.pesel = this.pesel;
            user.sex = this.sex;
            return user;
        }
    }
}
