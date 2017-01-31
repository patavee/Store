package com.nytimes.android.external.store.base;


import com.nytimes.android.external.store.base.impl.BarCode;

import javax.annotation.Nonnull;

import rx.Observable;

public interface DiskWrite<Raw> {
    /**
     * @param barCode to use to get data from persister
     *                If data is not available implementer needs to
     *                either return Observable.empty or throw an exception
     */
    @Nonnull
    Observable<Boolean> write(BarCode barCode, Raw raw);
}
