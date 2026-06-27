package dev.bermeb.jobqueues.domain.model;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

public record Job (
        UUID jobId,
        String type,
        Map<String, Object> data,
        Instant createdAt
) {

    public Job {
        data = Map.copyOf(data);
    }

    public enum JobState {
        PENDING,
        PROCESSING,
        COMPLETED,
        RETRY,
        FAILED
    }

    public record RetryConfig(
            int maxAttempts,
            long delayedSeconds,
            double attemptMultiplier
    ) {}
}
