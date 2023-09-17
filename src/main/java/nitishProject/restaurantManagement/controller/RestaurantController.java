package nitishProject.restaurantManagement.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitishProject.restaurantManagement.entity.Restaurant;
import nitishProject.restaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }
    @GetMapping("restaurants")
    public List<Restaurant> getRestaurant(){
        return restaurantService.getRestaurant();
    }
    @DeleteMapping("restaurant/id/{id}")
    public String deleteRestaurantById(@PathVariable Integer id){
        return restaurantService.deleteById(id);
    }
    @PutMapping("restaurant/id/{id}")
    public String updateRestaurantDetails(@PathVariable Integer id,@RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurant(restaurant,id);
    }
    @GetMapping("restaurant/id/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id){
        return restaurantService.getRestaurantById(id);
    }
}
