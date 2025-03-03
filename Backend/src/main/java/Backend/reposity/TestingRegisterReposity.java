package Backend.reposity;

import Backend.model.TestingRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestingRegisterReposity extends JpaRepository<TestingRegister,Long> {

     TestingRegister getTestingRegisterByFullNameAndEmail(String fullName, String email);
}
