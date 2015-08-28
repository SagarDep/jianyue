package com.troy.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "VIDEO_CACHE".
 */
public class VideoCache {

    private Long id;
    private String result;
    private Integer page;

    public VideoCache() {
    }

    public VideoCache(Long id) {
        this.id = id;
    }

    public VideoCache(Long id, String result, Integer page) {
        this.id = id;
        this.result = result;
        this.page = page;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

}