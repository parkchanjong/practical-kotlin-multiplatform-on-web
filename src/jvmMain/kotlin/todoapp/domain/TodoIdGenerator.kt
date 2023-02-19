package todoapp.domain

import java.util.*

actual interface TodoIdGenerator {
    actual fun generateId() = TodoId(UUID.randomUUID().toString().lowercase());

}