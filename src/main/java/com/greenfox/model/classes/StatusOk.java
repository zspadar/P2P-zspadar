package com.greenfox.model.classes;

import com.greenfox.model.interfaces.Status;

/**
 * Created by zsuzsanna.padar on 2017. 05. 22..
 */
public class StatusOk implements Status {
  private String status;

  public String getStatus() {
    return status;
  }

  public StatusOk() {
    this.status = "ok";
  }
}
