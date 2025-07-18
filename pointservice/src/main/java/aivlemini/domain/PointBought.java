package aivlemini.domain;

import aivlemini.domain.*;
import aivlemini.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PointBought extends AbstractEvent {

    private Long id;
    private Integer point;
    private ApplyingId applyingId;
    private UserId userId;

    public PointBought(Point aggregate) {
        super(aggregate);
    }

    public PointBought() {
        super();
    }
}
//>>> DDD / Domain Event
