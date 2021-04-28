package com.dfsek.tectonicgradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class TectonicGradle : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.create("generateDocs", TectonicDocTask::class.java) {

        }
    }
}