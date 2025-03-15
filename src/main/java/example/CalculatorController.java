import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add")
    public int add() {
        return calculatorService.add(999, 111);
    }

    @GetMapping("/subtract")
    public int subtract() {
        return calculatorService.subtract(888, 222);
    }
}