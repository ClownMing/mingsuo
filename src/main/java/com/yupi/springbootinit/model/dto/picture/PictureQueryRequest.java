package com.yupi.springbootinit.model.dto.picture;

import com.yupi.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ClownMing
 * @version 1.0
 * @description TODO
 * @date 2023/4/12 19:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PictureQueryRequest  extends PageRequest {

    /**
     * 搜索词
     */
    private String searchText;

    private static final long serialVersionUID = 1L;
}
