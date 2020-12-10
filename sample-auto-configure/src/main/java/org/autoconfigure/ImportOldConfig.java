package org.autoconfigure;

import org.example.OldConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ConditionalOnBean(TriggerBean.class)
@Configuration
@Import(OldConfig.class)
public class ImportOldConfig {

}
