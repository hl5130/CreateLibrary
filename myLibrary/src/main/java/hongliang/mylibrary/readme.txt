公用的依赖库
    adapter： 适配器
                放入一个公用adapter，统一adapter管理，减少内部代码
    caching： 缓存
                数据库存储方式、SharePreferences存储是、ContentProvider存储、文件存储（存入SDCard）
    https：网络请求
                使用OkHttp

    image：图片处理， 因为图片过大，容易造成OOM

    utils:  工具类，放入一些常用的工具类，例如 字符串处理类，日期处理类，统一日志类

    view: 自定义控件  放入一些常用的控件类
