package com.zjpicc.api.insurance.business;

public interface Handler {
    public void asyncHandler(Object object);
    public Object syncHandler(Object object);
}
