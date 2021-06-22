package com.bluewater.okhttputilslib;

import java.io.File;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;

/**
 * 网络请求框架类（okhttp进一步封装）
 */
public class OkhttpUtil
{
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_DELETE = "DELETE";

    public static final String FILE_TYPE_FILE = "file/*";
    public static final String FILE_TYPE_IMAGE = "image/*";
    public static final String FILE_TYPE_AUDIO = "audio/*";
    public static final String FILE_TYPE_VIDEO = "video/*";

    /*###########################################################
    ---------------------------GET-----------------------------
    ###########################################################*/

    /**
     * get请求
     *
     * @param url：url
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpGet(String url, CallBackUtil callBack)
    {
        okHttpGet(url, null, null, callBack);
    }

    /**
     * get请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpGet(String url, Map<String, String> paramsMap, CallBackUtil callBack)
    {
        okHttpGet(url, paramsMap, null, callBack);
    }

    /**
     * get请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpGet(String url, Map<String, String> paramsMap, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_GET, url, paramsMap, 0, 0, 0, headerMap, null, callBack).execute();
    }

    /**
     * get请求，可以传递参数（含超时）
     * @param url
     * @param paramsMap
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param callBack
     */
    public static void okHttpGet(String url, Map<String, String> paramsMap, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_GET, url, paramsMap, connectTimeout, writeTimeout, readTimeout, headerMap, null, callBack).execute();
    }

    /**
     * get请求，可以传递参数（拦截器）
     * @param url
     * @param paramsMap
     * @param interceptor
     * @param headerMap
     * @param callBack
     */
    public static void okHttpGet(String url, Map<String, String> paramsMap, Map<String, String> headerMap, Interceptor interceptor, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_GET, url, paramsMap, 0, 0, 0, headerMap, interceptor, callBack).execute();
    }

    /**
     * get请求，可以传递参数（含超时、拦截器）
     * @param url
     * @param paramsMap
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param callBack
     */
    public static void okHttpGet(String url, Map<String, String> paramsMap, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, Interceptor interceptor, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_GET, url, paramsMap, connectTimeout, writeTimeout, readTimeout, headerMap, interceptor, callBack).execute();
    }

    /*###########################################################
    ---------------------------GET END---------------------------
    ###########################################################*/


    /*###########################################################
    ---------------------------POST-----------------------------
    ###########################################################*/

    /**
     * post请求
     *
     * @param url：url
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPost(String url, CallBackUtil callBack)
    {
        okHttpPost(url, null, callBack);
    }

    /**
     * post请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPost(String url, Map<String, String> paramsMap, CallBackUtil callBack)
    {
        okHttpPost(url, paramsMap, null, callBack);
    }

    /**
     * post请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPost(String url, Map<String, String> paramsMap, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, 0, 0, 0, headerMap, null, callBack).execute();
    }

    /**
     * post请求，可以传递参数（含超时）
     *
     * @param url
     * @param paramsMap
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param callBack
     */
    public static void okHttpPost(String url, Map<String, String> paramsMap, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, connectTimeout, writeTimeout, readTimeout, headerMap, null, callBack).execute();
    }

    /**
     * post请求，可以传递参数（含拦截器）
     *
     * @param url
     * @param paramsMap
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPost(String url, Map<String, String> paramsMap, Map<String, String> headerMap, Interceptor interceptor, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, 0, 0, 0, headerMap, interceptor, callBack).execute();
    }

    /**
     * post请求，可以传递参数（含超时、拦截器）
     *
     * @param url
     * @param paramsMap
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPost(String url, Map<String, String> paramsMap, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, Interceptor interceptor, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, connectTimeout, writeTimeout, readTimeout, headerMap, interceptor, callBack).execute();
    }

    /*###########################################################
    ---------------------------POST END--------------------------
    ###########################################################*/


    /*###########################################################
    ---------------------------PUT-----------------------------
    ###########################################################*/

    /**
     * put请求
     *
     * @param url：url
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPut(String url, CallBackUtil callBack)
    {
        okHttpPut(url, null, callBack);
    }

    /**
     * put请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPut(String url, Map<String, String> paramsMap, CallBackUtil callBack)
    {
        okHttpPut(url, paramsMap, null, callBack);
    }

    /**
     * put请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPut(String url, Map<String, String> paramsMap, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, paramsMap, 0, 0, 0, headerMap, null, callBack).execute();
    }

    /**
     * put请求，可以传递参数（含超时）
     *
     * @param url
     * @param paramsMap
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param callBack
     */
    public static void okHttpPut(String url, Map<String, String> paramsMap, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, paramsMap, connectTimeout, writeTimeout, readTimeout, headerMap, null, callBack).execute();
    }

    /**
     * put请求，可以传递参数（含拦截器）
     *
     * @param url
     * @param paramsMap
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPut(String url, Map<String, String> paramsMap, Map<String, String> headerMap, Interceptor interceptor,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, paramsMap, 0, 0, 0, headerMap, interceptor, callBack).execute();
    }

    /**
     * put请求，可以传递参数（含超时、拦截器）
     *
     * @param url
     * @param paramsMap
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPut(String url, Map<String, String> paramsMap, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, Interceptor interceptor,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, paramsMap, connectTimeout, writeTimeout, readTimeout, headerMap, interceptor, callBack).execute();
    }

    /*###########################################################
    ---------------------------PUT END--------------------------
    ###########################################################*/


    /*###########################################################
    ---------------------------DELETE----------------------------
    ###########################################################*/

    /**
     * delete请求
     *
     * @param url：url
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpDelete(String url, CallBackUtil callBack)
    {
        okHttpDelete(url, null, callBack);
    }

    /**
     * delete请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpDelete(String url, Map<String, String> paramsMap, CallBackUtil callBack)
    {
        okHttpDelete(url, paramsMap, null, callBack);
    }

    /**
     * delete请求，可以传递参数
     *
     * @param url：url
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpDelete(String url, Map<String, String> paramsMap, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_DELETE, url, paramsMap, 0, 0, 0, headerMap, null, callBack).execute();
    }

    /*###########################################################
    --------------------------DELETE END-------------------------
    ###########################################################*/


    /*###########################################################
    -------------------------POST 含请求体-------------------------
    ###########################################################*/
    /**
     * post请求，可以传递请求体
     *
     * @param url：url
     * @param jsonStr：json格式的键值对请求体
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPostJson(String url, String jsonStr, CallBackUtil callBack)
    {
        okHttpPostJson(url, jsonStr, null, callBack);
    }

    /**
     * post请求，可以传递请求体
     *
     * @param url：url
     * @param jsonStr：json格式的键值对请求体
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPostJson(String url, String jsonStr, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, jsonStr, 0, 0, 0, headerMap, null, callBack).execute();
    }

    /**
     * post请求，可以传递请求体（含超时）
     *
     * @param url
     * @param jsonStr
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param callBack
     */
    public static void okHttpPostJson(String url, String jsonStr, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, jsonStr, connectTimeout, writeTimeout, readTimeout, headerMap, null, callBack).execute();
    }

    /**
     * post请求，可以传递请求体（含拦截器）
     *
     * @param url
     * @param jsonStr
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPostJson(String url, String jsonStr, Map<String, String> headerMap, Interceptor interceptor,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, jsonStr, 0, 0, 0, headerMap, interceptor, callBack).execute();
    }

    /**
     * post请求，可以传递请求体（含超时、拦截器）
     *
     * @param url
     * @param jsonStr
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPostJson(String url, String jsonStr, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, Interceptor interceptor,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, jsonStr, connectTimeout, writeTimeout, readTimeout, headerMap, interceptor, callBack).execute();
    }

    /*###########################################################
    -----------------------POST 含请求体 END----------------------
    ###########################################################*/


    /*###########################################################
    -------------------------POST 文件上传-------------------------
    ###########################################################*/
    /**
     * post请求，上传单个文件
     *
     * @param url：url
     * @param file：File对象
     * @param fileKey：上传参数时file对应的键
     * @param fileType：File类型，是image，video，audio，file
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。还可以重写onProgress方法，得到上传进度
     */
    public static void okHttpUploadFile(String url, File file, String fileKey, String fileType, CallBackUtil callBack)
    {
        okHttpUploadFile(url, file, fileKey, fileType, null, callBack);
    }

    /**
     * post请求，上传单个文件
     *
     * @param url：url
     * @param file：File对象
     * @param fileKey：上传参数时file对应的键
     * @param fileType：File类型，是image，video，audio，file
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。还可以重写onProgress方法，得到上传进度
     */
    public static void okHttpUploadFile(String url, File file, String fileKey, String fileType, Map<String, String> paramsMap, CallBackUtil callBack)
    {
        okHttpUploadFile(url, file, fileKey, fileType, paramsMap, null, callBack);
    }

    /**
     * post请求，上传单个文件
     *
     * @param url：url
     * @param file：File对象
     * @param fileKey：上传参数时file对应的键
     * @param fileType：File类型，是image，video，audio，file
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。还可以重写onProgress方法，得到上传进度
     */
    public static void okHttpUploadFile(String url, File file, String fileKey, String fileType, Map<String, String> paramsMap, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, file, fileKey, fileType, headerMap, callBack).execute();
    }

    /**
     * post请求，上传多个文件，以list集合的形式
     *
     * @param url：url
     * @param fileList：集合元素是File对象
     * @param fileKey：上传参数时fileList对应的键
     * @param fileType：File类型，是image，video，audio，file
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpUploadListFile(String url, List<File> fileList, String fileKey, String fileType, CallBackUtil callBack)
    {
        okHttpUploadListFile(url, null, fileList, fileKey, fileType, callBack);
    }

    /**
     * post请求，上传多个文件，以list集合的形式
     *
     * @param url：url
     * @param fileList：集合元素是File对象
     * @param fileKey：上传参数时fileList对应的键
     * @param fileType：File类型，是image，video，audio，file
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpUploadListFile(String url, Map<String, String> paramsMap, List<File> fileList, String fileKey, String fileType, CallBackUtil callBack)
    {
        okHttpUploadListFile(url, paramsMap, fileList, fileKey, fileType, null, callBack);
    }

    /**
     * post请求，上传多个文件，以list集合的形式
     *
     * @param url：url
     * @param fileList：集合元素是File对象
     * @param fileKey：上传参数时fileList对应的键
     * @param fileType：File类型，是image，video，audio，file
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpUploadListFile(String url, Map<String, String> paramsMap, List<File> fileList, String fileKey, String fileType, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, fileList, fileKey, fileType, headerMap, callBack).execute();
    }

    /**
     * post请求，上传多个文件，以map集合的形式
     *
     * @param url：url
     * @param fileMap：集合key是File对象对应的键，集合value是File对象
     * @param fileType：File类型，是image，video，audio，file
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpUploadMapFile(String url, Map<String, File> fileMap, String fileType, CallBackUtil callBack)
    {
        okHttpUploadMapFile(url, fileMap, fileType, null, callBack);
    }

    /**
     * post请求，上传多个文件，以map集合的形式
     *
     * @param url：url
     * @param fileMap：集合key是File对象对应的键，集合value是File对象
     * @param fileType：File类型，是image，video，audio，file
     * @param paramsMap：map集合，封装键值对参数
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpUploadMapFile(String url, Map<String, File> fileMap, String fileType, Map<String, String> paramsMap, CallBackUtil callBack)
    {
        okHttpUploadMapFile(url, fileMap, fileType, paramsMap, null, callBack);
    }

    /**
     * post请求，上传多个文件，以map集合的形式
     *
     * @param url：url
     * @param fileMap：集合key是File对象对应的键，集合value是File对象
     * @param fileType：File类型，是image，video，audio，file
     * @param paramsMap：map集合，封装键值对参数
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpUploadMapFile(String url, Map<String, File> fileMap, String fileType, Map<String, String> paramsMap, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_POST, url, paramsMap, fileMap, fileType, headerMap, callBack).execute();
    }

    /*###########################################################
    ----------------------POST 文件上传 END-----------------------
    ###########################################################*/


    /*###########################################################
    ------------------------- 文件下载 -------------------------
    ###########################################################*/
    /**
     * 下载文件,不带参数
     */
    public static void okHttpDownloadFile(String url, CallBackUtil.CallBackFile callBack)
    {
        okHttpDownloadFile(url, null, callBack);
    }

    /**
     * 下载文件,带参数
     */
    public static void okHttpDownloadFile(String url, Map<String, String> paramsMap, CallBackUtil.CallBackFile callBack)
    {
        okHttpGet(url, paramsMap, null, callBack);
    }

    /*###########################################################
    ------------------------- 文件下载 END-------------------------
    ###########################################################*/


    /*###########################################################
    ------------------------- 加载图片 -------------------------
    ###########################################################*/
    /**
     * 加载图片
     */
    public static void okHttpGetBitmap(String url, CallBackUtil.CallBackBitmap callBack)
    {
        okHttpGetBitmap(url, null, callBack);
    }

    /**
     * 加载图片，带参数
     */
    public static void okHttpGetBitmap(String url, Map<String, String> paramsMap, CallBackUtil.CallBackBitmap callBack)
    {
        okHttpGet(url, paramsMap, null, callBack);
    }

    /*###########################################################
    ------------------------- 加载图片 END-------------------------
    ###########################################################*/


    /*###################################### 参考上面的事例 #########################################*/


    /*###########################################################
    ------------------------- PUT 含请求体-------------------------
    ###########################################################*/

    /**
     * put请求，可以传递请求体
     *
     * @param url：url
     * @param jsonStr：json格式的键值对请求体
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPutJson(String url, String jsonStr, CallBackUtil callBack)
    {
        okHttpPutJson(url, jsonStr, null, callBack);
    }

    /**
     * put请求，可以传递请求体
     *
     * @param url：url
     * @param jsonStr：json格式的键值对请求体
     * @param headerMap：map集合，封装请求头键值对
     * @param callBack：回调接口，onFailure方法在请求失败时调用，onResponse方法在请求成功后调用，这两个方法都执行在UI线程。
     */
    public static void okHttpPutJson(String url, String jsonStr, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, jsonStr, 0, 0, 0, headerMap, null, callBack).execute();
    }

    /**
     * put请求，可以传递请求体（含超时）
     *
     * @param url
     * @param jsonStr
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param callBack
     */
    public static void okHttpPutJson(String url, String jsonStr, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, jsonStr, connectTimeout, writeTimeout, readTimeout, headerMap, null, callBack).execute();
    }

    /**
     * put请求，可以传递请求体（含拦截器）
     *
     * @param url
     * @param jsonStr
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPutJson(String url, String jsonStr, Map<String, String> headerMap, Interceptor interceptor,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, jsonStr, 0, 0, 0, headerMap, interceptor, callBack).execute();
    }

    /**
     * put请求，可以传递请求体（含超时、拦截器）
     *
     * @param url
     * @param jsonStr
     * @param connectTimeout
     * @param writeTimeout
     * @param readTimeout
     * @param headerMap
     * @param interceptor
     * @param callBack
     */
    public static void okHttpPutJson(String url, String jsonStr, long connectTimeout, long writeTimeout, long readTimeout, Map<String, String> headerMap, Interceptor interceptor,  CallBackUtil callBack)
    {
        new RequestUtil(METHOD_PUT, url, jsonStr, connectTimeout, writeTimeout, readTimeout, headerMap, interceptor, callBack).execute();
    }

    /*###########################################################
    ----------------------- PUT 含请求体 END-----------------------
    ###########################################################*/





}
