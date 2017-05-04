package com.bjsxt.observer;

public class WatcherImpl implements Watcher{

	@Override
	public void update(String str) {
		System.out.println(str);
	}
}
