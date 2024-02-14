package users.DTO;

import items.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import users.enums.Role;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdate {
    private Byte isDeleted;
    private String fullname;
    private String password;
    private Role role;
    private List<Item> items;
}
