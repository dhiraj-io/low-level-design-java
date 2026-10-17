public class GpuVMInstance extends VMInstance{

    private String gpuType;
    public GpuVMInstance(String os, String runtime, String monitoringAgent, String hostname, String ipAddress, String gpuType) {
        super(os, runtime, monitoringAgent, hostname, ipAddress);
        this.gpuType = gpuType;
    }

    public String getGpuType() {
        return gpuType;
    }

    public GpuVMInstance(GpuVMInstance other) {
        this(other.getOs(), other.getRuntime(), other.getMonitoringAgent(), other.getHostname(), other.getIpAddress(),
        other.getGpuType());
    }

    @Override
    public GpuVMInstance clone() {
        return new GpuVMInstance(this);
    }
}
