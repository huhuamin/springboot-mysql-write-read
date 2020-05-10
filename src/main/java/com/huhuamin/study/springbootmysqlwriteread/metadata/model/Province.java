package com.huhuamin.study.springbootmysqlwriteread.metadata.model;

/**
 *
 * 代码生成器.
 * 数据库表名 UFLY_METADATA_PROVINCE_BASE
 *
 * @mbg.generated do_not_delete_during_merge Sun May 10 11:49:30 CST 2020
 */
public class Province {
    /**
     *   主键
     *
     * 数据库字段名:UFLY_METADATA_PROVINCE_BASE.u_id
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    private String uId;

    /**
     *   上级编码
     *
     * 数据库字段名:UFLY_METADATA_PROVINCE_BASE.u_parent_code
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    private String uParentCode;

    /**
     *   编码
     *
     * 数据库字段名:UFLY_METADATA_PROVINCE_BASE.u_code
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    private String uCode;

    /**
     *   名称
     *
     * 数据库字段名:UFLY_METADATA_PROVINCE_BASE.u_name
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    private String uName;

    /**
     *   首字母
     *
     * 数据库字段名:UFLY_METADATA_PROVINCE_BASE.u_initials
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    private String uInitials;

    /**
     * 数据库字段：主键UFLY_METADATA_PROVINCE_BASE.u_id
     *
     * @return  the value of UFLY_METADATA_PROVINCE_BASE.u_id
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public String getuId() {
        return uId;
    }

    /**
     * 数据库字段：主键UFLY_METADATA_PROVINCE_BASE.u_id
     * @param uId the value for UFLY_METADATA_PROVINCE_BASE.u_id
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 数据库字段：上级编码UFLY_METADATA_PROVINCE_BASE.u_parent_code
     *
     * @return  the value of UFLY_METADATA_PROVINCE_BASE.u_parent_code
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public String getuParentCode() {
        return uParentCode;
    }

    /**
     * 数据库字段：上级编码UFLY_METADATA_PROVINCE_BASE.u_parent_code
     * @param uParentCode the value for UFLY_METADATA_PROVINCE_BASE.u_parent_code
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public void setuParentCode(String uParentCode) {
        this.uParentCode = uParentCode == null ? null : uParentCode.trim();
    }

    /**
     * 数据库字段：编码UFLY_METADATA_PROVINCE_BASE.u_code
     *
     * @return  the value of UFLY_METADATA_PROVINCE_BASE.u_code
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public String getuCode() {
        return uCode;
    }

    /**
     * 数据库字段：编码UFLY_METADATA_PROVINCE_BASE.u_code
     * @param uCode the value for UFLY_METADATA_PROVINCE_BASE.u_code
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public void setuCode(String uCode) {
        this.uCode = uCode == null ? null : uCode.trim();
    }

    /**
     * 数据库字段：名称UFLY_METADATA_PROVINCE_BASE.u_name
     *
     * @return  the value of UFLY_METADATA_PROVINCE_BASE.u_name
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public String getuName() {
        return uName;
    }

    /**
     * 数据库字段：名称UFLY_METADATA_PROVINCE_BASE.u_name
     * @param uName the value for UFLY_METADATA_PROVINCE_BASE.u_name
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * 数据库字段：首字母UFLY_METADATA_PROVINCE_BASE.u_initials
     *
     * @return  the value of UFLY_METADATA_PROVINCE_BASE.u_initials
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public String getuInitials() {
        return uInitials;
    }

    /**
     * 数据库字段：首字母UFLY_METADATA_PROVINCE_BASE.u_initials
     * @param uInitials the value for UFLY_METADATA_PROVINCE_BASE.u_initials
     *
     * @mbg.generated Sun May 10 11:49:30 CST 2020
     */
    public void setuInitials(String uInitials) {
        this.uInitials = uInitials == null ? null : uInitials.trim();
    }
}