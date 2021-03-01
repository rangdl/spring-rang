package com.rang.pojo.entity.movie;

import java.time.LocalDate;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

/**
 * @ClassName MovieDO
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:16
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "movie")
public class MovieDO {

    /**
     * id
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private Integer state;
    private String name;
    private String alternateName;
    private String type;
    private String region;
    private String language;

    private Double score;
    private String duration;
    private String actor;
    private String director;
    private String image;
    private String introduction;
    private String showTime;
    private String updateTime;
    private String url;
    private LocalDate createdTime;
    private LocalDate modifiedTime;

}
