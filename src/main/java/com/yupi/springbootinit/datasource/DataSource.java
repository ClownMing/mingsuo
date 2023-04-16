package com.yupi.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author ClownMing
 * @author ming
 * @description 数据源接口（新接入的数据源必须实现）
 */
public interface DataSource<T> {

    /**
     * 搜索
     */
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}
