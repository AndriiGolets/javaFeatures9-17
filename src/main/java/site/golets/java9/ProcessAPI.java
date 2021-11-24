package site.golets.java9;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessAPI {

    public static void main(String[] args) {

        // The process API has been improved for controlling and managing operating-system processes.

        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();
        ProcessHandle.Info procInfo = self.info();

        // Process Info
        Optional<String[]> procInfoArgs = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        // Destroying processes

        ProcessHandle.current().children().forEach(ProcessHandle::destroy);

    }

}
