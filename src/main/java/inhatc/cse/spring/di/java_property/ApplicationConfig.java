package inhatc.cse.spring.di.java_property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {

    @Value(value = "${admin.id}")
    private String adminId;
    @Value("${admin.pw}")
    private String adminPw;
    @Value(value = "${sub_admin.id}")
    private String subId;
    @Value("${sub_admin.pw}")
    private String subPw;

    @Bean
    public static PropertySourcesPlaceholderConfigurer Properties(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new Resource[2];
        resources[0] = new ClassPathResource("java_property/admin.properties");
        resources[1] = new ClassPathResource("java_property/sub_admin.properties");
        configurer.setLocations(resources);
        return configurer;
    }

    @Bean
    public AdminConnect adminConfig(){
        AdminConnect adminConnect = new AdminConnect();
        adminConnect.setAdminId(adminId);
        adminConnect.setAdminPw(adminPw);
        adminConnect.setSubId(subId);
        adminConnect.setSubPw(subPw);

        return adminConnect;
    }
}
