package com.github.ryno888.coreextensions.services

import com.intellij.openapi.project.Project
import com.github.ryno888.coreextensions.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
