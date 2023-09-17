package nitishProject.restaurantManagement.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitishProject.restaurantManagement.entity.Restaurant;
import nitishProject.restaurantManagement.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public String addRestaurant(Restaurant restaurant) {
        restaurantRepo.getRestaurantList().add(restaurant);
        return "restaurant added";
    }

    public List<Restaurant> getRestaurant() {
        return restaurantRepo.getRestaurantList();
    }

    public String deleteById(Integer id) {
        for(Restaurant resto:restaurantRepo.getRestaurantList()){
            if(resto.getId().equals(id)){
                restaurantRepo.getRestaurantList().remove(resto);
                return "restaurant deleted from data base";
            }
        }
        return "invalid id";


    }

    public String updateRestaurant(Restaurant restaurant,Integer id) {
        for(Restaurant resto:restaurantRepo.getRestaurantList()){
            if(resto.getId().equals(id)){
                resto.setId(restaurant.getId());
                resto.setAddress(restaurant.getAddress());
                resto.setName(restaurant.getName());
                resto.setSpeciality(restaurant.getSpeciality());
                resto.setDishType(restaurant.getDishType());
                resto.setStarRating(restaurant.getStarRating());
                resto.setTotalStaff(restaurant.getTotalStaff());
                return "Restaurant details updated";
            }

        }
        return "opps!!! not a valid ID";
    }

    public Restaurant getRestaurantById(Integer id) {
        for(Restaurant resto:restaurantRepo.getRestaurantList()){
            if(resto.getId().equals(id)) {
                return resto;
            }
        }
        return null;
    }
}
