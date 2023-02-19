package todoapp.domain

import todoapp.util.UUID

actual interface TodoIdGenerator {
    actual fun generateId() = TodoId(UUID.randomUUID().toString().lowercase());

}