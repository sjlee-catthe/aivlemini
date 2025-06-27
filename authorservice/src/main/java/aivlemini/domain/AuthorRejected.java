package aivlemini.domain;

import aivlemini.domain.*;
import aivlemini.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AuthorRejected extends AbstractEvent {

    private Long authorId;
    private Boolean isApprove;
    private String authorName;
    private String email;
    private String introduction;
    private String portfolioUrl;
    private Boolean isApproved;

    public AuthorRejected(Author aggregate) {
        super(aggregate);
    }

    public AuthorRejected() {
        super();
    }
}
//>>> DDD / Domain Event
