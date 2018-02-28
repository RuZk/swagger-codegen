package io.swagger.codegen.languages;

import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.DefaultGenerator;
import io.swagger.codegen.config.CodegenConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.swagger.codegen.config.CodegenConfiguratorUtils.*;

public class ScalaGatlingCodegenTest {

    @Test
    public void testSanitizeTag() throws Exception {
        CodegenConfigurator configurator = new CodegenConfigurator();
        configurator.setLang("scala-gatling");
        configurator.setApiPackage("com.telenordigital.privacy.loadtest.swagger.serviceapi.api");
        configurator.setModelPackage("com.telenordigital.privacy.loadtest.swagger.serviceapi.model");
        configurator.setInvokerPackage("com.telenordigital.privacy.loadtest.swagger.serviceapi");
        configurator.setInputSpec("/Users/akatsyuba/Documents/load-test/swagger-service-v1.json");
        configurator.setOutputDir("/Users/akatsyuba/projects/privacy-load-test-swagger-scala-gatling");

        applySystemPropertiesKvpList(new ArrayList<String>(), configurator);
        applyInstantiationTypesKvpList(new ArrayList<String>(), configurator);
        applyImportMappingsKvpList(new ArrayList<String>(), configurator);
        applyTypeMappingsKvpList(new ArrayList<String>(), configurator);
        applyAdditionalPropertiesKvpList(new ArrayList<String>(), configurator);
        applyLanguageSpecificPrimitivesCsvList(new ArrayList<String>(), configurator);
        applyReservedWordsMappingsKvpList(new ArrayList<String>(), configurator);
        final ClientOptInput clientOptInput = configurator.toClientOptInput();

        new DefaultGenerator().opts(clientOptInput).generate();
    }
}
