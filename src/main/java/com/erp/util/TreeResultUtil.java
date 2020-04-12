package com.erp.util;

import java.util.List;

public class TreeResultUtil {
    private Integer id;
    private String text;//展示的内容
    private String iconCls;//权限图标
    private String url;
    private List<TreeResultUtil> children;

    public TreeResultUtil(Integer id, String text, String iconCls, String url, List<TreeResultUtil> children) {
        this.id = id;
        this.text = text;
        this.iconCls = iconCls;
        this.url = url;
        this.children = children;
    }
    public TreeResultUtil() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public List<TreeResultUtil> getChildren() {
        return children;
    }

    public void setChildren(List<TreeResultUtil> children) {
        this.children = children;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
