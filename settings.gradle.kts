rootProject.name = "BanManager"

include(":BanManagerCommon")
include(":BanManagerLibs")
include(":BanManagerVelocity")

project(":BanManagerCommon").projectDir = file("common")
project(":BanManagerLibs").projectDir = file("libs")
project(":BanManagerVelocity").projectDir = file("velocity")
