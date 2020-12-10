package org.autoconfigure;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ImportOldConfig.class)
public class SampleAutoConfiguration {


}
