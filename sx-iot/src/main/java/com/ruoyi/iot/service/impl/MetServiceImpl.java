package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Met;
import com.ruoyi.iot.mapper.MetMapper;
import com.ruoyi.iot.service.IMetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @开发人员: 申超豪
 * @开发单位：湖南农业大学物联网工程专业
 * @Description:
 * @Date:
 */
@Service
public class MetServiceImpl {
    @Autowired
    private MetMapper metMapper;

//    @Override
//    @DataSource(value = DataSourceType.SXIOT)
//    public List<Met> selectMetList(){
//        return metMapper.selectMetList();
//    }
}
