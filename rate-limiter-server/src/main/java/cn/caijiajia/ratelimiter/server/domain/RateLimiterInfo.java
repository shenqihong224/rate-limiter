package cn.caijiajia.ratelimiter.server.domain;

import java.util.Date;

public class RateLimiterInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.apps
     *
     * @mbggenerated
     */
    private String apps;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.max_permits
     *
     * @mbggenerated
     */
    private Integer maxPermits;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.rate
     *
     * @mbggenerated
     */
    private Integer rate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.created_at
     *
     * @mbggenerated
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rate_limiter_info.updated_at
     *
     * @mbggenerated
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rate_limiter_info
     *
     * @mbggenerated
     */
    public RateLimiterInfo(Integer id, String name, String apps, Integer maxPermits, Integer rate, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.apps = apps;
        this.maxPermits = maxPermits;
        this.rate = rate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rate_limiter_info
     *
     * @mbggenerated
     */
    public RateLimiterInfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.id
     *
     * @return the value of rate_limiter_info.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.id
     *
     * @param id the value for rate_limiter_info.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.name
     *
     * @return the value of rate_limiter_info.name
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.name
     *
     * @param name the value for rate_limiter_info.name
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.apps
     *
     * @return the value of rate_limiter_info.apps
     * @mbggenerated
     */
    public String getApps() {
        return apps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.apps
     *
     * @param apps the value for rate_limiter_info.apps
     * @mbggenerated
     */
    public void setApps(String apps) {
        this.apps = apps == null ? null : apps.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.max_permits
     *
     * @return the value of rate_limiter_info.max_permits
     * @mbggenerated
     */
    public Integer getMaxPermits() {
        return maxPermits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.max_permits
     *
     * @param maxPermits the value for rate_limiter_info.max_permits
     * @mbggenerated
     */
    public void setMaxPermits(Integer maxPermits) {
        this.maxPermits = maxPermits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.rate
     *
     * @return the value of rate_limiter_info.rate
     * @mbggenerated
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.rate
     *
     * @param rate the value for rate_limiter_info.rate
     * @mbggenerated
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.created_at
     *
     * @return the value of rate_limiter_info.created_at
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.created_at
     *
     * @param createdAt the value for rate_limiter_info.created_at
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rate_limiter_info.updated_at
     *
     * @return the value of rate_limiter_info.updated_at
     * @mbggenerated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rate_limiter_info.updated_at
     *
     * @param updatedAt the value for rate_limiter_info.updated_at
     * @mbggenerated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}