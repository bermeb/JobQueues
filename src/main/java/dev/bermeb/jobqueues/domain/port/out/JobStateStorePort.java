package dev.bermeb.jobqueues.domain.port.out;

import dev.bermeb.jobqueues.domain.model.Job;

import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

public interface JobStateStorePort {

    Optional<Job.JobState> getJobState(UUID jobId);

    void setState(UUID jobId, Job.JobState state, Duration expiry);

    int getRetryCount(UUID jobId);

    void incrementRetryCount(UUID jobId, Duration expiry);

    void decrementRetryCount(UUID jobId);

}