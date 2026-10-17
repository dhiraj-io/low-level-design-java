public class client {

//    static void createCopy(VMInstance vmInstance)
//    {
//        VMInstance copy = null;
//        if(vmInstance != null) {
//            if (vmInstance instanceof VMInstance) {
//                copy = new VMInstance(vmInstance);
//            } else if (vmInstance instanceof GpuVMInstance) {
//                copy = new GpuVMInstance((GpuVMInstance)vmInstance);
//            }
//        }
//    }

    static void fillRegistry(VMInstanceRegistry vmInstanceRegistry)
    {
        VMInstance ubuntuInstance = new VMInstance("Ubuntu 22.4", "Docker 1.2", "Datadog",
                null, null);
        vmInstanceRegistry.addVMInstance("backend-server-v3", ubuntuInstance);

        VMInstance gpuInstance = new GpuVMInstance("Ubuntu 22.4", "Docker 1.2", "Datadog",
                "scaler.com", "123.41.23.12", "Nvidia");
        vmInstanceRegistry.addVMInstance("gpu-instance-v2", gpuInstance);
    }
   public static void main(String[] args) {
//        VMInstance instance1 = new VMInstance("Ubuntu 22.4", "Docker 1.2", "Datadog",
//                "scaler.com", "123.41.23.12");

//        VMInstance copyInstance = new VMInstance(instance1);
//       copyInstance.setHostname("instagram.com");
//       copyInstance.setIpAddress("123.45.56");

//       VMInstance copyInstance = instance1.clone();
//
//
//       GpuVMInstance gpuVMInstance = new GpuVMInstance("Ubuntu 22.4", "Docker 1.2", "Datadog",
//               "scaler.com", "123.41.23.12", "Nvidia");
//
//       VMInstance gpuVMInstance1 = gpuVMInstance.clone();

       VMInstanceRegistry vmInstanceRegistry = new VMInstanceRegistry();
       fillRegistry(vmInstanceRegistry);

       VMInstance vmInstance =vmInstanceRegistry.getVMInstance("backend-server-v3");
       vmInstance.setIpAddress("123.1.1.1");
       vmInstance.setHostname("scaler.com");

       VMInstance vmInstance1 =vmInstanceRegistry.getVMInstance("gpu-instance-v2");
       vmInstance1.setIpAddress("2345");
       vmInstance1.setHostname("wggh");

       // new template addition
       VMInstance macInstance = new VMInstance("MacOS 19.23", "Docker 1.2", "Datadog",
               null, null);
       vmInstanceRegistry.addVMInstance("mac-server-v1", macInstance);

    }
}
