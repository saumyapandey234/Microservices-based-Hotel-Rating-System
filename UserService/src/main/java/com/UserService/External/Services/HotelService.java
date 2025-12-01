package com.UserService.External.Services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "HOTELSERVICE")
public interface HotelService {

}
