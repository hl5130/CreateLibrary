package hongliang.createlibrary;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public class Model implements Serializable {

    /**
     * code : 0
     * msg : 成功
     * data : {"id":"b3ee0854-8a91-4865-bf5d-a4c05c13891a","ordercode":"147513756176651","activitytitle":"测试活动（请勿购买）","activityid":"4c3d9ea5-d247-4db8-b7e6-de0ac8aa27c0","pic":"http://source.1000fun.com/bbd1e50e-0cf3-48a7-9927-bc810f617c1b.jpg","payset":"1,2,3,4,5","userRequire":"1,2,3,4","orderitemlist":[{"hdrq":"2016-09-29 00:00:00","cpmc":"测试价格","yjyds":5,"saleprice":0.01,"productname":"测试活动（请勿购买）"}],"business":{"id":"598005c1-831f-44e1-b86a-0f256219c243","name":"小安妮的熊","logo":"http://source.1000fun.com/e8bccb29-df5c-4888-bbaa-0a8aef95fa16.jpg?w=940&imageMogr2/format/webp&h=587","activitySum":"1","fansSum":"2","isFollow":"0","distance":"0","detailaddr":"重庆市渝北区龙山街道大庆村石油小区F区1","manager_phone":"15928918500","des":"你看见了我的小熊熊了吗"},"address":{"id":"f0feb49e-0de9-4153-b20f-ab4984313e55","name":"长兴路","address":"重庆市江北区五里店街道黎明社区黎明社区（长兴路）","latitude":"29.573244","longitude":"106.549880","province":"重庆市","city":"江北区","weather":null},"validate":[{"id":"b3ee0854-8a91-4865-bf5d-a4c05c13891a","title":"测试价格","code":"42023817","qrcode":"http://jiekou.1000fun.com/zxxt-front/qrcode.jsp?code=42023817"}],"codelist":[{"content":"6466496676","type":"了"},{"content":"6694633699","type":"噢"},{"content":"5006964646","type":"噢"},{"content":"6669994646","type":"摸"},{"content":"676666694","type":"噢"}],"shdz":null,"status":"5","orderstatus":"3","shzt":"3","sfkp":"0","amount":"0.05","pay_amount":"0.00","random_reduce_amount":"0.00","qb_amount":"0.05","yhq_amount":"0.00","jf_amount":"0.00","qfd_amount":"0.00","remark":"测试多个身份证","username":"洪亮","usertel":"13896040018","paymethod":"balance","ordertime":"2016-09-29 16:26:01","hdcplx":"1"}
     */

    private int code;
    private String msg;
    /**
     * id : b3ee0854-8a91-4865-bf5d-a4c05c13891a
     * ordercode : 147513756176651
     * activitytitle : 测试活动（请勿购买）
     * activityid : 4c3d9ea5-d247-4db8-b7e6-de0ac8aa27c0
     * pic : http://source.1000fun.com/bbd1e50e-0cf3-48a7-9927-bc810f617c1b.jpg
     * payset : 1,2,3,4,5
     * userRequire : 1,2,3,4
     * orderitemlist : [{"hdrq":"2016-09-29 00:00:00","cpmc":"测试价格","yjyds":5,"saleprice":0.01,"productname":"测试活动（请勿购买）"}]
     * business : {"id":"598005c1-831f-44e1-b86a-0f256219c243","name":"小安妮的熊","logo":"http://source.1000fun.com/e8bccb29-df5c-4888-bbaa-0a8aef95fa16.jpg?w=940&imageMogr2/format/webp&h=587","activitySum":"1","fansSum":"2","isFollow":"0","distance":"0","detailaddr":"重庆市渝北区龙山街道大庆村石油小区F区1","manager_phone":"15928918500","des":"你看见了我的小熊熊了吗"}
     * address : {"id":"f0feb49e-0de9-4153-b20f-ab4984313e55","name":"长兴路","address":"重庆市江北区五里店街道黎明社区黎明社区（长兴路）","latitude":"29.573244","longitude":"106.549880","province":"重庆市","city":"江北区","weather":null}
     * validate : [{"id":"b3ee0854-8a91-4865-bf5d-a4c05c13891a","title":"测试价格","code":"42023817","qrcode":"http://jiekou.1000fun.com/zxxt-front/qrcode.jsp?code=42023817"}]
     * codelist : [{"content":"6466496676","type":"了"},{"content":"6694633699","type":"噢"},{"content":"5006964646","type":"噢"},{"content":"6669994646","type":"摸"},{"content":"676666694","type":"噢"}]
     * shdz : null
     * status : 5
     * orderstatus : 3
     * shzt : 3
     * sfkp : 0
     * amount : 0.05
     * pay_amount : 0.00
     * random_reduce_amount : 0.00
     * qb_amount : 0.05
     * yhq_amount : 0.00
     * jf_amount : 0.00
     * qfd_amount : 0.00
     * remark : 测试多个身份证
     * username : 洪亮
     * usertel : 13896040018
     * paymethod : balance
     * ordertime : 2016-09-29 16:26:01
     * hdcplx : 1
     */

    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String ordercode;
        private String activitytitle;
        private String activityid;
        private String pic;
        private String payset;
        private String userRequire;
        /**
         * id : 598005c1-831f-44e1-b86a-0f256219c243
         * name : 小安妮的熊
         * logo : http://source.1000fun.com/e8bccb29-df5c-4888-bbaa-0a8aef95fa16.jpg?w=940&imageMogr2/format/webp&h=587
         * activitySum : 1
         * fansSum : 2
         * isFollow : 0
         * distance : 0
         * detailaddr : 重庆市渝北区龙山街道大庆村石油小区F区1
         * manager_phone : 15928918500
         * des : 你看见了我的小熊熊了吗
         */

        private BusinessBean business;
        /**
         * id : f0feb49e-0de9-4153-b20f-ab4984313e55
         * name : 长兴路
         * address : 重庆市江北区五里店街道黎明社区黎明社区（长兴路）
         * latitude : 29.573244
         * longitude : 106.549880
         * province : 重庆市
         * city : 江北区
         * weather : null
         */

        private AddressBean address;
        private Object shdz;
        private String status;
        private String orderstatus;
        private String shzt;
        private String sfkp;
        private String amount;
        private String pay_amount;
        private String random_reduce_amount;
        private String qb_amount;
        private String yhq_amount;
        private String jf_amount;
        private String qfd_amount;
        private String remark;
        private String username;
        private String usertel;
        private String paymethod;
        private String ordertime;
        private String hdcplx;
        /**
         * hdrq : 2016-09-29 00:00:00
         * cpmc : 测试价格
         * yjyds : 5
         * saleprice : 0.01
         * productname : 测试活动（请勿购买）
         */

        private List<OrderitemlistBean> orderitemlist;
        /**
         * id : b3ee0854-8a91-4865-bf5d-a4c05c13891a
         * title : 测试价格
         * code : 42023817
         * qrcode : http://jiekou.1000fun.com/zxxt-front/qrcode.jsp?code=42023817
         */

        private List<ValidateBean> validate;
        /**
         * content : 6466496676
         * type : 了
         */

        private List<CodelistBean> codelist;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrdercode() {
            return ordercode;
        }

        public void setOrdercode(String ordercode) {
            this.ordercode = ordercode;
        }

        public String getActivitytitle() {
            return activitytitle;
        }

        public void setActivitytitle(String activitytitle) {
            this.activitytitle = activitytitle;
        }

        public String getActivityid() {
            return activityid;
        }

        public void setActivityid(String activityid) {
            this.activityid = activityid;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getPayset() {
            return payset;
        }

        public void setPayset(String payset) {
            this.payset = payset;
        }

        public String getUserRequire() {
            return userRequire;
        }

        public void setUserRequire(String userRequire) {
            this.userRequire = userRequire;
        }

        public BusinessBean getBusiness() {
            return business;
        }

        public void setBusiness(BusinessBean business) {
            this.business = business;
        }

        public AddressBean getAddress() {
            return address;
        }

        public void setAddress(AddressBean address) {
            this.address = address;
        }

        public Object getShdz() {
            return shdz;
        }

        public void setShdz(Object shdz) {
            this.shdz = shdz;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getOrderstatus() {
            return orderstatus;
        }

        public void setOrderstatus(String orderstatus) {
            this.orderstatus = orderstatus;
        }

        public String getShzt() {
            return shzt;
        }

        public void setShzt(String shzt) {
            this.shzt = shzt;
        }

        public String getSfkp() {
            return sfkp;
        }

        public void setSfkp(String sfkp) {
            this.sfkp = sfkp;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getPay_amount() {
            return pay_amount;
        }

        public void setPay_amount(String pay_amount) {
            this.pay_amount = pay_amount;
        }

        public String getRandom_reduce_amount() {
            return random_reduce_amount;
        }

        public void setRandom_reduce_amount(String random_reduce_amount) {
            this.random_reduce_amount = random_reduce_amount;
        }

        public String getQb_amount() {
            return qb_amount;
        }

        public void setQb_amount(String qb_amount) {
            this.qb_amount = qb_amount;
        }

        public String getYhq_amount() {
            return yhq_amount;
        }

        public void setYhq_amount(String yhq_amount) {
            this.yhq_amount = yhq_amount;
        }

        public String getJf_amount() {
            return jf_amount;
        }

        public void setJf_amount(String jf_amount) {
            this.jf_amount = jf_amount;
        }

        public String getQfd_amount() {
            return qfd_amount;
        }

        public void setQfd_amount(String qfd_amount) {
            this.qfd_amount = qfd_amount;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsertel() {
            return usertel;
        }

        public void setUsertel(String usertel) {
            this.usertel = usertel;
        }

        public String getPaymethod() {
            return paymethod;
        }

        public void setPaymethod(String paymethod) {
            this.paymethod = paymethod;
        }

        public String getOrdertime() {
            return ordertime;
        }

        public void setOrdertime(String ordertime) {
            this.ordertime = ordertime;
        }

        public String getHdcplx() {
            return hdcplx;
        }

        public void setHdcplx(String hdcplx) {
            this.hdcplx = hdcplx;
        }

        public List<OrderitemlistBean> getOrderitemlist() {
            return orderitemlist;
        }

        public void setOrderitemlist(List<OrderitemlistBean> orderitemlist) {
            this.orderitemlist = orderitemlist;
        }

        public List<ValidateBean> getValidate() {
            return validate;
        }

        public void setValidate(List<ValidateBean> validate) {
            this.validate = validate;
        }

        public List<CodelistBean> getCodelist() {
            return codelist;
        }

        public void setCodelist(List<CodelistBean> codelist) {
            this.codelist = codelist;
        }

        public static class BusinessBean {
            private String id;
            private String name;
            private String logo;
            private String activitySum;
            private String fansSum;
            private String isFollow;
            private String distance;
            private String detailaddr;
            private String manager_phone;
            private String des;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getActivitySum() {
                return activitySum;
            }

            public void setActivitySum(String activitySum) {
                this.activitySum = activitySum;
            }

            public String getFansSum() {
                return fansSum;
            }

            public void setFansSum(String fansSum) {
                this.fansSum = fansSum;
            }

            public String getIsFollow() {
                return isFollow;
            }

            public void setIsFollow(String isFollow) {
                this.isFollow = isFollow;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getDetailaddr() {
                return detailaddr;
            }

            public void setDetailaddr(String detailaddr) {
                this.detailaddr = detailaddr;
            }

            public String getManager_phone() {
                return manager_phone;
            }

            public void setManager_phone(String manager_phone) {
                this.manager_phone = manager_phone;
            }

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }
        }

        public static class AddressBean {
            private String id;
            private String name;
            private String address;
            private String latitude;
            private String longitude;
            private String province;
            private String city;
            private Object weather;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public Object getWeather() {
                return weather;
            }

            public void setWeather(Object weather) {
                this.weather = weather;
            }
        }

        public static class OrderitemlistBean {
            private String hdrq;
            private String cpmc;
            private int yjyds;
            private double saleprice;
            private String productname;

            public String getHdrq() {
                return hdrq;
            }

            public void setHdrq(String hdrq) {
                this.hdrq = hdrq;
            }

            public String getCpmc() {
                return cpmc;
            }

            public void setCpmc(String cpmc) {
                this.cpmc = cpmc;
            }

            public int getYjyds() {
                return yjyds;
            }

            public void setYjyds(int yjyds) {
                this.yjyds = yjyds;
            }

            public double getSaleprice() {
                return saleprice;
            }

            public void setSaleprice(double saleprice) {
                this.saleprice = saleprice;
            }

            public String getProductname() {
                return productname;
            }

            public void setProductname(String productname) {
                this.productname = productname;
            }
        }

        public static class ValidateBean {
            private String id;
            private String title;
            private String code;
            private String qrcode;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getQrcode() {
                return qrcode;
            }

            public void setQrcode(String qrcode) {
                this.qrcode = qrcode;
            }
        }

        public static class CodelistBean {
            private String content;
            private String type;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
