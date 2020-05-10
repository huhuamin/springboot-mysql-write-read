package com.huhuamin.study.springbootmysqlwriteread.metadata.controller.admin;

import com.huhuamin.study.springbootmysqlwriteread.annotation.DynamicDataSources;
import com.huhuamin.study.springbootmysqlwriteread.config.DynamicDruidConfiguration;
import com.huhuamin.study.springbootmysqlwriteread.json.JsonResult;
import com.huhuamin.study.springbootmysqlwriteread.metadata.model.Province;
import com.huhuamin.study.springbootmysqlwriteread.metadata.service.ProvinceService;
import org.springframework.web.bind.annotation.*;

/**
 * 表备注:
 *   省
 *
 * 代码生成器.
 * 数据库表名 UFLY_METADATA_PROVINCE_BASE
 *
 * @mbg.generated do_not_delete_during_merge Sun May 10 11:49:30 CST 2020
 */
@RestController
@RequestMapping("admin/metadata/province")
public class ProvinceController {
    final ProvinceService provinceService;

    public ProvinceController(ProvinceService provinceService) {
         this.provinceService = provinceService;
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE 分页查询 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    @GetMapping("page")
    public JsonResult<com.github.pagehelper.PageInfo<Province>> page(Province province, @RequestParam(required = false,
            defaultValue = "1" , value = "pageNum" ) Integer pageNum, @RequestParam(required = false, defaultValue = "20" , value = "numPerPage") Integer numPerPage, @RequestParam(required = false, defaultValue = "" , value = "sortString") String sortString) {
        return provinceService.page(province, pageNum, numPerPage, sortString);
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE 根据主键查询 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    @GetMapping("getByProvinceId/{id}")
    public JsonResult<Province> getByProvinceId(@PathVariable("id") String id) {
        return provinceService.getByProvinceId(id);
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE   保存 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    @PostMapping("save")
    @DynamicDataSources(value = DynamicDruidConfiguration.DEFAULT_MASTER)
    public JsonResult save(@RequestBody Province province) {
        return provinceService.save(province);
    }

    /**
     * UFLY_METADATA_PROVINCE_BASE  根据主键动态修改 省信息
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    @PostMapping("update")
    public JsonResult update(@RequestBody Province province) {
        return provinceService.update(province);
    }
}