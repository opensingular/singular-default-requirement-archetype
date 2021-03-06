#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${modulePrefixName}module.config;

import org.opensingular.requirement.studio.init.RequirementStudioAppInitializer;

public class ${moduleClassNamePrefix}ModuleInitializer implements RequirementStudioAppInitializer {

    @Override
    public String moduleCod() {
        return "${moduleStringIDName}";
    }

    @Override
    public String[] springPackagesToScan() {
        return new String[]{"${package}"};
    }

}
