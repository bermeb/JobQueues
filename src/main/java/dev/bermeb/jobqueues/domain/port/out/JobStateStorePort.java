package dev.bermeb.jobqueues.domain.port.out;

import dev.bermeb.jobqueues.domain.model.Job;

import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

public interface JobStateStorePort {

    /**
     * Get the current state of a job
     * @param jobId The ID of the job
     * @return Current state
     */
    Optional<Job.JobState> getJobState(UUID jobId);

    /**
     * Set the current state of a job for a specific time
     * @param jobId The ID of the job
     * @param state The state
     * @param expiry The duration till the state expires
     */
    void setState(UUID jobId, Job.JobState state, Duration expiry);

    /**
     * Get the current retry count of a job
     * @param jobId The ID of the job
     * @return Retry count
     */
    int getRetryCount(UUID jobId);

    /**
     * Increment the current retry count of a job
     * @param jobId The ID of the job
     * @param expiry The duration till the increment expires
     */
    void incrementRetryCount(UUID jobId, Duration expiry);

    /**
     * Decrement the current retry count of a job
     * @param jobId The ID of the job
     */
    void decrementRetryCount(UUID jobId);

}