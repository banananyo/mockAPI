package com.mvision.exampleapi.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mvisionmacmini on 8/16/2017 AD.
 */
@RestController
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/appinstall/list")
    public String appinstallList(
            @RequestParam(value = "name", required = false) String name
            , @RequestParam(value = "isActive", required = false) String isActive){
        System.out.println("name="+name+" isActive="+isActive);
        AppInstallResponseModel appinstall = new AppInstallResponseModel();
        AppInstallResponseModel appinstall2 = new AppInstallResponseModel("CAT","/yyy.jpg",2,2,0.0,"I");
        List<AppInstallResponseModel> appInstallResponseModels = new ArrayList<>();
        appInstallResponseModels.add(appinstall);
        appInstallResponseModels.add(appinstall2);
        return this.gsonBean.toJson(appInstallResponseModels);
    }
    @Autowired
    private Gson gsonBean;
}
class AppInstallResponseModel {
    private String name;
    private String imagePath;
    private Integer quota;
    private Integer point;
    private Double pricePerLoad;
    private String isActive;

    public AppInstallResponseModel(String name, String imagePath, Integer quota, Integer point, Double pricePerLoad, String isActive){
        this.name = name;
        this.imagePath = imagePath;
        this.quota = quota;
        this.point = point;
        this.pricePerLoad = pricePerLoad;
        this.isActive = isActive;
    }

    public AppInstallResponseModel(){
        this.setIsActive("A");
        this.setImagePath("/xxx.jpg");
        this.setName("GOT");
        this.setPoint(1);
        this.setPricePerLoad(10.0);
        this.setQuota(2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Double getPricePerLoad() {
        return pricePerLoad;
    }

    public void setPricePerLoad(Double pricePerLoad) {
        this.pricePerLoad = pricePerLoad;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}