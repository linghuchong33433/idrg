package com.fartecx.service;

import com.fartecx.Base.BaseService;
import com.fartecx.config.ExecutionResult;
import com.fartecx.pojo.BatchPhaseEntity;
import com.sun.xml.internal.rngom.parse.host.Base;

public interface BpsService extends BaseService<BatchPhaseEntity> {
    ExecutionResult findbatchPhase();
}
