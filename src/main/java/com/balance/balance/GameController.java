package com.balance.balance;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @GetMapping("/intro")
    public Map<String, Object> getIntroScene() {

        return Map.of(
            "sceneId", "dorm_room_day_1",
            "location", "Your Dorm Room",
            "day", 1,
            "description",
                "Morning sunlight enters your room. " +
                "Your phone vibrates beside your bed.",
            "hotspots", new String[] {
                "phone",
                "desk",
                "door"
            }
        );
    }
}
