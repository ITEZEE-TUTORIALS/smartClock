import SwiftUI
import Shared

struct ContentView: View {

    var body: some View {
            //BasicView()
            SmartClockView()
        }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct BasicView: View {
    @State private var showContent: Bool = false

    var body: some View {
        VStack {
            Button("Click me!") {
                withAnimation {
                    showContent.toggle()
                }
            }

            if showContent {
                VStack(spacing: 16) {
                    Image(systemName: "swift")
                        .font(.system(size: 200))
                        .foregroundColor(.accentColor)
                    Text("SwiftUI: \(Greeting().greet())")
                }
                .transition(.move(edge: .top).combined(with: .opacity))
            }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .padding()
    }
}

struct SmartClockView: View {
    @State private var currentTime: String = getCurrentTime()
    @State private var showContent: Bool = false
    @State private var quote = ""

    var body: some View {
        ZStack {
            Color.black.ignoresSafeArea()

            VStack(spacing: 16) {
                // Digital clock display
                Text(currentTime)
                    .font(.system(size: 64, weight: .bold, design: .monospaced))
                    .foregroundColor(.white)

                // Futuristic button
                Button(action: {
                    showContent.toggle()
                    if(showContent == true) {quote = Greeting().greet()}
                }) {
                    Text(showContent ? "Hide" : "Show Content")
                        .font(.system(size: 16))
                        .foregroundColor(.white)
                        .padding()
                        .background(Circle().fill(Color.gray))
                }

                if showContent {
                    VStack(spacing: 8) {
                        // Futuristic image placeholder
                        Image(systemName: "clock.fill")
                            .resizable()
                            .scaledToFit()
                            .frame(width: 100, height: 100)
                            .foregroundColor(.white)

                        // Additional content or greeting
                        Text(quote)
                            .font(.system(size: 24, weight: .medium))
                            .foregroundColor(.white)
                            .multilineTextAlignment(.center)
                            .padding()
                    }
                    .transition(.opacity)
                }
            }
        }
        .onAppear {
            startClock()
        }
    }

    // Clock update logic
    private func startClock() {
        Timer.scheduledTimer(withTimeInterval: 1.0, repeats: true) { _ in
            currentTime = SmartClockView.getCurrentTime()
        }
    }

    private static func getCurrentTime() -> String {
        let formatter = DateFormatter()
        formatter.dateFormat = "HH:mm:ss"
        return formatter.string(from: Date())
    }
}
