package recruitment.domain;

import javax.persistence.*;

/**
 * <p>This class represents the different roles a person
 * can have in the application.</p>
 */
@Entity
@Table(name = "ROLE")
public class Role{
    private static final String SEQUENCE_NAME_KEY = "SEQ_NAME";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME_KEY)
    @SequenceGenerator(name = SEQUENCE_NAME_KEY, sequenceName = "Role_SEQUENCE")

    @Column(name = "ROLE_ID")
    private int roleId;

    @Column(name = "NAME")
    private String name;

    /**
     * Creates an instance of a role, based on given parameters.
     *
     * @param roleId The identifier of the role.
     * @param name The name of the role.
     */
    public Role(int roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    protected Role() {

    }
}
