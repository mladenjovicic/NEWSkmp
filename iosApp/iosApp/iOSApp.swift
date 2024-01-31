import SwiftUI
import Shared

@main
struct iOSApp: App {
    
    init() {
        KoinInitalizerKt.doInitKoin()
        }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
