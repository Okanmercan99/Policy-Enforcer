package TeamAware.Policy.Enforcer.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TeamAware.Policy.Enforcer.module.Message;

// REST Endpoint controller.
// You modify endpoints from here.

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ResourceController {
    
    //ADS Data
    @GetMapping("/ADSData")
    public Message readADSData() {
        return new Message("Read ADS Data");
    }

    @PostMapping("/ADSData")
    public Message createADSData() {
        return new Message("Create ADS Data");
    }
    @PutMapping("/ADSData")
    public Message updateADSData() {
        return new Message("Update ADS Data");
    }

    @DeleteMapping("/ADSData")
    public Message deleteADSData() {
        return new Message("Delete ADS Data");
    }

    //AMS Data
    @GetMapping("/AMSData")
    public Message readAMSData() {
        return new Message("Read AMS Data");
    }

    @PostMapping("/AMSData")
    public Message createAMSData() {
        return new Message("Create AMS Data");
    }
    @PutMapping("/AMSData")
    public Message updateAMSData() {
        return new Message("Update AMS Data");
    }

    @DeleteMapping("/AMSData")
    public Message deleteAMSData() {
        return new Message("Delete AMS Data");
    }

    //CDS Data
    @GetMapping("/CDSData")
    public Message readCDSData() {
        return new Message("Read CDS Data");
    }

    @PostMapping("/CDSData")
    public Message createCDSData() {
        return new Message("Create CDS Data");
    }
    @PutMapping("/CDSData")
    public Message updateCDSData() {
        return new Message("Update CDS Data");
    }

    @DeleteMapping("/CDSData")
    public Message deleteCDSData() {
        return new Message("Delete CDS Data");
    }

    //CICIS Data
    @GetMapping("/CICISData")
    public Message readCICISData() {
        return new Message("Read CICIS Data");
    }

    @PostMapping("/CICISData")
    public Message createCICISData() {
        return new Message("Create CICIS Data");
    }
    @PutMapping("/CICISData")
    public Message updateCICISData() {
        return new Message("Update CICIS Data");
    }

    @DeleteMapping("/CICISData")
    public Message deleteCICISData() {
        return new Message("Delete CICIS Data");
    }

    //COILS Data
    @GetMapping("/COILSData")
    public Message readCOILSData() {
        return new Message("Read COILS Data");
    }

    @PostMapping("/COILSData")
    public Message createCOILSData() {
        return new Message("Create COILS Data");
    }
    @PutMapping("/COILSData")
    public Message updateCOILSData() {
        return new Message("Update COILS Data");
    }

    @DeleteMapping("/COILSData")
    public Message deleteCOILSData() {
        return new Message("Delete COILS Data");
    }

    //Docker Image 
    @GetMapping("/DockerImage")
    public Message readDockerImage() {
        return new Message("Read Docker Image");
    }

    @PostMapping("/DockerImage")
    public Message createDockerImage() {
        return new Message("Create Docker Image");
    }
    @PutMapping("/DockerImage")
    public Message updateDockerImage() {
        return new Message("Update Docker Image");
    }

    @DeleteMapping("/DockerImage")
    public Message deleteDockerImage() {
        return new Message("Delete Docker Image");
    }

    //IMS Data
    @GetMapping("/IMSData")
    public Message readIMSData() {
        return new Message("Read IMS Data");
    }

    @PostMapping("/IMSData")
    public Message createIMSData() {
        return new Message("Create IMS Data");
    }
    @PutMapping("/IMSData")
    public Message updateIMSData() {
        return new Message("Update IMS Data");
    }

    @DeleteMapping("/IMSData")
    public Message deleteIMSData() {
        return new Message("Delete IMS Data");
    }

    //Kubernetes Deployment Description 
    @GetMapping("/KubernetesDeploymentDescription")
    public Message readKubernetesDeploymentDescription() {
        return new Message("Read Kubernetes Deployment Description");
    }

    @PostMapping("/KubernetesDeploymentDescription")
    public Message createKubernetesDeploymentDescription() {
        return new Message("Create Kubernetes Deployment Description");
    }
    @PutMapping("/KubernetesDeploymentDescription")
    public Message updateKubernetesDeploymentDescription() {
        return new Message("Update Kubernetes Deployment Description");
    }

    @DeleteMapping("/KubernetesDeploymentDescription")
    public Message deleteKubernetesDeploymentDescription() {
        return new Message("Delete Kubernetes Deployment Description");
    }

    //Log 
    @GetMapping("/Log")
    public Message readLog() {
        return new Message("Read Log");
    }

    @PostMapping("/Log")
    public Message createLog() {
        return new Message("Create Log");
    }
    @PutMapping("/Log")
    public Message updateLog() {
        return new Message("Update Log");
    }

    @DeleteMapping("/Log")
    public Message deleteLog() {
        return new Message("Delete Log");
    }

    //Operational Data
    @GetMapping("/OperationalData")
    public Message readOperationalData() {
        return new Message("Read Operational Data");
    }

    @PostMapping("/OperationalData")
    public Message createOperationalData() {
        return new Message("Create Operational Data");
    }
    @PutMapping("/OperationalData")
    public Message updateOperationalData() {
        return new Message("Update Operational Data");
    }

    @DeleteMapping("/OperationalData")
    public Message deleteOperationalData() {
        return new Message("Delete Operational Data");
    }

    //Platform Data
    @GetMapping("/PlatformData")
    public Message readPlatformData() {
        return new Message("Read Platform Data");
    }

    @PostMapping("/PlatformData")
    public Message createPlatformData() {
        return new Message("Create Platform Data");
    }
    @PutMapping("/PlatformData")
    public Message updatePlatformData() {
        return new Message("Update Platform Data");
    }

    @DeleteMapping("/PlatformData")
    public Message deletePlatformData() {
        return new Message("Delete Platform Data");
    }

    //VSAS Data
    @GetMapping("/VSASData")
    public Message readVSASData() {
        return new Message("Read VSAS Data");
    }

    @PostMapping("/VSASData")
    public Message createVSASData() {
        return new Message("Create VSAS Data");
    }
    @PutMapping("/VSASData")
    public Message updateVSASData() {
        return new Message("Update VSAS Data");
    }

    @DeleteMapping("/VSASData")
    public Message deleteVSASData() {
        return new Message("Delete VSAS Data");
    }
}
