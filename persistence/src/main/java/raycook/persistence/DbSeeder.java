package raycook.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import raycook.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;

    @Autowired
    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        Hotel marriot = new Hotel("Marriot", 5, true);
        Hotel ibis = new Hotel("Ibis", 3, false);
        Hotel goldenTuplip = new Hotel("Golden Tulip", 4, true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(marriot);
        hotels.add(ibis);
        hotels.add(goldenTuplip);

        this.hotelRepository.saveAll(hotels);
    }
}
