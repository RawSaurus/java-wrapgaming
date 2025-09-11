package com.rawsaurus;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rawsaurus.enums.Distribution;
import com.rawsaurus.model.accounts.Players;
import com.rawsaurus.model.accounts.PlayersVehicles;
import com.rawsaurus.model.status.CheckStatus;
import com.rawsaurus.model.status.ErrorStatus;
import com.rawsaurus.model.status.OkStatus;
import com.rawsaurus.model.status.OkStatusMap;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        AppRequest appRequest = new AppRequest();
//        System.out.println(appRequest.getProvinces("season_22_eu"));
//        System.out.println(appRequest.getFronts());
//        System.out.println(appRequest.getClanReserves("b02232ac47788d203c7f45ecaa4806d697eccfe8"));
//        System.out.println(appRequest.getInformationAboutStronghold(500202208));
//        System.out.println(appRequest.getPlayersAchievements(562436344));
//        System.out.println(appRequest.getPlayerPersonalData("b02232ac47788d203c7f45ecaa4806d697eccfe8",562436344));
//        System.out.println(appRequest.getVehicleMasteryDistribution(Distribution.DAMAGE, 1,2,3));
//        System.out.println(appRequest.getVehicleAchievements(562436344));
//        System.out.println(appRequest.getVehicleStatistics(562436344));
//        System.out.println(appRequest.getCrewSkills());
//        System.out.println(appRequest.getCrewQualifications());
//        System.out.println(appRequest.getBadges());
//        System.out.println(appRequest.getModules());
//        System.out.println(Arrays.toString(appRequest.getVehicleConfigurations(1).get("1")));
//        System.out.println(appRequest.getPersonalReserves());
//        System.out.println(appRequest.getPersonalMissions());
//        System.out.println(appRequest.getEquipmentAndConsumables());
//        System.out.println(appRequest.getMaps());
//        System.out.println(appRequest.getTankopediaInformation());
//        System.out.println(appRequest.getAchievements());
//        System.out.println(appRequest.getVehicleCharacteristics(1));
//        System.out.println(appRequest.getVehicles().get("1").toString());
//        System.out.println(appRequest.getPlayers("RawSaurus"));

//        String toChange = """
//                "private.boosters"
//                "private.garage"
//                "private.grouped_contacts"
//                "private.personal_missions"
//                "private.rented"
//                "statistics.epic"
//                "statistics.fallout"
//                "statistics.globalmap_absolute"
//                "statistics.globalmap_champion"
//                "statistics.globalmap_middle"
//                "statistics.random"
//                "statistics.ranked_10x10"
//                "statistics.ranked_15x15"
//                "statistics.ranked_battles"
//                "statistics.ranked_battles_current"
//                "statistics.ranked_battles_previous"
//                "statistics.ranked_season_1"
//                "statistics.ranked_season_2"
//                "statistics.ranked_season_3"
//                """;
//
//        StringBuilder sb = new StringBuilder();
//        boolean flag = false;
//        for(char c : toChange.toCharArray()){
//            if(c == '"'){
//                if(flag) {
//                    c = ',';
//                }
//                flag = !flag;
//            }
//            sb.append(c);
//        }
//        System.out.println(sb.toString().replaceAll("\"", ""));

//        List<Players> list = appRequest.getPlayers("rawsaurus");
//        System.out.println(list.get(0).getAccount_id());
//        System.out.println(list.get(0).getNickname());
        // Tank tank = AppRequest().requestBuilder().findTank().params().fields().build();

//        HttpClient client = HttpClient.newHttpClient();
//        HttpResponse<String> res = null;
//        String applicationId = "743f4a65d003daeb75b7ad2ac49ba541";
//        int accountId = 562436344 ;
//
//        try{
//            HttpRequest request = HttpRequest.newBuilder()
////                    .uri(new URI("https://api.worldoftanks.eu/wot/account/tanks/?application_id=" + applicationId + "&account_id=" + accountId + "," + (accountId+1)))
//                    .uri(new URI("https://api.worldoftanks.eu/wot/account/list/?application_id=" + applicationId + "&search=rawsaurus"))
//                    .build();
//
//            res = client.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(res.body());
//        } catch (URISyntaxException | IOException | InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        players(res);
//        playersVehicles(res);


    }

//    public static void playersVehicles(HttpResponse<String> res){
//        Gson gson = new Gson();
//        CheckStatus checkStatus = gson.fromJson(res.body(), CheckStatus.class);
//        if(checkStatus.getStatus().equals("ok")){
//
//            //of course, I spent entire hour guessing how to make generics work with Gson before finding it in documentation in 2 minutes
//            Type statusType = new TypeToken<OkStatusMap<PlayersVehicles>>(){}.getType();
//            OkStatusMap<PlayersVehicles> status = gson.fromJson(res.body(), statusType);
//
//            System.out.println(status.getStatus() + "\n" + status.getMeta() + "\n" + status.getData());
//            if(status.getStatus().equals("ok")){
//                    System.out.println(status.getData().get("562436344").get(0).getMark_of_mastery() + "\n" + status.getData().get("562436344").get(0).getStatistics());
//            }
//        }else {
//            ErrorStatus errorStatus = gson.fromJson(res.body(), ErrorStatus.class);
//            System.out.println(checkStatus.getStatus());
//            System.out.println(errorStatus.getStatus() + "\n" +  errorStatus.getError().toString());
//        }
//    }

//    public static void players(HttpResponse<String> res){
//        Gson gson = new Gson();
//        CheckStatus checkStatus = gson.fromJson(res.body(), CheckStatus.class);
//        if(checkStatus.getStatus().equals("ok")){
//
//            //of course, I spent entire hour guessing how to make generics work with Gson before finding it in documentation in 2 minutes
//            Type statusType = new TypeToken<OkStatus<Players>>(){}.getType();
//            OkStatus<Players> status = gson.fromJson(res.body(), statusType);
//
////            System.out.println(status.getStatus() + "\n" + status.getMeta() + "\n" + Arrays.toString(status.getData()));
//            System.out.println(Arrays.toString(status.getData()));
////            if(status.getStatus().equals("ok")){
//                for(Players player : status.getData()) {
//                    System.out.println(player.getNickname() + "\n" + player.getAccount_id());
//                }
////            }
//            }else {
//                ErrorStatus errorStatus = gson.fromJson(res.body(), ErrorStatus.class);
//                System.out.println(checkStatus.getStatus());
//                System.out.println(errorStatus.getStatus() + "\n" +  errorStatus.getError().toString());
//            }
//    }
}
