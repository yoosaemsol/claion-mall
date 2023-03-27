package claion.mall.domain;

import claion.mall.domain.*;
import claion.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private Long productId;
    private String productName;
    private Integer qty;
    private String address;
}
