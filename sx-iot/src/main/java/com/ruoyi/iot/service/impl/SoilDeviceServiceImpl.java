package com.ruoyi.iot.service.impl;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.iot.domain.SoilDevice;
import com.ruoyi.iot.mapper.SoilDeviceMapper;
import com.ruoyi.iot.service.SoilDeviceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class SoilDeviceServiceImpl implements SoilDeviceService {
    @Autowired
    private SoilDeviceMapper soilDeviceMapper;
    //    查询所有设备情况
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public List<SoilDevice> selectall(){
       return soilDeviceMapper.selectall();
    }
    //    增加设备
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public int add(@Param("did") String did , @Param("dname") String dname , @Param("dstatus") int dstatus , @Param("dv") int dv
            , @Param("dctime") Date dctime , @Param("dfame") Date dftime , @Param("dcname") String dcname , @Param("dfname") String dfname , @Param("note") String note){
        return soilDeviceMapper.add(did, dname, dstatus, dv, dctime, dftime, dcname, dfname, note);
    }

    //    根据ID删除设备
//    public int deletebyid(int did){
//        return soilDeviceMapper.deletebyid(did);
//        }

    //    根据dname id删除设备记录
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public  int deletebyname(@Param("dname") String dname){
        return soilDeviceMapper.deletebyname(dname);

    }
    //  根据ID 查询设备情况
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public SoilDevice selectbyid(String did)
    {
        return soilDeviceMapper.selectbyid(did);
    }
    //    根据地域名查询
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public  SoilDevice selectbyname( String dname)
    {
        return  soilDeviceMapper.selectbyname(dname);
    }
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public List<SoilDevice>selectbynote()
    {
        return soilDeviceMapper.selectbynote();
    }
    @Override
    @DataSource(value = DataSourceType.SXSOIL)
    public List<SoilDevice>selectbyds()
    {
        return soilDeviceMapper.selectbyds();
    }
}
