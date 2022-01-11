package com.example.ItemCatalog_project;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;
import com.example.ItemCatalog_project.ItemRepository;
@Component
@EnableDiscoveryClient
public class ItemInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;
	

    ItemInitializer(ItemRepository itemRepository1) {
        this.itemRepository = itemRepository1;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> itemRepository.save(new Item(item)));

        itemRepository.findAll().forEach(System.out::println);
    }

}
