package ma.formations.soap.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {
    private Long id;
    private String description;
    private Double price;
    private Double quantity;
}
