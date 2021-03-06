/**
 * *****************************************************
 * Copyright (C) Dayan techology Co.ltd - All Rights Reserved
 *
 * This file is part of Dayan techology Co.ltd property.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 ******************************************************
 */
package model;

/**
 *
 * @author zhanghj
 */
public class WechatMedia {
    	// 媒体文件类型
	private String type;
	// 媒体文件标识或缩略图的媒体文件标识
	private String mediaId;
	// 媒体文件上传的时间
	private int createdAt;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public int getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}
}
