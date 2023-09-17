package nitishProject.restaurantManagement;

import nitishProject.restaurantManagement.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanFactory {

    @Bean
    public List<Restaurant> getList(){
        return new ArrayList<>();
    }
}
