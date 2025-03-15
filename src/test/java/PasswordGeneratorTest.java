import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

	@Test
	void testPasswordLength() {
		String password = PasswordGenerator.generate(12, true, true, true);
		assertEquals(12, password.length(), "La contraseña generada debe tener 12 caracteres");
	}

	@Test
	void testPasswordNotEmpty() {
		String password = PasswordGenerator.generate(8, false, false, false);
		assertFalse(password.isEmpty(), "La contraseña no debe estar vacía");
	}

}
