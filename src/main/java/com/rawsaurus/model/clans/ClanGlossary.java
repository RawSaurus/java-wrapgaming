package com.rawsaurus.model.clans;

import java.util.Map;

public class ClanGlossary {
    private Map<String, String> clans_roles;

    public Map<String, String> getClans_roles() {
        return clans_roles;
    }

    @Override
    public String toString() {
        return "ClanGlossary{" +
                "clans_roles=" + clans_roles +
                '}';
    }
}
