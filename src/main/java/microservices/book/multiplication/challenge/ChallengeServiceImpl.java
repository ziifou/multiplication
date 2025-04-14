package microservices.book.multiplication.challenge;

import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt) {
        int result = resultAttempt.factorA() * resultAttempt.factorB();
        boolean isCorrect = result == resultAttempt.guess();

        return new ChallengeAttempt(4554L,546L, resultAttempt.factorA(),resultAttempt.factorB(), resultAttempt.guess(), isCorrect);
    }
}
