package com.bjsxt.observer;
/**
 * ���۲���
 * @author liukunsheng
 *
 */
public interface Watched {
	void addWatcher(Watcher wathcer);
	void removeWatcher(Watcher watcher);
	void notifyWatchers(String str);
}
