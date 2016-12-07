package com.netflix.spinnaker.clouddriver.limits

import groovy.transform.Canonical
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties('')
class ServiceLimitConfiguration {

  @Canonical
  static class ServiceLimits {
    Integer rateLimit
  }

  @NestedConfigurationProperty
  final Map<String, ServiceLimits> serviceLimits = new HashMap<>()
}
