package com.rawsaurus;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rawsaurus.enums.Distribution;
import com.rawsaurus.model.accounts.PlayerPersonalData;
import com.rawsaurus.model.accounts.Players;
import com.rawsaurus.model.accounts.PlayersAchievements;
import com.rawsaurus.model.accounts.PlayersVehicles;
import com.rawsaurus.model.clan_ratings.*;
import com.rawsaurus.model.clans.ClanDetailsInfo;
import com.rawsaurus.model.clans.ClanGlossary;
import com.rawsaurus.model.clans.ClanMemberDetails;
import com.rawsaurus.model.clans.Clans;
import com.rawsaurus.model.globalmap.*;
import com.rawsaurus.model.players_vehicles.VehicleAchievements;
import com.rawsaurus.model.players_vehicles.VehicleMasteryDistribution;
import com.rawsaurus.model.players_vehicles.VehicleStatistics;
import com.rawsaurus.model.status.CheckStatus;
import com.rawsaurus.model.status.ErrorStatus;
import com.rawsaurus.model.status.OkStatus;
import com.rawsaurus.model.status.OkStatusMap;
import com.rawsaurus.model.strongholds.ClanReserves;
import com.rawsaurus.model.strongholds.InformationAboutStronghold;
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
    int clanId = 500202208;


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

    public Map<String, PlayerPersonalData> getPlayerPersonalData(String accessToken, int accountId){
        String uri = requestBuilder("account/info/","&access_token=" + accessToken + "&account_id=" + accountId + "&extra=private.boosters%2C+private.garage%2C+private.grouped_contacts%2C+private.personal_missions%2C+private.rented%2C+statistics.epic%2C+statistics.fallout%2C+statistics.globalmap_absolute%2C+statistics.globalmap_champion%2C+statistics.globalmap_middle%2C+statistics.random%2C+statistics.ranked_10x10%2C+statistics.ranked_15x15%2C+statistics.ranked_battles%2C+statistics.ranked_battles_current%2C+statistics.ranked_battles_previous%2C+statistics.ranked_season_1%2C+statistics.ranked_season_2%2C+statistics.ranked_season_3%2C");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, PlayerPersonalData>>>(){}.getType();
        OkStatus<Map<String, PlayerPersonalData>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, PlayersAchievements> getPlayersAchievements(int accountId){
        String uri = requestBuilder("account/achievements/", "&account_id=" + accountId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, PlayersAchievements>>>(){}.getType();
        OkStatus<Map<String, PlayersAchievements>> status = gson.fromJson(response, statusType);

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


    public Map<String, List<VehicleStatistics>> getVehicleStatistics(int accountId){
        String uri = requestBuilder("tanks/stats/", "&account_id=" + accountId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, List<VehicleStatistics>>>>(){}.getType();
        OkStatus<Map<String, List<VehicleStatistics>>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, List<VehicleAchievements>> getVehicleAchievements(int accountId){
        String uri = requestBuilder("tanks/achievements/", "&account_id=" + accountId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, List<VehicleAchievements>>>>(){}.getType();
        OkStatus<Map<String, List<VehicleAchievements>>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public  VehicleMasteryDistribution getVehicleMasteryDistribution(Distribution distribution, int... percentile){
        StringBuilder sb = new StringBuilder();
        if(percentile.length > 2){
            for(int i = 0; i<percentile.length-1; i++){
                sb.append(percentile[i]).append(",");
            }
            sb.append(percentile[percentile.length-1]);
        }else{
            sb.append(percentile[0]);
        }

        System.out.println(Arrays.toString(percentile));
        String uri = requestBuilder("tanks/mastery/", "&distribution=" + distribution.getValue() + "&percentile=" + sb);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<VehicleMasteryDistribution>>(){}.getType();
        OkStatus< VehicleMasteryDistribution> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, InformationAboutStronghold> getInformationAboutStronghold(int clanId){
        String uri = requestBuilder("stronghold/claninfo/", "&clan_id=" + clanId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, InformationAboutStronghold>>>(){}.getType();
        OkStatus<Map<String, InformationAboutStronghold>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<ClanReserves> getClanReserves(String accessToken){
        String uri = requestBuilder("stronghold/clanreserves/", "&access_token=" + accessToken);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<ClanReserves>>>(){}.getType();
        OkStatus<List<ClanReserves>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<Fronts> getFronts(){
        String uri = requestBuilder("globalmap/fronts/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<Fronts>>>(){}.getType();
        OkStatus<List<Fronts>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<Provinces> getProvinces(String frontId){
        String uri = requestBuilder("globalmap/provinces/", "&front_id=" + frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<Provinces>>>(){}.getType();
        OkStatus<List<Provinces>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, ClanDetails> getClanDetails(int clanId){
        String uri = requestBuilder("globalmap/claninfo/", "&clan_id=" + clanId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, ClanDetails>>>(){}.getType();
        OkStatus<Map<String, ClanDetails>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, ClanProvinces> getClanProvinces(int clanId){
        String uri = requestBuilder("globalmap/clanprovinces/", "&clan_id=" + clanId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, ClanProvinces>>>(){}.getType();
        OkStatus<Map<String, ClanProvinces>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<ClanBattles> getClanBattles(int clanId){
        String uri = requestBuilder("globalmap/clanbattles/", "&clan_id=" + clanId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<ClanBattles>>>(){}.getType();
        OkStatus<List<ClanBattles>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<Seasons> getSeasons(){
        String uri = requestBuilder("globalmap/seasons/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<Seasons>>>(){}.getType();
        OkStatus<List<Seasons>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<ClanSeasonData> getClanSeasonData(int clanId, String seasonId, int vehicleLevel){
        String uri = requestBuilder("globalmap/seasonclaninfo/", "&clan_id=" + clanId + "&season_id=" + seasonId + "&vehicle_level=" + vehicleLevel);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<ClanSeasonData>>>(){}.getType();
        OkStatus<List<ClanSeasonData>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<AccountSeasonData> getAccountSeasonData(int accountId, String seasonId, int vehicleLevel){
        String uri = requestBuilder("globalmap/seasonaccountinfo/", "&account_id=" + accountId + "&season_id=" + seasonId + "&vehicle_level=" + vehicleLevel);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<AccountSeasonData>>>(){}.getType();
        OkStatus<List<AccountSeasonData>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<SeasonRating> getSeasonRating(String seasonId, int vehicleLevel){
        String uri = requestBuilder("globalmap/seasonrating/", "&season_id=" + seasonId + "&vehicle_level=" + vehicleLevel);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<SeasonRating>>>(){}.getType();
        OkStatus<List<SeasonRating>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<SeasonRating> getAdjacentSeasonClanRating(int clanId, String seasonId, int vehicleLevel){
        String uri = requestBuilder("globalmap/seasonratingneighbors/", "&clan_id=" + clanId + "&season_id=" + seasonId + "&vehicle_level=" + vehicleLevel);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<SeasonRating>>>(){}.getType();
        OkStatus<List<SeasonRating>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<Events> getEvents(){
        String uri = requestBuilder("globalmap/events/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<Events>>>(){}.getType();
        OkStatus<List<Events>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //untested. frontId should be a list
    public List<ClanEventInformation> getClanEventInformation(int clanId, String eventId, String frontId){
        String uri = requestBuilder("globalmap/eventclaninfo/", "&clan_id="+clanId+"&event_id="+eventId+"&front_id="+frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<ClanEventInformation>>>(){}.getType();
        OkStatus<List<ClanEventInformation>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //untested. frontId should be a list
    public List<AccountEventInformation> getAccountEventInformation(int accountId, String eventId, String frontId){
        String uri = requestBuilder("globalmap/eventaccountinfo/", "&account_id="+accountId+"&event_id="+eventId+"&front_id="+frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<AccountEventInformation>>>(){}.getType();
        OkStatus<List<AccountEventInformation>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //untested
    public List<EventAccountRating> getEventAccountRating(String eventId, String frontId){
        String uri = requestBuilder("globalmap/eventaccountratings/", "&event_id="+eventId+"&front_id="+frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<EventAccountRating>>>(){}.getType();
        OkStatus<List<EventAccountRating>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //untested
    public List<AdjacentPositionsInEventAccountRating> getAdjacentPositionsInEventAccountRating(int accountId, String eventId, String frontId){
        String uri = requestBuilder("globalmap/eventaccountratingneighbors/", "&account_id="+accountId+"&event_id="+eventId+"&front_id="+frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<AdjacentPositionsInEventAccountRating>>>(){}.getType();
        OkStatus<List<AdjacentPositionsInEventAccountRating>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //untested
    public List<EventClanRatings> getEventClanRatings(String eventId, String frontId){
        String uri = requestBuilder("globalmap/eventrating/", "&event_id="+eventId+"&front_id="+frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<EventClanRatings>>>(){}.getType();
        OkStatus<List<EventClanRatings>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //untested. frontId should be a list
    public List<AdjacentPositionInEventClanRating> getAdjacentPositionInEventClanRating(int clanId, String eventId, String frontId){
        String uri = requestBuilder("globalmap/eventratingneighbors/", "&clan_id="+clanId+"&event_id="+eventId+"&front_id="+frontId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<AdjacentPositionInEventClanRating>>>(){}.getType();
        OkStatus<List<AdjacentPositionInEventClanRating>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public MapStatus getMapStatus(){
        String uri = requestBuilder("globalmap/info/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<MapStatus>>(){}.getType();
        OkStatus<MapStatus> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public TypesOfRatings getTypesOfRatings(){
        String uri = requestBuilder("clanratings/types/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<TypesOfRatings>>(){}.getType();
        OkStatus<TypesOfRatings> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public DatesWithAvailableRatings getDatesWithAvailableRatings(){
        String uri = requestBuilder("clanratings/dates/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<DatesWithAvailableRatings>>(){}.getType();
        OkStatus<DatesWithAvailableRatings> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, ClanRatings> getClanRatings(int clanId){
        String uri = requestBuilder("clanratings/clans/", "&clan_id="+clanId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, ClanRatings>>>(){}.getType();
        OkStatus<Map<String, ClanRatings>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<AdjacentPositionsInClanRatings> getAdjacentPositionsInClanRatings(int clanId, String rankField){
        String uri = requestBuilder("clanratings/neighbors/", "&clan_id="+clanId+"&rank_field="+rankField);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<AdjacentPositionsInClanRatings>>>(){}.getType();
        OkStatus<List<AdjacentPositionsInClanRatings>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<TopClans> getTopClans(String rankField){
        String uri = requestBuilder("clanratings/top/", "&rank_field="+rankField);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<TopClans>>>(){}.getType();
        OkStatus<List<TopClans>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public List<Clans> getClans(){
        String uri = requestBuilder("clans/list/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<List<Clans>>>(){}.getType();
        OkStatus<List<Clans>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public Map<String, ClanDetailsInfo> getClanDetailsInfo(int clanId){
        String uri = requestBuilder("clans/info/", "&clan_id="+clanId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, ClanDetailsInfo>>>(){}.getType();
        OkStatus<Map<String, ClanDetailsInfo>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    //accountId should be a list
    public Map<String, ClanMemberDetails> getClanMemberDetails(int accountId){
        String uri = requestBuilder("clans/accountinfo/", "&account_id="+accountId);

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<Map<String, ClanMemberDetails>>>(){}.getType();
        OkStatus<Map<String, ClanMemberDetails>> status = gson.fromJson(response, statusType);

        return status.getData();
    }

    public ClanGlossary getClanGlossary(){
        String uri = requestBuilder("clans/glossary/", "");

        String response = newRequest(uri);

        checkStatus(response);

        Type statusType = new TypeToken<OkStatus<ClanGlossary>>(){}.getType();
        OkStatus<ClanGlossary> status = gson.fromJson(response, statusType);

        return status.getData();
    }
}
