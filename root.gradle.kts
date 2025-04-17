plugins {
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.shadow) apply false
    alias(libs.plugins.blossom) apply false
    alias(egt.plugins.multiversionRoot)
}

preprocess {
    val fabric12101 = createNode("1.21.1-fabric", 12101, "yarn")
    val forge12101 = createNode("1.21.1-forge", 12101, "yarn")
    val forge12001 = createNode("1.20.1-forge", 12001, "yarn")
    val fabric12001 = createNode("1.20.1-fabric", 12001, "yarn")
    val fabric11902 = createNode("1.19.2-fabric", 11902, "yarn")
    val forge11902 = createNode("1.19.2-forge", 11902, "yarn")

    fabric12101.link(forge12101)
    forge12101.link(forge12001)
    forge12001.link(fabric12001)
    fabric12001.link(fabric11902)
    fabric11902.link(forge11902)
}