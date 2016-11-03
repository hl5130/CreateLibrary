package hongliang.createlibrary.model;

import java.util.List;

/**
 * Created by Administrator on 2016/10/10.
 *  获取故事的model
 */
public class GetStoryModel {

    /**
     * result : 1
     * msg : 获取数据成功
     * data : [{"id":"6558","story_time":"1475135047","story_info":"我是小波波","pics":["20160929/57ecc6477a9e0.jpg","20160929/57ecc6477c790.jpg","20160929/57ecc6477d284.jpg"],"uid":"4919","lng":"123.74","lat":"23.4","city":"成都","readcount":"2360","comment":"2099","user":{"id":"4919","username":"hoo123","usersex":"1","useremail":"hhgfdfg@qq.com","nickname":"hoo1234","birthday":"1000-01-01","portrait":"20160929/57ed056884ebd.jpg","signature":"111"}},{"id":"7368","story_time":"1475337922","story_info":"国庆真无聊啊！!!!","pics":["20161002/57efdec2335bb.jpg"],"uid":"5271","lng":"104.05201","lat":"30.670542","city":"成都市","readcount":"2075","comment":"12","user":{"id":"5271","username":"sink","usersex":"0","useremail":"aaaa@Sina.com","nickname":"sink","birthday":"1998-05-23","portrait":"20160929/57ecf6b091118.jpg","signature":"诶呀国庆快乐"}},{"id":"6168","story_time":"1475066338","story_info":"this is 啊test","pics":null,"uid":"4919","lng":"18.00","lat":"19.00","city":"北京","readcount":"1718","comment":"52","user":{"id":"4919","username":"hoo123","usersex":"1","useremail":"hhgfdfg@qq.com","nickname":"hoo1234","birthday":"1000-01-01","portrait":"20160929/57ed056884ebd.jpg","signature":"111"}},{"id":"6880","story_time":"1475181723","story_info":"夜不能寐","pics":["20160930/57ed7c9b14e3e.jpg","20160930/57ed7c9b170ca.jpg","20160930/57ed7c9b17698.jpg","20160930/57ed7c9b17e30.jpg"],"uid":"5139","lng":"0.0","lat":"0.0","city":"null","readcount":"482","comment":"8","user":{"id":"5139","username":"qazxsw","usersex":"0","useremail":"395002558@qq.com","nickname":"河童之夏","birthday":"1993-10-28","portrait":"20161008/57f8bb1529f39.jpg","signature":"诺克萨斯"}},{"id":"5178","story_time":"1472026912","story_info":"fool","pics":["20160824/57bd5920e9b66.jpg"],"uid":"4395","lng":"18.00","lat":"19.00","city":"北京","readcount":"442","comment":"53","user":{"id":"4395","username":"\"xiong@qq.com\"","usersex":null,"useremail":null,"nickname":"\"handsomebear\"","birthday":null,"portrait":"20160823/57bc144cb1b76.png","signature":null}},{"id":"5180","story_time":"1472027153","story_info":"chj","pics":["20160824/57bd5a1118ba9.jpg"],"uid":"4406","lng":null,"lat":null,"city":null,"readcount":"212","comment":"14","user":{"id":"4406","username":"hwl12345","usersex":"0","useremail":null,"nickname":"威龙","birthday":"1980-1-29","portrait":"20160825/57bef13c76d66.jpg","signature":null}},{"id":"4127","story_time":"1462008394","story_info":"无法理解的故事！！！","pics":["20160430/57247a4a3dc26.jpg"],"uid":"31","lng":null,"lat":null,"city":"郫县一中","readcount":"157","comment":"43","user":{"id":"31","username":"1","usersex":"1","useremail":"www.1046471692@qq","nickname":"你好","birthday":"From Mars","portrait":"20161006/57f61d081bfd3.jpeg","signature":"hu"}},{"id":"4098","story_time":"1461939917","story_info":"ggyuhhh","pics":["20160429/57236ecd7efee.jpeg"],"uid":"3200","lng":null,"lat":null,"city":"郑州市","readcount":"143","comment":"0","user":{"id":"3200","username":"zf12345","usersex":null,"useremail":null,"nickname":"谁与争锋","birthday":null,"portrait":"20160429/5722eb37a1b3e.png","signature":null}},{"id":"4128","story_time":"1462008725","story_info":"太多的事情,早已无法诠释...","pics":["20160430/57247b95c0916.png"],"uid":"513","lng":null,"lat":null,"city":"郫县一中","readcount":"129","comment":"11","user":{"id":"513","username":"12","usersex":"0","useremail":"1163459047O(∩_∩)O","nickname":"爱你没道理❤","birthday":null,"portrait":"20160430/57247b6a89c86.gif","signature":null}}]
     */

    private int result;
    private String msg;
    /**
     * id : 6558
     * story_time : 1475135047
     * story_info : 我是小波波
     * pics : ["20160929/57ecc6477a9e0.jpg","20160929/57ecc6477c790.jpg","20160929/57ecc6477d284.jpg"]
     * uid : 4919
     * lng : 123.74
     * lat : 23.4
     * city : 成都
     * readcount : 2360
     * comment : 2099
     * user : {"id":"4919","username":"hoo123","usersex":"1","useremail":"hhgfdfg@qq.com","nickname":"hoo1234","birthday":"1000-01-01","portrait":"20160929/57ed056884ebd.jpg","signature":"111"}
     */

    private List<DataBean> data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String story_time;
        private String story_info;
        private String uid;
        private String lng;
        private String lat;
        private String city;
        private String readcount;
        private String comment;
        /**
         * id : 4919
         * username : hoo123
         * usersex : 1
         * useremail : hhgfdfg@qq.com
         * nickname : hoo1234
         * birthday : 1000-01-01
         * portrait : 20160929/57ed056884ebd.jpg
         * signature : 111
         */

        private UserBean user;
        private String[] pics;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getStory_time() {
            return story_time;
        }

        public void setStory_time(String story_time) {
            this.story_time = story_time;
        }

        public String getStory_info() {
            return story_info;
        }

        public void setStory_info(String story_info) {
            this.story_info = story_info;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getReadcount() {
            return readcount;
        }

        public void setReadcount(String readcount) {
            this.readcount = readcount;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String[] getPics() {
            return pics;
        }

        public void setPics(String[] pics) {
            this.pics = pics;
        }

        public static class UserBean {
            private String id;
            private String username;
            private String usersex;
            private String useremail;
            private String nickname;
            private String birthday;
            private String portrait;
            private String signature;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getUsersex() {
                return usersex;
            }

            public void setUsersex(String usersex) {
                this.usersex = usersex;
            }

            public String getUseremail() {
                return useremail;
            }

            public void setUseremail(String useremail) {
                this.useremail = useremail;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }
        }
    }
}
