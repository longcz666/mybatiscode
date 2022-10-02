package com.blb.demo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 员工表
 * @TableName emp
 */
@TableName(value ="emp")
public class Emp implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String workon;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String idcard;

    /**
     * 
     */
    private Date entrydate;

    /**
     * 工作地址
     */
    private String workaddress;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getWorkon() {
        return workon;
    }

    /**
     * 
     */
    public void setWorkon(String workon) {
        this.workon = workon;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 
     */
    public Date getEntrydate() {
        return entrydate;
    }

    /**
     * 
     */
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    /**
     * 工作地址
     */
    public String getWorkaddress() {
        return workaddress;
    }

    /**
     * 工作地址
     */
    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Emp other = (Emp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkon() == null ? other.getWorkon() == null : this.getWorkon().equals(other.getWorkon()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getEntrydate() == null ? other.getEntrydate() == null : this.getEntrydate().equals(other.getEntrydate()))
            && (this.getWorkaddress() == null ? other.getWorkaddress() == null : this.getWorkaddress().equals(other.getWorkaddress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWorkon() == null) ? 0 : getWorkon().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getEntrydate() == null) ? 0 : getEntrydate().hashCode());
        result = prime * result + ((getWorkaddress() == null) ? 0 : getWorkaddress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workon=").append(workon);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", idcard=").append(idcard);
        sb.append(", entrydate=").append(entrydate);
        sb.append(", workaddress=").append(workaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}