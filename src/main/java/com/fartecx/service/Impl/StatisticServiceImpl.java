package com.fartecx.service.Impl;

import com.fartecx.dao.GeoEntityDao;
import com.fartecx.dao.YearStatisticEntityDao;
import com.fartecx.pojo.GeoEntity;
import com.fartecx.pojo.GeoEntityQuery;
import com.fartecx.pojo.YearStatisticEntity;
import com.fartecx.pojo.YearStatisticEntityQuery;
import com.fartecx.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private YearStatisticEntityDao yearStatisticEntityDao;

    @Autowired
    private GeoEntityDao geoEntityDao;


    @Override
    public Map findStatistic(String group, String region) {
        Map map = new HashMap();
        List list = new ArrayList();
        GeoEntityQuery geoEntityQuery = new GeoEntityQuery();
        GeoEntityQuery.Criteria criteria = geoEntityQuery.createCriteria();
        if (group != null && !"".equals(group)) {
            criteria.andParentEqualTo(group);
        }
        if (region != null && !"".equals(region)) {
            criteria.andCodeEqualTo(region);
        }
        List<GeoEntity> geoEntities = geoEntityDao.selectByExample(geoEntityQuery);
        Map geoMap = new HashMap();
        if (geoEntities != null) {
            for (GeoEntity geoEntity : geoEntities) {
                Map statisticMap = new HashMap();
                //geo数据
                Map geoAllMap = new HashMap();
                geoAllMap.put("name",geoEntity.getName());
                geoAllMap.put("jsonName",geoEntity.getJsonname());
                geoAllMap.put("color",geoEntity.getColor());
                geoAllMap.put("position",geoEntity.getPosition());
                geoMap.put(geoEntity.getCode(), geoAllMap);

                //tongji数据
                YearStatisticEntityQuery yearStatisticEntityQuery = new YearStatisticEntityQuery();
                YearStatisticEntityQuery.Criteria criteria1 = yearStatisticEntityQuery.createCriteria();
                criteria1.andGeoEqualTo(geoEntity.getCode());
                List<YearStatisticEntity> yearStatisticEntities = yearStatisticEntityDao.selectByExample(yearStatisticEntityQuery);
                List statisList = new ArrayList<>();
                if(yearStatisticEntities!=null){
                    for (YearStatisticEntity yearStatisticEntity : yearStatisticEntities) {
                        Map statisticAllMap = new HashMap();
                        statisticAllMap.put("year", yearStatisticEntity.getYear());
                        statisticAllMap.put("chanliang", yearStatisticEntity.getChanliang());
                        statisticAllMap.put("chanzhi", yearStatisticEntity.getChanzhi());
                        statisticAllMap.put("jiage", yearStatisticEntity.getJiage());
                        statisticAllMap.put("jinkou", yearStatisticEntity.getJinkou());
                        statisticAllMap.put("jkchanzhi", yearStatisticEntity.getJkchanzhi());
                        statisticAllMap.put("chukou", yearStatisticEntity.getChukou());
                        statisticAllMap.put("ckchanzhi", yearStatisticEntity.getCkchanzhi());
                        statisticAllMap.put("xiaofei", yearStatisticEntity.getXiaofei());
                        statisticAllMap.put("maolilv", yearStatisticEntity.getMaolilv());
                        statisList.add(statisticAllMap);
                    }
                    statisticMap.put(geoEntity.getCode(), statisList);
                    list.add(statisticMap);
                }
            }
        }



        map.put("tongji", list);
        map.put("geo",geoMap);
        return map;
    }
}
