package sjdm.gcu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import sjdm.gcu.model.OrderModel;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

/**
 * Controller class for handling test-related operations.
 */
@Controller
@RequestMapping("/app")
public class TestController {

    /**
     * Eureka client for service discovery.
     */
    @Autowired
    private EurekaClient eurekaClient;

    /**
     * Retrieves home page.
     *
     * @param model Model instance
     * @return String representing the view name
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Demo Microservices Application");
        return "home";
    }

    /**
     * Retrieves orders.
     *
     * @param model Model instance
     * @return String representing the view name
     */
    @GetMapping("/orders")
    public String getOrders(Model model) {
        // Look up the Host Name and Port for h
        Application application = eurekaClient.getApplication("order-test");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String hostname = instanceInfo.getHostName();
        int port = instanceInfo.getPort();

        // Get all the Users from the REST API
        String url = "http://" + hostname + ":" + port + "/service/orders";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<OrderModel>> rateResponse = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<OrderModel>>() {});
        List<OrderModel> orders = rateResponse.getBody();

        // Display the users
        model.addAttribute("title", "List of Orders");
        model.addAttribute("orders", orders);
        return "orders";
    }

    /**
     * Retrieves men's orders.
     *
     * @param model Model instance
     * @return String representing the view name
     */
    @GetMapping("/mens")
    public String getMensOrders(Model model) {
        // Look up the Host Name and Port for h
        Application application = eurekaClient.getApplication("order-test");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String hostname = instanceInfo.getHostName();
        int port = instanceInfo.getPort();

        // Get all the Users from the REST API
        String url = "http://" + hostname + ":" + port + "/service/mens";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<OrderModel>> rateResponse = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<OrderModel>>() {});
        List<OrderModel> orders = rateResponse.getBody();

        // Display the users
        model.addAttribute("title", "List of Orders");
        model.addAttribute("orders", orders);
        return "mens";
    }

    /**
     * Retrieves women's orders.
     *
     * @param model Model instance
     * @return String representing the view name
     */
    @GetMapping("/womens")
    public String getWomensOrders(Model model) {
        // Look up the Host Name and Port for h
        Application application = eurekaClient.getApplication("order-test");
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String hostname = instanceInfo.getHostName();
        int port = instanceInfo.getPort();

        // Get all the Users from the REST API
        String url = "http://" + hostname + ":" + port + "/service/womens";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<OrderModel>> rateResponse = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<OrderModel>>() {});
        List<OrderModel> orders = rateResponse.getBody();

        // Display the users
        model.addAttribute("title", "List of Orders");
        model.addAttribute("orders", orders);
        return "womens";
    }
}
