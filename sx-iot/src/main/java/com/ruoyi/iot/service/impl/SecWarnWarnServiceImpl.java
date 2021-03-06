package com.ruoyi.iot.service.impl;/* *
 * @Description:
 * @param $params$
 * @Return: $returns$
 * @开发人员：余新伟
 * @开发单位：湖南农业大学物联网工程专业
 * @Date: 2019/12/26 17:23
 * @开发版本：综合练习V0.1
 */

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.Secenvwarn;
import com.ruoyi.iot.domain.Secwatwarn;
import com.ruoyi.iot.mapper.SecWarnMapper;
import com.ruoyi.iot.service.ISecWarnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecWarnWarnServiceImpl implements ISecWarnService {

    @Autowired
    private SecWarnMapper secWarnMapper;

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectRainSecList() {
        return secWarnMapper.selectRainSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectPmSecList() {
        return secWarnMapper.selectPmSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectTempSecList() {
        return secWarnMapper.selectTempSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectWlvlSecList() {
        return secWarnMapper.selectWlvlSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectHumSecList() {
        return secWarnMapper.selectHumSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectEnvTypeSecList() {
        return secWarnMapper.selectEnvTypeSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secenvwarn> selectWatTypeSecList() {
        return secWarnMapper.selectWatTypeSecList();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secwatwarn> water() {
        return secWarnMapper.water();
    }

    @Override
    @DataSource(value = DataSourceType.SXIOT)
    public List<Secwatwarn> bacsec() {
        return secWarnMapper.bacsec();
    }
}
