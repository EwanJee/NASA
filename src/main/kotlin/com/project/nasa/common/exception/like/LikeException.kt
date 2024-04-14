package com.project.nasa.common.exception.like

import com.project.nasa.common.exception.BusinessException
import com.project.nasa.common.exception.ErrorCode

class LikeException(errorCode: ErrorCode) : BusinessException(errorCode)