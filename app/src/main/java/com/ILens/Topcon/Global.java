package com.ILens.Topcon;

import com.autodesk.client.api.BucketsApi;
import com.autodesk.client.api.DerivativesApi;
import com.autodesk.client.api.ObjectsApi;
import com.autodesk.client.auth.Credentials;
import com.autodesk.client.auth.OAuth2TwoLegged;

public class Global {

    public static final String CLIENT_ID = "PfR3TSEv6odPBcUyf44E7epgfAw75T1M";
    public static final String CLIENT_SECRET = "3QKI6yGwEyKvOcPO";

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
