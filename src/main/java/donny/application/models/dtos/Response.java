package donny.application.models.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@Accessors(chain = true)
public class Response<T> {
    private String message = "";
    private Collection<T> data = Collections.emptyList();
}
