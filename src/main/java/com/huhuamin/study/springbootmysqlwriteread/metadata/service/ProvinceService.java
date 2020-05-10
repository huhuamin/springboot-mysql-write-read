package com.huhuamin.study.springbootmysqlwriteread.metadata.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huhuamin.study.springbootmysqlwriteread.annotation.DynamicDataSources;
import com.huhuamin.study.springbootmysqlwriteread.exception.HhhException;
import com.huhuamin.study.springbootmysqlwriteread.json.JsonResult;
import com.huhuamin.study.springbootmysqlwriteread.metadata.mapper.ProvinceMapper;
import com.huhuamin.study.springbootmysqlwriteread.metadata.model.Province;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 表备注:
 *   省
 *
 * 代码生成器.
 * 数据库表名 UFLY_METADATA_PROVINCE_BASE
 *
 * @mbg.generated do_not_delete_during_merge Sun May 10 11:49:30 CST 2020
 */
@Service
@Slf4j
public class ProvinceService {
    @Autowired
    private ProvinceMapper provinceMapper;

    /**
     * UFLY_METADATA_PROVINCE_BASE 分页查询 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public JsonResult<com.github.pagehelper.PageInfo<Province>> page(Province province, Integer pageNum, Integer numPerPage, String sortString) {
        try {
            JsonResult<PageInfo<Province>> jsonResult = new JsonResult(false);
            if (StringUtils.isEmpty(sortString)) {
                sortString = " U_ID DESC ";
            }
            List<Province> list = PageHelper.startPage(pageNum, numPerPage, sortString).doSelectPage(() -> {
                provinceMapper.selectSelectiveList(province);
            });
            PageInfo page = new PageInfo<>(list);
            jsonResult.setSuccess(true);
            jsonResult.setData(page);
            return jsonResult;
        } catch (Exception ex) {
            String msg = "分页查询省";
            log.error(msg + ":" + ex.getMessage(), ex);
            if (ex instanceof HhhException) {
                throw new HhhException(ex.getMessage());
            } else {
                msg = String.format("在%s过程中服务器开小差了,请稍后再试", msg);
                throw new HhhException(msg);
            }
        }
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE 根据主键查询 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public JsonResult<Province> getByProvinceId(String id) {
        try {
            JsonResult<Province> jsonResult = new JsonResult(false);
            Province province = provinceMapper.selectByPrimaryKey(id);
            jsonResult.setSuccess(true);
            jsonResult.setData(province);
            return jsonResult;
        } catch (Exception ex) {
            String msg = "主键查询省";
            log.error(msg + ":" + ex.getMessage(), ex);
            if (ex instanceof HhhException) {
                throw new HhhException(ex.getMessage());
            } else {
                msg = String.format("在%s过程中服务器开小差了,请稍后再试", msg);
                throw new HhhException(msg);
            }
        }
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE   保存 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public JsonResult save(Province province) {
        try {
            JsonResult jsonResult = new JsonResult(false);
            provinceMapper.insertSelective(province);
            jsonResult.setSuccess(true);
            return jsonResult;
        } catch (Exception ex) {
            String msg = "添加省";
            log.error(msg + ":" + ex.getMessage(), ex);
            if (ex instanceof HhhException) {
                throw new HhhException(ex.getMessage());
            } else {
                msg = String.format("在%s过程中服务器开小差了,请稍后再试", msg);
                throw new HhhException(msg);
            }
        }
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE  根据主键动态修改 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    @DynamicDataSources
    public JsonResult update(Province province) {
        try {
//            province.setUpdateTs(new Date());
            JsonResult jsonResult = new JsonResult(false);
            provinceMapper.updateByPrimaryKeySelective(province);
            jsonResult.setSuccess(true);
            return jsonResult;
        } catch (Exception ex) {
            String msg = "修改省";
            log.error(msg + ":" + ex.getMessage(), ex);
            if (ex instanceof HhhException) {
                throw new HhhException(ex.getMessage());
            } else {
                msg = String.format("在%s过程中服务器开小差了,请稍后再试", msg);
                throw new HhhException(msg);
            }
        }
    }
}