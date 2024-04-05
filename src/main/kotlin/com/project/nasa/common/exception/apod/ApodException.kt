package com.project.nasa.common.exception.apod

import com.project.nasa.common.exception.BusinessException
import com.project.nasa.common.exception.ErrorCode

class ApodException(errorCode: ErrorCode) : BusinessException(errorCode)