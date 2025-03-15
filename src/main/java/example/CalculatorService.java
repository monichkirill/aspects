import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @ExecutionTime
    public int add(int a, int b) {
        return a + b;
    }

    @ExecutionTime
    public int subtract(int a, int b) {
        return a - b;
    }
}