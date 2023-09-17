package nitishProject.restaurantManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivilegedAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private Integer id;
    private String name;
    private String address;
    private String speciality;
    private String number;
    private Integer totalStaff;
    private Dish dishType;
    private Star starRating;

}
