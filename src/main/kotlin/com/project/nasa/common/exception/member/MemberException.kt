package com.project.nasa.common.exception.member

import com.project.nasa.common.exception.BusinessException
import com.project.nasa.common.exception.ErrorCode

class MemberException(errorCode: ErrorCode) : BusinessException(errorCode)