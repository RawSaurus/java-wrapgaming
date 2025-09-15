package com.rawsaurus.model.clan_ratings;

import java.util.Map;

public class ClanRatings {
    private int clan_id;
    private String clan_name;
    private String clan_tag;
    private Map<String, String> exclude_reasons;
    private BattlesCountAvg battles_count_avg;
    private BattlesCountAvgDaily battles_count_avg_daily;
    private Efficiency efficiency;
    private FbEloRating fb_elo_rating;
    private FbEloRating10 fb_elo_rating_10;
    private FbEloRating6 fb_elo_rating_6;
    private FbEloRating8 fb_elo_rating_8;
    private GlobalRatingAvg global_rating_avg;
    private GlobalRatingWeightedAvg global_rating_weighted_avg;
    private GmEloRating gm_elo_rating;
    private GmEloRating10 gm_elo_rating_10;
    private GmEloRating6 gm_elo_rating_6;
    private GmEloRating8 gm_elo_rating_8;
    private RatingFort rating_fort;
    private V10l v10l_avg;
    private WinsRatioAvg wins_ratio_avg;

    public int getClan_id() {
        return clan_id;
    }

    public String getClan_name() {
        return clan_name;
    }

    public String getClan_tag() {
        return clan_tag;
    }

    public Map<String, String> getExclude_reasons() {
        return exclude_reasons;
    }

    public BattlesCountAvg getBattles_count_avg() {
        return battles_count_avg;
    }

    public BattlesCountAvgDaily getBattles_count_avg_daily() {
        return battles_count_avg_daily;
    }

    public Efficiency getEfficiency() {
        return efficiency;
    }

    public FbEloRating getFb_elo_rating() {
        return fb_elo_rating;
    }

    public FbEloRating10 getFb_elo_rating_10() {
        return fb_elo_rating_10;
    }

    public FbEloRating6 getFb_elo_rating_6() {
        return fb_elo_rating_6;
    }

    public FbEloRating8 getFb_elo_rating_8() {
        return fb_elo_rating_8;
    }

    public GlobalRatingAvg getGlobal_rating_avg() {
        return global_rating_avg;
    }

    public GlobalRatingWeightedAvg getGlobal_rating_weighted_avg() {
        return global_rating_weighted_avg;
    }

    public GmEloRating getGm_elo_rating() {
        return gm_elo_rating;
    }

    public GmEloRating10 getGm_elo_rating_10() {
        return gm_elo_rating_10;
    }

    public GmEloRating6 getGm_elo_rating_6() {
        return gm_elo_rating_6;
    }

    public GmEloRating8 getGm_elo_rating_8() {
        return gm_elo_rating_8;
    }

    public RatingFort getRating_fort() {
        return rating_fort;
    }

    public V10l getV10l_avg() {
        return v10l_avg;
    }

    public WinsRatioAvg getWins_ratio_avg() {
        return wins_ratio_avg;
    }

    @Override
    public String toString() {
        return "ClanRatings{" +
                "clan_id=" + clan_id +
                ", clan_name='" + clan_name + '\'' +
                ", clan_tag='" + clan_tag + '\'' +
                ", exclude_reasons=" + exclude_reasons +
                ", battles_count_avg=" + battles_count_avg +
                ", battles_count_avg_daily=" + battles_count_avg_daily +
                ", efficiency=" + efficiency +
                ", fb_elo_rating=" + fb_elo_rating +
                ", fb_elo_rating_10=" + fb_elo_rating_10 +
                ", fb_elo_rating_6=" + fb_elo_rating_6 +
                ", fb_elo_rating_8=" + fb_elo_rating_8 +
                ", global_rating_avg=" + global_rating_avg +
                ", global_rating_weighted_avg=" + global_rating_weighted_avg +
                ", gm_elo_rating=" + gm_elo_rating +
                ", gm_elo_rating_10=" + gm_elo_rating_10 +
                ", gm_elo_rating_6=" + gm_elo_rating_6 +
                ", gm_elo_rating_8=" + gm_elo_rating_8 +
                ", rating_fort=" + rating_fort +
                ", v10l_avg=" + v10l_avg +
                ", wins_ratio_avg=" + wins_ratio_avg +
                '}';
    }

    private static class BaseValues{
        private int rank;
        private int rank_delta;
        private double value;

        public int getRank() {
            return rank;
        }

        public int getRank_delta() {
            return rank_delta;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return
                    "rank=" + rank +
                    ", rank_delta=" + rank_delta +
                    ", value=" + value +
                    '}';
        }
    }

    private static class BattlesCountAvg extends BaseValues{

        @Override
        public String toString(){
            return "BattlesCountAvg{" + super.toString();
        }
    }

    private static class BattlesCountAvgDaily extends BaseValues{
        @Override
        public String toString(){
            return "BattlesCountAvgDaily{" + super.toString();
        }
    }

    private static class Efficiency extends BaseValues{
        @Override
        public String toString(){
            return "Efficiency{" + super.toString();
        }
    }

    private static class FbEloRating extends BaseValues{
        @Override
        public String toString(){
            return "FbEloRating{" + super.toString();
        }
    }

    private static class FbEloRating10 extends BaseValues{
        @Override
        public String toString(){
            return "FbEloRating10{" + super.toString();
        }
    }

    private static class FbEloRating6 extends BaseValues{
        @Override
        public String toString(){
            return "FbEloRating6{" + super.toString();
        }
    }

    private static class FbEloRating8 extends BaseValues{
        @Override
        public String toString(){
            return "FbEloRating8{" + super.toString();
        }
    }

    private static class GlobalRatingAvg extends BaseValues{
        @Override
        public String toString(){
            return "GlobalRatingAvg{" + super.toString();
        }
    }

    private static class GlobalRatingWeightedAvg extends BaseValues{
        @Override
        public String toString(){
            return "GlobalRatingWeightedAvg{" + super.toString();
        }
    }

    private static class GmEloRating extends BaseValues{
        @Override
        public String toString(){
            return "GmEloRating{" + super.toString();
        }
    }

    private static class GmEloRating10 extends BaseValues{
        @Override
        public String toString(){
            return "GmEloRating10{" + super.toString();
        }
    }

    private static class GmEloRating6 extends BaseValues{
        @Override
        public String toString(){
            return "GmEloRating6{" + super.toString();
        }
    }

    private static class GmEloRating8 extends BaseValues{
        @Override
        public String toString(){
            return "GmEloRating8{" + super.toString();
        }
    }

    private static class RatingFort extends BaseValues{
        @Override
        public String toString(){
            return "RatingFort{" + super.toString();
        }
    }

    private static class V10l extends BaseValues{
        @Override
        public String toString(){
            return "V10l{" + super.toString();
        }
    }

    private static class WinsRatioAvg extends BaseValues{
        @Override
        public String toString(){
            return "WinsRatioAvg{" + super.toString();
        }
    }
}
