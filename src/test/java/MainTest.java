import com.fastcampus.springpractice.Main;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void main(){
        //Given
        String[] args = {"3","2","1"};
        //When&Then
        Main.main(args);
    }
}