package microservices.book.multiplication.challenge;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;
import microservices.book.multiplication.user.User;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Data
@NoArgsConstructor
public class ChallengeAttempt {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}
