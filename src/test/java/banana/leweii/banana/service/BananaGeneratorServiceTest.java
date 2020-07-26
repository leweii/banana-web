package banana.leweii.banana.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BananaGeneratorServiceTest {

    @Autowired
    private BananaGeneratorService bananaGeneratorService;

    @Test
    public void generatorTest() {
        String testBanana = bananaGeneratorService.printBanana("Hello Github !");
        System.out.println(testBanana);
    }

    @Test
    public void generatorTestWithFont() {
        String testBanana = bananaGeneratorService.printBananaWithFont("Hello Github !", "ANSI_Shadow");
        System.out.println(testBanana);
    }
}