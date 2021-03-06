package org.platform.modules.abstr.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Thing implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** 标识*/
	private Long id = null;
	/** 顶数*/
	private Integer ups = null;
	/** 踩数*/
	private Integer downs = null;
	/** 删除标记*/
	private Boolean deleted = null;
    /** 垃圾标记*/
	private Boolean spam = null;
	/** 创建人标识*/
	private Long creatorId = null;
	/** 创建日期*/
	private Date createTime = null;
	/** DATA数据*/
	private transient List<ThingData> datas = null;
	/** 操作表名*/
	private transient String table = null;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUps() {
		return ups;
	}
	
	public void setUps(Integer ups) {
		this.ups = ups;
	}
	
	public Integer getDowns() {
		return downs;
	}
	
	public void setDowns(Integer downs) {
		this.downs = downs;
	}
	
	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	public Boolean isSpam() {
		return spam;
	}

	public void setSpam(Boolean spam) {
		this.spam = spam;
	}
	
	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public List<ThingData> getDatas() {
		if (null == datas) {
			datas = new ArrayList<ThingData>();
		}
		return datas;
	}

	public void setDatas(List<ThingData> datas) {
		this.datas = datas;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}
	
	public String identity() {
		return getClass().getSimpleName().toLowerCase() + ":" + id;
	}
	
	public void initBasicAttributes() {
		this.setUps(0);
		this.setDowns(0);
		this.setDeleted(false);
		this.setSpam(false);
		this.setCreateTime(new Date());
	}
	
}
