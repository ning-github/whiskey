/*
 * Copyright (c) 2015 Twitter, Inc. All rights reserved.
 * Licensed under the Apache License v2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.twitter.whiskey.futures;

import java.util.concurrent.Executor;

/**
 * @author Michael Schore
 */
public interface Listener<T> {
    public void onComplete(T result);
    public void onError(Throwable throwable);
    public Executor getExecutor();
}
