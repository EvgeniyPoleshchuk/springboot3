package netology.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import netology.systemProfile.DevProfile;
import netology.systemProfile.ProductionProfile;
import netology.systemProfile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(prefix ="profile",name = "dev",havingValue = "true",matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }


    @Bean
    @ConditionalOnProperty(prefix = "profile",name = "dev",havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
