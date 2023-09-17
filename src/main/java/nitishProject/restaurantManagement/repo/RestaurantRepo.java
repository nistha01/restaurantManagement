package nitishProject.restaurantManagement.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitishProject.restaurantManagement.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class RestaurantRepo {
    @Autowired
    List<Restaurant> list;

    public List<Restaurant> getRestaurantList(){
        return list;
    }


}
