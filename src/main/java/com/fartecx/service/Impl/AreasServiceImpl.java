package com.fartecx.service.Impl;

import com.fartecx.config.ExecutionResult;
import com.fartecx.dao.GeoEntityDao;
import com.fartecx.pojo.GeoEntity;
import com.fartecx.pojo.GeoEntityQuery;
import com.fartecx.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AreasServiceImpl implements AreasService {

    @Autowired
    private GeoEntityDao geoEntityDao;

    @Override
    public Map findAreas(String group) {
        GeoEntityQuery geoEntityQuery = new GeoEntityQuery();
        if (group != null && !"".equals(group)) {
            GeoEntityQuery.Criteria criteria = geoEntityQuery.createCriteria();
            criteria.andTypeEqualTo(group);
        }
        List<GeoEntity> geoEntities = geoEntityDao.selectByExample(geoEntityQuery);
        Map map = new HashMap();
        Map geoMap = new HashMap();
        if (geoEntities != null) {
            for (GeoEntity geoEntity : geoEntities) {
                //geo数据
                Map geoAllMap = new HashMap();
                geoAllMap.put("name",geoEntity.getName());
                geoAllMap.put("jsonName",geoEntity.getJsonname());
                geoAllMap.put("color",geoEntity.getColor());
                geoAllMap.put("position",geoEntity.getPosition());
                geoAllMap.put("area", geoEntity.getArea());
                geoMap.put(geoEntity.getJsonname(), geoAllMap);

            }
        }
        map.put("geo", geoMap);

        return map;
    }
}
