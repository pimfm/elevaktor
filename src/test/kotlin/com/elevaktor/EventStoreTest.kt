package com.elevaktor

import org.testcontainers.containers.FirestoreEmulatorContainer
import org.testcontainers.utility.DockerImageName
import kotlin.test.Test


class EventStoreTest {
    @Test
    fun `Can store and retrieve events`(){
        // Arrange
        val emulator = FirestoreEmulatorContainer(
            DockerImageName.parse("gcr.io/google.com/cloudsdktool/google-cloud-cli:441.0.0-emulators")
        )

        emulator.start()



        // Assert
        println()
    }
}