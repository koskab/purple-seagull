package items.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCreate {
    private LocalDate deadlineDate;
    private String name;
    private Integer count = 0;
    private BigDecimal price = BigDecimal.valueOf(0);
}
