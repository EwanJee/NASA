package com.project.nasa.common.exception.news

import com.project.nasa.common.exception.BusinessException
import com.project.nasa.common.exception.ErrorCode

class NewsException(errorCode: ErrorCode) : BusinessException(errorCode)
