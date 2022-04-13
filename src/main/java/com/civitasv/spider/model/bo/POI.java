package com.civitasv.spider.model.bo;

import com.civitasv.spider.model.po.PoiPo;

import java.util.List;

public class POI {
    private final Integer status;
    private String info;
    private String infocode;
    private Integer count;
    private List<Info> pois;

    public static class Info {
        public Integer oid;
        public String id; // 唯一id
        public String name; // 名称
        public String type; // 兴趣点类型
        public String typecode; // 兴趣点类型编码
        public String address; // 地址
        public String location; // 经纬度
        public Object tel; // 电话
        public String pname; //  省份名称
        public String cityname; // 城市名称
        public String adname; // 区域名称

        @Override
        public String toString() {
            return "Info{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", typecode='" + typecode + '\'' +
                    ", address=" + address +
                    ", location=" + location +
                    ", tel='" + tel + '\'' +
                    ", pname=" + pname +
                    ", cityname=" + cityname +
                    ", adname=" + adname +
                    '}';
        }

        public PoiPo toPoiPo(Integer jobid){
            return new PoiPo(oid, id, jobid, name, type, typecode, address, location, tel.toString(), pname, cityname, adname);
        }
    }

    public int getStatus() {
        return status;
    }

    public String getInfo() {
        return info;
    }

    public String getInfocode() {
        return infocode;
    }

    public int getCount() {
        return count;
    }

    public List<Info> getPois() {
        return pois;
    }

    public POI(Integer status) {
        this.status = status;
    }

    public POI(Integer status, String info, String infocode, Integer count, List<Info> pois) {
        this.status = status;
        this.info = info;
        this.infocode = infocode;
        this.count = count;
        this.pois = pois;
    }

    @Override
    public String toString() {
        return "POI{" +
                "status=" + status +
                ", info='" + info + '\'' +
                ", infocode='" + infocode + '\'' +
                ", count=" + count +
                ", pois=" + pois +
                '}';
    }
}
