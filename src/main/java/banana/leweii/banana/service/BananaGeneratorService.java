package banana.leweii.banana.service;

import io.leego.banana.BananaUtils;
import org.springframework.stereotype.Component;

@Component
public class BananaGeneratorService {

    public String printBanana(String input) {
        return BananaUtils.bananaify(input);
    }

    public String printBananaWithFont(String input, String fount) {
        return BananaUtils.bananaify(input, fount);
    }

}
