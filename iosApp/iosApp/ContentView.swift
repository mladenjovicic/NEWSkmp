import SwiftUI
import Shared

struct ContentView: View {
    
    @State private var shouldOpenAbout = false
    
    var body: some View {
        NavigationStack{
            ArticlesScreen(viewModel: .init())
                .toolbar{
                    ToolbarItem{
                        Button {
                            shouldOpenAbout = true
                        } label: {
                            Label("About", systemImage: "info.cricle").labelStyle(.titleAndIcon)
                            
                        }
                        .popover(isPresented: $shouldOpenAbout){
                            AboutScreen()
                        }
                    }
                }
        }}
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
