package at.craftbytes.hypersistence

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HypersistenceUtilsBugApplicationTests(
    @param:Autowired private val repository: AccountRepository
) {

    @Test
    fun persistAccount() {
        val account = Account().apply { phones.add("123456789") }
        repository.save(account)
    }

}
