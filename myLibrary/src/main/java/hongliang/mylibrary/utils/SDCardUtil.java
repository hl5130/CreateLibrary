package hongliang.mylibrary.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;

import java.io.File;

/**
 * SD卡工具类
 */
public class SDCardUtil {

    private static final String TAG = SDCardUtil.class.getSimpleName();

    /**
     * 判断SDCard是否存在 [当没有外挂SD卡时，内置ROM也被识别为存在sd卡]
     *
     * @return
     */
    public static boolean hasSDCard() {
        return Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState());
    }

    /**
     * 获取SD卡可用容量
     *
     * @return SD卡可用容量(MB)
     */
    @SuppressWarnings("deprecation")
    public static int getSDCardAvailableSize() {
        // 取得SDCard当前的状态
        String sDCardState = Environment.getExternalStorageState();
        if (sDCardState.equals(Environment.MEDIA_MOUNTED)) {
            // 取得sdcard文件路径
            File pathFile = Environment
                    .getExternalStorageDirectory();
            StatFs statfs = new StatFs(pathFile.getPath());
            // 获取SDCard上每个block的SIZE
            int blockSize = statfs.getBlockSize();
            // 获取可供程序使用的Block的数量
            int availableBlock = statfs.getAvailableBlocks();
            // 计算 SDCard 剩余可用大小MB
            return availableBlock * blockSize / 1024 / 1024;
        }
        return 0;
    }


    /**
     * 获取SD卡容量
     *
     * @return SD卡容量(MB)
     */
    @SuppressWarnings("deprecation")
    public static int getSDCardSize() {
        // 取得SDCard当前的状态
        String sDCardState = Environment.getExternalStorageState();
        if (sDCardState.equals(Environment.MEDIA_MOUNTED)) {
            // 取得sdcard文件路径
            File pathFile = Environment
                    .getExternalStorageDirectory();
            StatFs statfs = new StatFs(pathFile.getPath());
            // 获取SDCard上BLOCK总数
            int totalBlocks = statfs.getBlockCount();
            // 获取SDCard上每个block的SIZE
            int blockSize = statfs.getBlockSize();
            return totalBlocks * blockSize / 1024 / 1024;
        }
        return 0;
    }

    /**
     * 获取SD卡剩余容量
     *
     * @return SD卡剩余容量(MB)
     */
    @SuppressWarnings("deprecation")
    public static int getSDCardFreeSize() {
        // 取得SDCard当前的状态
        String sDCardState = Environment.getExternalStorageState();
        if (sDCardState.equals(Environment.MEDIA_MOUNTED)) {
            // 取得sdcard文件路径
            File pathFile = Environment
                    .getExternalStorageDirectory();
            StatFs statfs = new StatFs(pathFile.getPath());
            // 获取SDCard上每个block的SIZE
            int blockSize = statfs.getBlockSize();
            // 获取剩下的所有Block的数量(包括预留的一般程序无法使用的块)
            int freeBlock = statfs.getFreeBlocks();
            // 计算 SDCard 剩余大小MB
            return freeBlock * blockSize / 1024 / 1024;
        }
        return 0;
    }


    /**
     * 手机内存路径
     */
    public static String getDataPath() {
        return Environment.getDataDirectory().getPath();

    }

    /**
     * 外部储存卡路径
     */
    public static String getSDCardPath() {
        return Environment.getExternalStorageDirectory().getPath();
    }

    /**
     * 打印 SD卡信息
     */
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    public static String printSDCardInfo() {
        SDCardInfo sd = new SDCardInfo();
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            sd.isExist = true;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                File sdcardDir = Environment.getExternalStorageDirectory();
                StatFs sf = new StatFs(sdcardDir.getPath());

                sd.totalBlocks = sf.getBlockCountLong();
                sd.blockByteSize = sf.getBlockSizeLong();

                sd.availableBlocks = sf.getAvailableBlocksLong();
                sd.availableBytes = sf.getAvailableBytes();

                sd.freeBlocks = sf.getFreeBlocksLong();
                sd.freeBytes = sf.getFreeBytes();

                sd.totalBytes = sf.getTotalBytes();
            }
        }
        Log.e(TAG, sd.toString());
        return sd.toString();
    }

    public static class SDCardInfo {
        public boolean isExist;
        public long totalBlocks;
        public long freeBlocks;
        public long availableBlocks;

        public long blockByteSize;

        public long totalBytes;
        public long freeBytes;
        public long availableBytes;

        @Override
        public String toString() {
            return "SDCardInfo{" +
                    "isExist=" + isExist +
                    ", totalBlocks=" + totalBlocks +
                    ", freeBlocks=" + freeBlocks +
                    ", availableBlocks=" + availableBlocks +
                    ", blockByteSize=" + blockByteSize +
                    ", totalBytes=" + totalBytes +
                    ", freeBytes=" + freeBytes +
                    ", availableBytes=" + availableBytes +
                    '}';
        }
    }

}
