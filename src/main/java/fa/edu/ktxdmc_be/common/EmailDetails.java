package fa.edu.ktxdmc_be.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailDetails {
    private String recipient;
    
    private String msgBody;
    
    private String subject;
    
    private String attachment;
}
