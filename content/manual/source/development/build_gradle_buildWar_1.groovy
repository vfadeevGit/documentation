task buildWar(type: CubaWarBuilding) {
    coreProject = project(':app-core')
    webProject = project(':app-web')
    appName = 'app'
    appHome = '..'
    webXml = "${project(':app-web').projectDir}/web/WEB-INF/single-war-web.xml"
}