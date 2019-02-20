package recruitment.domain;

import javax.persistence.*;
import java.sql.*;

/**
 * <p>This class represents availabilities connected to specified persons.</p>
 */
@Entity
@Table(name = "AVAILABILITY")
public class Availability{
    private static final String SEQUENCE_NAME_KEY = "SEQ_NAME";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME_KEY)
    @SequenceGenerator(name = SEQUENCE_NAME_KEY, sequenceName = "AVAILABILITY_SEQUENCE")

    @Column(name = "AVAILABILITY_ID")
    private int availabilityId;

    @Column(name = "PERSON_ID")
    private int pid;

    @Column(name = "FROM_DATE")
    private Date fromDate;

    @Column(name = "TO_DATE")
    private Date toDate;

    /**
     * Creates a new instance of an availability for a certain person.
     *
     * @param availabilityId The id of the instance.
     * @param pid The id of the person relating to the specified instance.
     * @param fromDate The start date of the specified instance.
     * @param toDate The end date of the specified instance.
     */
    public Availability(int availabilityId, int pid, Date fromDate, Date toDate) {
        this.availabilityId = availabilityId;
        this.pid = pid;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    protected Availability() {

    }
}

