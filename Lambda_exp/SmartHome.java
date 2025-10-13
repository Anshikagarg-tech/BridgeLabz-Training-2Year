@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        // Lambda for motion trigger
        LightAction motionTrigger = () -> System.out.println("Motion detected! Turning ON lights.");

        // Lambda for time-based trigger
        LightAction timeTrigger = () -> System.out.println("It's evening! Dimming lights to warm glow.");

        // Lambda for voice command trigger
        LightAction voiceCommand = () -> System.out.println("Voice command received! Switching to movie mode.");

        // Activate different light behaviors
        motionTrigger.activate();
        timeTrigger.activate();
        voiceCommand.activate();
    }
}
