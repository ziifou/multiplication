package microservices.book.multiplication.challenge;

import microservices.book.multiplication.user.User;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt) {
        int result = resultAttempt.factorA() * resultAttempt.factorB();
        boolean isCorrect = result == resultAttempt.guess();

        return new ChallengeAttempt(4554L, new User(10L, "john"), resultAttempt.factorA(),resultAttempt.factorB(), resultAttempt.guess(), isCorrect);
    }
}
