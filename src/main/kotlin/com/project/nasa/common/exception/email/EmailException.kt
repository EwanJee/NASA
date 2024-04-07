package com.project.nasa.common.exception.email

import com.project.nasa.common.exception.BusinessException
import com.project.nasa.common.exception.ErrorCode

class EmailException(errorCode: ErrorCode) : BusinessException(errorCode) {
}