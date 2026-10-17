import java.util.HashMap;

public class VMInstanceRegistry {

    HashMap<String, VMInstance> vmInstanceHashMap;


    public VMInstanceRegistry() {
        this.vmInstanceHashMap = new HashMap<>();
    }

    void addVMInstance(String key, VMInstance vmInstance)
    {
        vmInstanceHashMap.putIfAbsent(key, vmInstance);
    }

    VMInstance getVMInstance(String key)
    {
        if(vmInstanceHashMap.getOrDefault(key, null) == null)
            return null;

        return vmInstanceHashMap.get(key).clone();
    }
}
