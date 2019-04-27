package com.ILens.Topcon;

import com.autodesk.client.api.BucketsApi;
import com.autodesk.client.api.DerivativesApi;
import com.autodesk.client.api.ObjectsApi;
import com.autodesk.client.auth.Credentials;
import com.autodesk.client.auth.OAuth2TwoLegged;

public class Global {

    public static final String CLIENT_ID = "BH4OqdzTPLx5x2Yy2UgyaosDBexmKv0E";
    public static final String CLIENT_SECRET = "M39c7c30c157347a";

    public static String BUCKET_KEY = "";

    public static int BUCKET_NUM = 1;

    public static String FILE_NAME = "";

    public static String token = "";

    public static String URN = "";
    public static String base64URN = "";

    public static OAuth2TwoLegged oauth2TwoLegged = null;
    public static Credentials twoLeggedCredentials = null;

    public static final BucketsApi bucketsApi = new BucketsApi();
    public static final ObjectsApi objectsApi = new ObjectsApi();
    public static final DerivativesApi derivativesApi = new DerivativesApi();

}
