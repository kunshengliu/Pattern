package com.bjsxt.observer;
/**
 * ±ªπ€≤Ï’ﬂ
 * @author liukunsheng
 *
 */
public interface Watched {
	void addWatcher(Watcher wathcer);
	void removeWatcher(Watcher watcher);
	void notifyWatchers(String str);
}
