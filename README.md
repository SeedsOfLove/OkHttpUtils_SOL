# OkHttpUtils_SOL
网络请求框架类

## 使用方式
### Step 1. Add the JitPack repository to your build file
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2. Add the dependency
```
dependencies {
        implementation 'com.github.SeedsOfLove:OkHttpUtils_SOL:1.0.3'
	}
```

##封装的功能有：
######get请求（带参）
######post请求（带参、带请求体）
######put请求（带参、带请求体）
######delete请求（带参）
######上传单个文件(包含进度)
######上传list集合文件
######上传map集合文件
######文件下载(包含进度)
######图片下载(实现了图片的压缩)