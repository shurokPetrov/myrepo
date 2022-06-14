package app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class User {
    @Id
    private Long id;
    @NonNull
    private String name;
}
