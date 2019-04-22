package io.intelehealth.client.utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    // Shared preferences file name
    private static final String PREF_NAME = "Intelehealth";
    private static final String VISIT_ID = "visitID";
    private static final String BASE_URL = "base_url";
    private static final String ENCODED = "encoded";
    private static final String PULL_EXECUTED_TIME = "pullexecutedtime";
    public static final String KEY_PREF_SETUP_COMPLETE = "setup";
    private static final String APP_LANGUAGE = "Language";
    private static final String SESSION_ID = "sessionid";
    private static final String CREATOR_ID = "creatorid";
    private static final String PROVIDER_ID = "providerid";
    private static final String CHWNAME = "chwname";


    // LogCat tag
    private static String TAG = SessionManager.class.getSimpleName();
    // Shared Preferences
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;
    // Shared pref mode
    private int PRIVATE_MODE = 0;

    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }


    public String getVisitId() {
        return pref.getString(VISIT_ID, null);
    }

    public void setVisitId(String token) {
        editor.putString(VISIT_ID, token);
        editor.commit();
    }

    public String getBaseUrl() {
        return pref.getString(BASE_URL, null);
    }

    public void setBaseUrl(String baseUrl) {
        editor.putString(BASE_URL, baseUrl);
        editor.commit();
    }

    public String getEncoded() {
        return pref.getString(ENCODED, null);
    }

    public void setEncoded(String encoded) {
        editor.putString(ENCODED, encoded);
        editor.commit();
    }

    public String getPullExcutedTime() {
        return pref.getString(PULL_EXECUTED_TIME, "2006-08-22 22:21:48 ");
    }

    public void setPullExcutedTime(String pullExcutedTime) {
        editor.putString(PULL_EXECUTED_TIME, pullExcutedTime);
        editor.commit();
    }

    public String getAppLanguage() {
        return pref.getString(APP_LANGUAGE, "");
    }

    public void setAppLanguage(String pullExcutedTime) {
        editor.putString(APP_LANGUAGE, pullExcutedTime);
        editor.commit();
    }

    public boolean isSetupComplete() {
        return pref.getBoolean(KEY_PREF_SETUP_COMPLETE, false);
    }

    public void setSetupComplete(Boolean setupComplete) {
        editor.putBoolean(KEY_PREF_SETUP_COMPLETE, setupComplete);
        editor.commit();
    }

    public String getSessionID() {
        return pref.getString(SESSION_ID, "");
    }

    public void setSessionID(String sessionID) {
        editor.putString(SESSION_ID, sessionID);
        editor.commit();
    }

    public String getProviderID() {
        return pref.getString(PROVIDER_ID, "");
    }

    public void setProviderID(String providerID) {
        editor.putString(PROVIDER_ID, providerID);
        editor.commit();
    }

    public String getCreatorID() {
        return pref.getString(CREATOR_ID, "");
    }

    public void setCreatorID(String creatorID) {
        editor.putString(CREATOR_ID, creatorID);
        editor.commit();
    }

    public String getChwname() {
        return pref.getString(CHWNAME, "");
    }

    public void setChwname(String chwname) {
        editor.putString(CHWNAME, chwname);
        editor.commit();
    }
}
