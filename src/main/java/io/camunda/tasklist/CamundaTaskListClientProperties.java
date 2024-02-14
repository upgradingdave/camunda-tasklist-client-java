package io.camunda.tasklist;

import io.camunda.common.auth.Authentication;
import java.time.Duration;

public class CamundaTaskListClientProperties {
  public static final String CAMUNDA_FORMS_PREFIX = "camunda-forms:bpmn:";

  public Authentication authentication;

  public String taskListUrl;

  public boolean defaultShouldReturnVariables;
  public boolean defaultShouldLoadTruncatedVariables;
  public boolean alwaysReconnect = false;
  public Duration cookieExpiration = Duration.ofMinutes(3);
}
