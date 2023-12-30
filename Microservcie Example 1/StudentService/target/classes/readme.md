# Resilience4j Properties for Circuit Breaker in Student Service

# Enable health indicator registration
resilience4j.circuitbreaker.instances.studentservice.registerHealthIndicator=true

# Buffer size for circuit breaker events
resilience4j.circuitbreaker.instances.studentservice.event-consumer-buffer-size=10

Let's simplify it:

Buffer size in Resilience4j's circuit breaker is like a memory that keeps track of
 recent events (successes or failures) when your application talks to a service.
 If too many recent events are failures, it might trigger a safety mechanism 
 (like temporarily stopping requests) to protect your application. The buffer
 size is how many of these events it remembers and considers before making a decision.










# Use count-based sliding window
resilience4j.circuitbreaker.instances.studentservice.slidingWindowType=COUNT_BASED


This line in Resilience4j means it's checking the recent actions your application took
(like requests to a service) and counting them to decide if everything is okay or if
there's a problem. It's a way of adapting quickly based on recent behavior.
 
 
# Set sliding window size to 5
resilience4j.circuitbreaker.instances.studentservice.slidingWindowSize=5

Resilience4j checks the last 5 actions to see if things are going smoothly or not.





# Set failure rate threshold to 50%
resilience4j.circuitbreaker.instances.studentservice.failureRateThreshold=50

If more than half of these recent actions fail, Resilience4j steps in to 
protect your app and takes a break.

# Wait duration in open state before transitioning to half-open (5 seconds)
resilience4j.circuitbreaker.instances.studentservice.waitDurationInOpenState=5s 

After the break, Resilience4j waits for 5 seconds before cautiously trying a few 
actions again. If they succeed, it resumes normal operations.




# Permitted number of calls in half-open state
resilience4j.circuitbreaker.instances.studentservice.permittedNumberOfCallsInHalfOpenState=3

Resilience4j checks 3 times to ensure things are okay before fully restarting.



# Enable automatic transition from open to half-open state
resilience4j.circuitbreaker.instances.studentservice.automaticTransitionFromOpenToHalfOpenEnabled=true


- This Resilience4j setting automatically moves from a protective "open" state to a cautious
 "half-open" state, aiding in a smoother recovery without manual intervention.



# Resilience4j Timeout Properties for Student Service

# Set timeout duration to 3 seconds
resilience4j.timelimiter.instances.studentservice.timeout-duration=3s

Limits the time for actions in "studentservice" to 3 seconds,
 ensuring quick responses and preventing delays.

# Resilience4j Retry Properties for Student Service

# Set maximum retry attempts to 3
resilience4j.retry.instances.studentservice.max-attempts=3

# Set wait duration between retries to 5 seconds
resilience4j.retry.instances.studentservice.wait-duration=5s
