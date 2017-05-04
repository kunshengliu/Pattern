package com.bjsxt.observer;

public class Client {
	public static void main(String[] args) {
		Watched subject = new WatchedImpl();
		
		Watcher w1 = new WatcherImpl();
		Watcher w2 = new WatcherImpl();
		Watcher w3 = new WatcherImpl();
		Watcher w4 = new WatcherImpl();
		
		subject.addWatcher(w1);
		subject.addWatcher(w2);
		subject.addWatcher(w3);
		subject.addWatcher(w4);

		subject.notifyWatchers("ºÃ¿ªÐÄ");
		
		
	}
}
