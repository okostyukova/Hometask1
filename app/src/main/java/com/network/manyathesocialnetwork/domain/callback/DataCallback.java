package com.network.manyathesocialnetwork.domain.callback;

import java.util.List;

public interface DataCallback<T> {
    void onSuccess(List<T> list);
    void onSuccessOneObject(T obj);
    void onError(String message);
}
