package com.rawsaurus;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rawsaurus.model.accounts.Players;
import com.rawsaurus.model.accounts.PlayersVehicles;
import com.rawsaurus.model.status.CheckStatus;
import com.rawsaurus.model.status.ErrorStatus;
import com.rawsaurus.model.status.OkStatus;
import com.rawsaurus.model.status.OkStatusMap;
import com.rawsaurus.model.tankopedia.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AppRequest {

    private static final String BASE = "https://api.worldoftanks.eu/wot/";
    private String applicationId = "743f4a65d003daeb75b7ad2ac49ba541";
    private String stringRequest;
    int accountId = 562436344;


    private final HttpManager httpManager;
    private final Gson gson;

    public AppRequest(){
        httpManager = new HttpManager();
        gson = new Gson();
    }

    public AppRequest(String applicationId){
        this.applicationId = applicationId;
        httpManager = new HttpManager();
        gson = new Gson();
    }

    public void setApplicationId(String applicationId){
        this.applicationId = applicationId;
    }

    public String requestBuilder(String endpoint, String required){
        //dummy data
//        if(endpoint == null || endpoint.isEmpty()){
//            endpoint = "account/list/";
//        }
//        if(required == null || required.isEmpty()){
//            required = "&search=rawsaurus";
//        }

        stringRequest =  BASE + endpoint + "?application_id=" + applicationId + required;
        return BASE + endpoint + "?application_id=" + applicationId + required;
    }

    public String newRequest(String uri) {
        return httpManager.get(uri);
    }
//    Gson gson = new Gson();
//    CheckStatus checkStatus = gson.fromJson(res.body(), CheckStatus.class);
//        if(checkStatus.getStatus().equals("ok")){
//
//        //of course, I spent entire hour guessing how to make generics work with Gson before finding it in documentation in 2 minutes
//        Type statusType = new TypeToken<OkStatus<Players>>(){}.getType();
//        OkStatus<Players> status = gson.fromJson(res.body(), statusType);
//
//        System.out.println(status.getStatus() + "\n" + status.getMeta() + "\n" + Arrays.toString(status.getData()));
//        if(status.getStatus().equals("ok")){
//            for(Players player : status.getData()) {
//                System.out.println(player.getNickname() + "\n" + player.getAccount_id());
//            }
//        }
//    }else {
//        ErrorStatus errorStatus = gson.fromJson(res.body(), ErrorStatus.class);
//        System.out.println(checkStatus.getStatus());
//        System.out.println(errorStatus.getStatus() + "\n" +  errorStatus.getError().toString());
//    }

    public void checkStatus(String res){
        CheckStatus checkStatus = gson.fromJson(res, CheckStatus.class);
            if(!checkStatus.getStatus().equals("ok")){
                ErrorStatus errorStatus = gson.fromJson(res, ErrorStatus.class);
                System.out.println(checkStatus.getStatus());
                System.out.println(errorStatus.getStatus() + "\n" +  errorStatus.getError().toString());
            }
    }

    //1. create uri
    //2. make request
    //3. check status
    //4. extract data or throw error
    //5. return data

    public List<Players> getPlayers(String search){
        //dummy data
//        if(search == null || search.isEmpty()){
//            search = "rawsaurus";
//        }
        String uri = requestBuilder("account/list/", "&search=" + search);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<Players>>>(){}.getType();
        OkStatus<List<Players>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //getPlayersPersonalData(){}

    public Map<String, List<PlayersVehicles>> getPlayersVehicles(int accountId){
        String uri = requestBuilder("account/tanks/", "&account_id=" + accountId);

        String response = newRequest(uri);

        checkStatus(response);


        Type statusType = new TypeToken<OkStatus<Map<String, List<PlayersVehicles>>>>(){}.getType();
        OkStatus<Map<String, List<PlayersVehicles>>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //modules_tree not mapping correctly
    public Map<String, Vehicles> getVehicles(){
        String uri = requestBuilder("encyclopedia/vehicles/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, Vehicles>>>(){}.getType();
        OkStatus<Map<String, Vehicles>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, VehicleCharacteristics> getVehicleCharacteristics(int tankId){
        String uri = requestBuilder("encyclopedia/vehicleprofile/", "&tank_id=" + tankId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, VehicleCharacteristics>>>(){}.getType();
        OkStatus<Map<String, VehicleCharacteristics>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, Achievements> getAchievements(){
        String uri = requestBuilder("encyclopedia/achievements/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, Achievements>>>(){}.getType();
        OkStatus<Map<String, Achievements>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public TankopediaInformation getTankopediaInformation(){
        String uri = requestBuilder("encyclopedia/info/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<TankopediaInformation>>(){}.getType();
        OkStatus<TankopediaInformation> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, Maps> getMaps(){
        String uri = requestBuilder("encyclopedia/arenas/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, Maps>>>(){}.getType();
        OkStatus<Map<String, Maps>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, EquipmentAndConsumables> getEquipmentAndConsumables(){
        String uri = requestBuilder("encyclopedia/provisions/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, EquipmentAndConsumables>>>(){}.getType();
        OkStatus<Map<String, EquipmentAndConsumables>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, PersonalMissions> getPersonalMissions(){
        String uri = requestBuilder("encyclopedia/personalmissions/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, PersonalMissions>>>(){}.getType();
        OkStatus<Map<String, PersonalMissions>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, PersonalReserves> getPersonalReserves(){
        String uri = requestBuilder("encyclopedia/boosters/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, PersonalReserves>>>(){}.getType();
        OkStatus<Map<String, PersonalReserves>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, VehicleConfigurations[]> getVehicleConfigurations(int tankId){
        String uri = requestBuilder("encyclopedia/vehicleprofiles/", "&tank_id=" + tankId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, VehicleConfigurations[]>>>(){}.getType();
        OkStatus<Map<String, VehicleConfigurations[]>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, Modules> getModules(){
        //default_profile is an extra, without adding attribute will be null
        String uri = requestBuilder("encyclopedia/modules/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, Modules>>>(){}.getType();
        OkStatus<Map<String, Modules>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, Badges> getBadges(){
        String uri = requestBuilder("encyclopedia/badges/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, Badges>>>(){}.getType();
        OkStatus<Map<String, Badges>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, CrewQualifications> getCrewQualifications(){
        String uri = requestBuilder("encyclopedia/crewroles/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, CrewQualifications>>>(){}.getType();
        OkStatus<Map<String, CrewQualifications>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, CrewSkills> getCrewSkills(){
        String uri = requestBuilder("encyclopedia/crewskills/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, CrewSkills>>>(){}.getType();
        OkStatus<Map<String, CrewSkills>> status = gson.fromJson(response, statusType);

        return status.getData();
    }
}
