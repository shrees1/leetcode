package ratelimitter.controller;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import java.time.Duration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerimeterController {
  private final Bucket bucket;
  public PerimeterController(){
    Bandwidth limit = Bandwidth.classic(15, Refill.greedy(15, Duration.ofMinutes(1)));
    this.bucket= Bucket4j.builder().addLimit(limit).build();
  }
@PostMapping(value="/api/v1/perimeter/square")
  public ResponseEntity <Perimeter> square(@RequestBody
    SquareDimensions dimensions ){
return null;
}
}
