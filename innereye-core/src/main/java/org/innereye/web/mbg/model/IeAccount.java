package org.innereye.web.mbg.model;

import java.util.Date;

public class IeAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.id
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.avatar
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.nickname
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.password
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.status
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.user_id
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ie_account.createtime
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.id
     *
     * @return the value of ie_account.id
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.id
     *
     * @param id the value for ie_account.id
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.avatar
     *
     * @return the value of ie_account.avatar
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withAvatar(String avatar) {
        this.setAvatar(avatar);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.avatar
     *
     * @param avatar the value for ie_account.avatar
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.nickname
     *
     * @return the value of ie_account.nickname
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withNickname(String nickname) {
        this.setNickname(nickname);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.nickname
     *
     * @param nickname the value for ie_account.nickname
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.account
     *
     * @return the value of ie_account.account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withAccount(String account) {
        this.setAccount(account);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.account
     *
     * @param account the value for ie_account.account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.password
     *
     * @return the value of ie_account.password
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.password
     *
     * @param password the value for ie_account.password
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.status
     *
     * @return the value of ie_account.status
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.status
     *
     * @param status the value for ie_account.status
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.user_id
     *
     * @return the value of ie_account.user_id
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.user_id
     *
     * @param userId the value for ie_account.user_id
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ie_account.createtime
     *
     * @return the value of ie_account.createtime
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public IeAccount withCreatetime(Date createtime) {
        this.setCreatetime(createtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ie_account.createtime
     *
     * @param createtime the value for ie_account.createtime
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ie_account
     *
     * @mbg.generated Wed Oct 18 15:26:03 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", avatar=").append(avatar);
        sb.append(", nickname=").append(nickname);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", userId=").append(userId);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}