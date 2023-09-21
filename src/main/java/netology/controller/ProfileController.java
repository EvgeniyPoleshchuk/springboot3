package netology.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import netology.systemProfile.SystemProfile;

@RestController
public class ProfileController {
    private SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("/")
    public String getProfile() {
        return profile.getProfile();
    }
}