package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.RestaurantDto;
import com.xworkz.tarun.exception.*;

public interface RestaurantService {
    boolean save(RestaurantDto restaurantDto) throws NameException, RatingException, OpeningTimeException, ClosingTimeException, FoodMenuException;
}
