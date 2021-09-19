package gilleycro.softwarelse.se.showproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name="users")
public class User implements Serializable {

    public User(String fname) {
        this.fname = fname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_sequence", allocationSize = 1)
    private Long id;

    private String fname;
    private String lname;
    private int age;

}
