package com.hzxy.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther:lwq
 * @Date:2019/4/4
 * @Description:com.hzxy.domain.entity
 * @version:1.0
 */
@Data
public class PageInfo<T> implements Serializable {
        // 当前页
        private Integer currentPage = 1;
        // 每页显示的总条数
        private Integer pageSize = 10;
        // 总条数
        private Integer totalNum;
        // 是否有下一页
        private Integer isMore;
        // 总页数
        private Integer totalPage;
        // 开始索引
        private Integer startIndex;
        // 分页结果
        private List<T> items;

        public  PageInfo() {
            super();
        }

        public PageInfo(Integer currentPage, Integer pageSize, Integer totalNum) {
            super();
            this.currentPage = currentPage;
            this.pageSize = pageSize;
            this.totalNum = totalNum;
            this.totalPage = (this.totalNum+this.pageSize-1)/this.pageSize;
            this.startIndex = (this.currentPage-1)*this.pageSize;
            this.isMore = this.currentPage >= this.totalPage?0:1;
        }
}
