import java.util.ArrayList;
import java.util.List;

public class VMInstance implements Prototype<VMInstance>{
    private String os;
    private String runtime;
    private String monitoringAgent;
    private String hostname;
    private String ipAddress;
    private List<String> installedPackages;


    public VMInstance(String os, String runtime, String monitoringAgent, String hostname, String ipAddress) {
        this.os = os;
        this.runtime = runtime;
        this.monitoringAgent = monitoringAgent;
        this.hostname = hostname;
        this.ipAddress = ipAddress;
        this.installedPackages = new ArrayList<>();
    }

    public VMInstance(VMInstance other) {
        this.os = other.os;
        this.runtime = other.runtime;
        this.monitoringAgent = other.monitoringAgent;
        this.ipAddress = other.ipAddress;
        this.hostname = other.hostname;
        this.installedPackages = new ArrayList<>(other.installedPackages);
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setMonitoringAgent(String monitoringAgent) {
        this.monitoringAgent = monitoringAgent;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOs() {
        return os;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getMonitoringAgent() {
        return monitoringAgent;
    }

    public String getHostname() {
        return hostname;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public List<String> getInstalledPackages() {
        return new ArrayList<>(installedPackages);
    }

    public void addPackage(String pkg) {
        installedPackages.add(pkg);
    }

    @Override
    public VMInstance clone() {
        return new VMInstance(this);
    }
}
