package at.craftbytes.hypersistence

import io.hypersistence.utils.hibernate.type.array.ListArrayType
import io.hypersistence.utils.hibernate.type.array.internal.AbstractArrayType.SQL_ARRAY_TYPE
import jakarta.annotation.Generated
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hibernate.annotations.Parameter
import org.hibernate.annotations.Type
import java.util.UUID
import java.util.UUID.randomUUID

@Entity
class Account {

    @Id
    @Generated
    var id: UUID = randomUUID()

    @Type(
        value = ListArrayType::class,
        parameters = [Parameter(name = SQL_ARRAY_TYPE, value = "text")]
    )
    var phones: MutableList<String> = mutableListOf()


}